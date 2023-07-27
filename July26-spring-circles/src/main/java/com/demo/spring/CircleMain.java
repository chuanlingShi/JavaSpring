package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircleMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CircleConfig.class);
        CircleService circleService = context.getBean(CircleService.class);
        circleService.draw();
    }
}
