package com.emsi.productsapp.Repository;

import com.emsi.productsapp.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByNameContains(String category);
    List<Product> findByPriceGreaterThan(Double price);

    @Query("select p from Product p where p.name like :x")
    List<Product> search(@Param("x") String mc);

    @Query("select p from Product p where p.price > :x")
    List<Product> searchPrice(@Param("x") Double price);
}
