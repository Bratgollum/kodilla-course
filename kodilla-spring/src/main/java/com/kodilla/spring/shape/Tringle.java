package com.kodilla.spring.shape;

import org.springframework.stereotype.Component;

@Component
public class Tringle implements Shape {

    @Override
    public String getShapeName() {
        return "This is Tringle";
    }
}
