package com.demo.springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        A a1 = context.getBean(A.class);
        a1.method1();
        B b1 = (B) context.getBean("b");
        b1.method2();

        Test test = context.getBean(Test.class);
        test.callMethodA();
        test.callMethodB();
    }
}
