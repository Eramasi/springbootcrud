package com.app.springbootcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.springbootcrud.entity.Product;
import com.app.springbootcrud.repositry.ProductRepositry;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepositry prodrepositry;
	
	
	public Product saveProduct(Product product)
	{
		return prodrepositry.save(product);
	}
	
	public List<Product> saveProducts(List<Product> products)
	{
		return prodrepositry.saveAll(products);
	}
	
	public List<Product> getProducts()
	{
		return prodrepositry.findAll();
	}
	
	public Product getProductById(int id) {
		return prodrepositry.findById(id).orElse(null);
	}
	
	public String deleteProduct(int id)
	{
		prodrepositry.deleteById(id);
		return "Product removed "+ id;
	}
	
	public Product updateProduct(Product product)
	{
		Product existingProduct=prodrepositry.findById(product.getPid()).orElse(null);
		existingProduct.setPname(product.getPname());
		existingProduct.setPcost(product.getPcost());
		
		return prodrepositry.save(existingProduct);
		
	}
	
	
}
