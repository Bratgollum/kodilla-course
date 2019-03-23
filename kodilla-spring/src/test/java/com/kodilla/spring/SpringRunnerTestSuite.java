package com.kodilla.spring;

import com.kodilla.spring.shape.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class SpringRunnerTestSuite {

    @Test
    public void contextLoads(){

    }

    @Test
    public void testCircleLoadedIntoContainer(){
        //Given
                ApplicationContext context =
                                new AnnotationConfigApplicationContext(Circle.class);
        Shape shape = context.getBean(Circle.class);
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is circle", name);

    }

    @Test
    public void testTringleLoadedIntoContainer(){
        //Given
              ApplicationContext context =
                               new AnnotationConfigApplicationContext(Tringle.class);
              Shape shape = context.getBean(Tringle.class);
              //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is Tringle" , name);

    }

    @Test
    public void testSquareLoadedIntoContainer(){
        //Given
        ApplicationContext context =
                    new AnnotationConfigApplicationContext("com.kodilla.spring.shape");
        Shape shape = context.getBean(Square.class);
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is Square", name);
    }
    @Test
    public void testShapeLoadedIntoContainer(){
        //Given
        ApplicationContext context =
                   new AnnotationConfigApplicationContext("com.kodilla.spring.shape");
        Shape shape = (Shape)context.getBean("chosenShape");
        ShapesFactory shapesFactory = new ShapesFactory();
        //When
        String name = shape.getShapeName();

        Assert.assertEquals(shapesFactory , name);
        System.out.println(name + " , "+ shapesFactory);

    }

}
