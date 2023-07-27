package com.demo.springbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {
    @Bean
    public A a1() {
        return new A();
    }

    @Bean("b")
    public B b1() {
        return new B();
    }

    @Bean("t1")
    public Test test1() {
        return new Test(a1(), b1());
    }
}
