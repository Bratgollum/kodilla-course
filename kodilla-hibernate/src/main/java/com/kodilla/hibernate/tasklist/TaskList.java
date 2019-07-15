package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TASKLIST")
public class TaskList {
    private int id;
    private String listName;
    private String description;

    public TaskList(int id, String taskList, String description) {
        this.id = id;
        this.listName = taskList;
        this.description = description;
    }

    public TaskList(){

    }

    
    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name="LISTNAME")
    public String getTaskList() {
        return listName;
    }

    public void setTaskList(String taskList) {
        this.listName = taskList;
    }
    @Column(name="DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
