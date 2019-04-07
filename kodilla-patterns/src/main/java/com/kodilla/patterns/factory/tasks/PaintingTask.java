package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    final private String taskName;
    final private String color;



    final private String whatToPaint;
    private boolean isTaskDone = false;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

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
