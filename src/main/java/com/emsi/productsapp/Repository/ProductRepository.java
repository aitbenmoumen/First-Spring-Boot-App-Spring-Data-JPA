package com.emsi.productsapp.Repository;

import com.emsi.productsapp.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
