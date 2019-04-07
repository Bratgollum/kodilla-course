package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String ShoppingTask = "ShoppingTask";
    public static final String PaintingTask = "PaintingTask";
    public static final String DrivingTask = "DrivingTask";

    public final Task makeTask(final String taskClass ){
        switch(taskClass){
            case ShoppingTask:
                return new ShoppingTask("Buy new products","Fruits",25);
            case PaintingTask:
                return new PaintingTask("Paint","red","Hause");
            case DrivingTask:
                return new DrivingTask("Go to the city", "New York","car");
            default:
                return null;
        }
    }
}
