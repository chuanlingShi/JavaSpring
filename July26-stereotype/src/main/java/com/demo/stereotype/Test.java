package com.demo.stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test {
    @Autowired
    private A a1;
    @Autowired
    private B b1;

    public Test() {
        System.out.println("default constructor");
    }

    public Test(A a1, B b1) {
        this.a1 = a1;
        this.b1 = b1;
        System.out.println("Test param constructor called");
    }

    public A getA1() {
        return a1;
    }

    public void setA1(A a1) {
        this.a1 = a1;
    }

    public B getB1() {
        return b1;
    }

    public void setB1(B b1) {
        this.b1 = b1;
    }

    public void callMethodA() {
        a1.method1();
    }

    public void callMethodB() {
        b1.method2();
    }
}
