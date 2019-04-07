package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private String taskName;
    private  String where;
    private String using;
    private boolean isTaskDone = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
}
