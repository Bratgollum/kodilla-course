package com.kodilla.testing.shape;

public class Circle implements  Shape {
    private String nameOfFigure;
    private double diameterOfTheCircle;

    public Circle(String nameOfFigure, double diameterOfTheCircle) {
        this.nameOfFigure = nameOfFigure;
        this.diameterOfTheCircle = diameterOfTheCircle;
    }

    @Override
    public String getShapeName() {
        return nameOfFigure;
    }

    @Override
    public double getField()
    {   double fieldWheel;
        double r = diameterOfTheCircle;
        fieldWheel = (r*r*3.14);
        return fieldWheel;
    }
}
