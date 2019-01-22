package com.kodilla.testing.shape;

public class Square implements Shape {
    private String nameOfFigure;
    private double sideSize;

    public Square(String nameOfFigure, double sideSize) {
        this.nameOfFigure = nameOfFigure;
        this.sideSize = sideSize;
    }

    @Override
    public String getShapeName() {
        return nameOfFigure;
    }

    @Override
    public double getField() {
        double a = sideSize;
        double fieldSquare;
        fieldSquare = a *a;
        return fieldSquare;
    }
}
