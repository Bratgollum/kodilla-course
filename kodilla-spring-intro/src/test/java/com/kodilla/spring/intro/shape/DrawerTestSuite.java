package com.kodilla.spring.intro.shape;

import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuite {
    @Test
    public void testDrawingWithCircle(){
        //Given
        Circle circle = new Circle();
        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();
        //Then
        Assert.assertEquals("This is a circle", result);


    }
    @Test
    public void testDrawingWithTringle(){
        //Given
        Triangle triangle = new Triangle();
        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();
        //Then
        Assert.assertEquals("This is a tringle", result);


    }
}