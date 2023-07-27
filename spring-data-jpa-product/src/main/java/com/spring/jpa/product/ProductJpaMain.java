package com.spring.jpa.product;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductJpaMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(ProductJpaConfig.class);
        ProductService service = configApplicationContext.getBean(ProductService.class);

//        service.addProducts();
        service.findByCategory("Video Game");
        service.findByProdName("Skirt");
        service.findByPriceBetween(100, 500);
        configApplicationContext.close();
    }
}
