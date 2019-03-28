package prototype.library;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Library number 1 ");
        IntStream.iterate(1, n-> n+1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Book nr "+ n,
                         "Author nr " + n , LocalDate.of(1987+n,04,26))));
        //making a schallow clone of object Library
        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library number 2 ");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        //making a deep copy of object Library
        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("Numbere 11","John",LocalDate.of(1987,05,30)));

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(11, library.getBooks().size());
        Assert.assertEquals(11, clonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
    }
}
