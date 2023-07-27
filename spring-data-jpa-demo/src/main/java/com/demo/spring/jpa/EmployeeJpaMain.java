package com.demo.spring.jpa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeJpaMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(EmployeeJpaConfig.class);
        EmployeeService service = configApplicationContext.getBean(EmployeeService.class);
//        service.addEmployeeRecords();
//        service.findByName("Anna");
//        service.findByJob("Recruiter");
        service.findBySalaryGreaterThan(3500);
        configApplicationContext.close();
    }
}
