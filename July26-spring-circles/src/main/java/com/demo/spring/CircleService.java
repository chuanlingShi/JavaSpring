package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CircleService {
    @Autowired
    @Qualifier("hollowCircle")
    private Circle circle;

    public void draw() {
        circle.draw();
    }

}
