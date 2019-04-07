package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    final private  String taskName;
    final private  String whatToBuy;
    final private double quantity;
    private boolean isTaskDone = false;

    public ShoppingTask(final String taskName, final String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }


    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Task: "+ taskName + "is executed");
        isTaskDone = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskDone;
    }
}
