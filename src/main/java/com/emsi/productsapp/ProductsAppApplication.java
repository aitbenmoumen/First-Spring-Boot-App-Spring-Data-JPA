package com.emsi.productsapp;

import com.emsi.productsapp.Entities.Product;
import com.emsi.productsapp.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProductsAppApplication implements CommandLineRunner {
	@Autowired // injection auto
	ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProductsAppApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		productRepository.save(new Product(null, "Computer", 5500, 10));
		productRepository.save(new Product(null, "Printer", 3500, 10));
		productRepository.save(new Product(null, "Smart phone", 4000, 4));
		productRepository.findAll().forEach(System.out::println);
		Product product = productRepository.findById(Long.valueOf(1)).get();
		System.out.println("************");
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println(product.getQuantity());
		System.out.println("************");

		List<Product> productList = productRepository.findByNameContains("C");
		productList.forEach(System.out::println);

	}
}
