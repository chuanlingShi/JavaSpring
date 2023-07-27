package com.spring.jpa.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table
public class Product {
    @Id
    private int prodId;

    @Column
    private String prodName;
    @Column
    private double price;
    @Column
    private String category;

    @Column
    private int stock;

}
