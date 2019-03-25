package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);
        board.getToDoList().getTasks().add("Task from ToDoList");
        board.getInProgressList().getTasks().add("Task from InProgressList");
        board.getDoneList().getTasks().add("Task from DoneList");
        //When
        board.getToDoList().getTasks().forEach(System.out::println);
        board.getInProgressList().getTasks().forEach(System.out::println);
        board.getDoneList().getTasks().forEach(System.out::println);
        //Then
        Assert.assertEquals(1,board.getToDoList().getTasks().size());
        Assert.assertEquals(1,board.getInProgressList().getTasks().size());
        Assert.assertEquals(1,board.getDoneList().getTasks().size());



    }
}
