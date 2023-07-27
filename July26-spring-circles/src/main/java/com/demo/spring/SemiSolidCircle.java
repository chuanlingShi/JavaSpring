package com.demo.spring;

import org.springframework.stereotype.Component;

@Component("semisolidCircle")
public class SemiSolidCircle implements Circle{

    @Override
    public void draw() {
        System.out.println("Semi solid circle");
    }
}
