package com.demo.stereotype;

import org.springframework.stereotype.Component;

@Component("b")

public class B {
    public B() {
        System.out.println("Constructor B");
    }
    public void method2() {
        System.out.println("Method 2 of B");
    }
}
