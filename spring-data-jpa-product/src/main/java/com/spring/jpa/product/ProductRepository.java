package com.spring.jpa.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByProdName(String name);
    List<Product> findByCategory(String category);

    List<Product> findByPriceBetween(double priceFrom, double priceTo);
}
