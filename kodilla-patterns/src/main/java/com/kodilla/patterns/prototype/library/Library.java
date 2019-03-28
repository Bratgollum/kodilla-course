package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public Set<Book> getBooks(){
        return books;
    }

    public String setName(String name){
        return this.name = name;
    }

    @Override
    public String toString() {
        return "Library "+name+"\n"
                 + books;
    }
    public Library shallowCopy() throws CloneNotSupportedException{
        return (Library)super.clone();
    }
    public Library deepCopy() throws CloneNotSupportedException{
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.books = new HashSet<>();
        for(Book theBooks : books){
            Book clonedBooks = new Book (theBooks.getTitle(),theBooks.author,theBooks.getPublicationDate());
            clonedLibrary.getBooks().add(clonedBooks);
        }
        return clonedLibrary;

    }
}
