package com.demo.spring.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table
public class Employee {
    @Id
    private int empId;
    @Column
    private String name;
    @Column
    private String job;
    @Column
    private LocalDate joiningDate;
    @Column
    private double salary;

}
