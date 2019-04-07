package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask("DrivingTask");

        //Then
        Assert.assertEquals("Go to the city", drivingTask.getTaskName());
        Assert.assertEquals(false,drivingTask.isTaskExecuted());
        drivingTask.executeTask();
        Assert.assertEquals(true,drivingTask.isTaskExecuted());
    }
    @Test
    public void testFactoryPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask("PaintingTask");

        //Then
        Assert.assertEquals("Paint", paintingTask.getTaskName());
        Assert.assertEquals(false,paintingTask.isTaskExecuted());
        paintingTask.executeTask();
        Assert.assertEquals(true,paintingTask.isTaskExecuted());

    } @Test
    public void testFactoryShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask("ShoppingTask");

        //Then
        Assert.assertEquals("Buy new products", shoppingTask.getTaskName());
        Assert.assertEquals(false,shoppingTask.isTaskExecuted());
        shoppingTask.executeTask();
        Assert.assertEquals(true,shoppingTask.isTaskExecuted());

    }
}
