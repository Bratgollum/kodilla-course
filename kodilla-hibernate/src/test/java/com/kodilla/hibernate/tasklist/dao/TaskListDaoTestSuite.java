package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList();
        taskList.setTaskList("Shoppings");
        String taskListName = taskList.getTaskList();
        //When
        taskListDao.save(taskList);
        List<TaskList> readTaskList = taskListDao.findingByListName(taskListName);
        //Then
        Assert.assertEquals(1,readTaskList.size());
        //Clean Up
        taskListDao.deleteAll();
    }
}
