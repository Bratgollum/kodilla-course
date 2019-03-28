package prototype;

import com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.prototype.TaskList;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class BoardTestSuite {
    @Test
    public void testToString(){
        //Given
        //creating the TaskList for todos
        TaskList listToDO = new TaskList("To Do Task");
        IntStream.iterate(1, n -> n+1)
                .limit(10)
                .forEach(n -> listToDO.getTask().add(new Task(listToDO.getName()+ " number "+n)));
        //creating the TaskList for task in progress
        TaskList listInProgress = new TaskList("In progress Task");
        IntStream.iterate(1,n -> n+1)
                  .limit(10)
                  .forEach(n -> listInProgress.getTask().add(new Task(listInProgress.getName()+" number "+ n)));
        //creating the TaskList for done task
        TaskList listDone = new TaskList("Done Task");
        IntStream.iterate(1, n -> n +1)
                  .limit(10)
                  .forEach(n -> listDone.getTask().add(new Task( listDone.getName()+ " number " + n)));
        //creating the board and assigning the lists
        Board board = new Board("Project number 1");
        board.getLists().add(listToDO);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);


        //making a shallow clone of object board
        Board clonedBoard = null;
        try {
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project number 2");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        //making a deep copy of object board
        Board deepCloneBoard = null;
        try{
            deepCloneBoard = board.deepCopy();
            deepCloneBoard.setName("Project number 3");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        //When
        board.getLists().remove(listToDO);

        //Then
        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepCloneBoard);
        Assert.assertEquals(2, board.getLists().size());
        Assert.assertEquals(2 , clonedBoard.getLists().size());
        Assert.assertEquals(3, deepCloneBoard.getLists().size());
        Assert.assertEquals(clonedBoard.getLists(), board.getLists());
        Assert.assertNotEquals(deepCloneBoard.getLists(),board.getLists());
    }
}
