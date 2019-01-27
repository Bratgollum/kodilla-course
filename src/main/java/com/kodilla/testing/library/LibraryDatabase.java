package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {
    //lists books having title beginning with titleFragment
    List<Book> listBooksWithCondition(String titleFragment);

    //list books borrowed by libraryUser
    List<Book> listBooksInHandsOf(LibaryUser libaryUser);

    //try to rent a book for libraryUser
    //return true when sucess
    //and return fals when book is unavailable to rent
    boolean rentBook(LibaryUser libaryUser, Book book);

    //return all books borrowed by libraryUser to the library
    //return number of books returned back
    int returnBooks(LibaryUser libaryUser);
}
