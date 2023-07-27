package com.demo.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public void addEmployeeRecords() {
        List<Employee> employeeList = Arrays.asList(
                new Employee(101, "Jay", "Manager", LocalDate.of(2018, 10, 2), 4000),
                new Employee(102, "Chou", "Recruiter", LocalDate.of(2018, 11, 7), 3000),
                new Employee(103, "Anna", "Recruiter", LocalDate.of(2019, 2, 10), 3200),
                new Employee(104, "Wang", "Developer", LocalDate.of(2020, 8, 15), 5000)
        );
        repository.saveAll(employeeList);
    }

    public void findByName(String name) {
        Employee employee = repository.findByName(name);
        System.out.println("employee: " + employee);
    }

    public void findByJob(String job) {
        repository.findByJob(job).forEach(System.out::println);
    }

    public void findBySalaryGreaterThan(int salary) {
        repository.findBySalaryGreaterThan(salary).forEach(System.out::println);
    }
}
