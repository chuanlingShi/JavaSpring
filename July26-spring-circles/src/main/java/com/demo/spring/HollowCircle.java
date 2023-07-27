package com.demo.spring;

import org.springframework.stereotype.Component;

@Component("hollowCircle")
public class HollowCircle implements Circle{

    @Override
    public void draw() {
        System.out.println("Hollow circle");
    }
}
