package com.spring.jpa.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public void addProducts() {
        List<Product> products = Arrays.asList(
                new Product(101, "Apple watch",  380.99, "Digital Device", 59),
                new Product(102, "Skirt", 69.50, "Clothing", 28),
                new Product(103, "Nintendo Switch", 299.00, "Digital Device", 30),
                new Product(104, "Mario Kart 8 Deluxe", 49.00, "Video Game", 50),
                new Product(105, "The Legend of Zelda: Tears of the Kingdom", 58.99, "Video Game", 25),
                new Product(105, "Minecraft", 29.88, "Video Game", 19)
        );
        repository.saveAll(products);
    }
    public void findByProdName(String name) {
        System.out.println(repository.findByProdName(name));
    }
    public void findByCategory(String category) {
        repository.findByCategory(category).forEach(System.out::println);
    }

    public void findByPriceBetween(double priceFrom, double priceTo) {
        repository.findByPriceBetween(priceFrom, priceTo).forEach(System.out::println);
    }


}
