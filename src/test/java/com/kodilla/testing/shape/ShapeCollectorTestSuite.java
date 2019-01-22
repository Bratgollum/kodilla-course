package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("That's the begining of tests");
    }
    @AfterClass
    public static void afterAllTests(){
    System.out.println("All tests are finished ");
    }
    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #"+testCounter);
    }
    @After
    public void afterEveryTest(){
        System.out.println("Test #"+testCounter +" finished ");
    }

    @Test
    public void testAddFigure(){
        //Given
        Shape circle = new Circle("Circle01", 30);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(1,shapeCollector.getFigureQuantity());

    }
    @Test
    public void testRemoveFigureNotExisting(){
        //Given
        Shape circle = new Circle("Circle01", 30);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        boolean result = shapeCollector.removeFigure(circle);

        //Then
        Assert.assertFalse(result);

    }

    @Test
    public void testRemoveFigure(){
        //Given
        Shape circle = new Circle("Circle01", 30);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,shapeCollector.getFigureQuantity());


    }
    @Test
    public void testGetFigure(){
        //Given
        Shape circle = new Circle("Circle01", 30);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        //When
        Shape retrivedFigure;
        retrivedFigure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle,retrivedFigure);
    }
    @Test
        public void testShowFigures(){
            //Given
            ArrayList<Shape> figureTest = new ArrayList<Shape>();
            Shape circle = new Circle("Circle01", 30);
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
             figureTest.add(circle);
             shapeCollector.addFigure(circle);
            //Then
            Assert.assertEquals(figureTest,shapeCollector.showFigures());



    }
}

