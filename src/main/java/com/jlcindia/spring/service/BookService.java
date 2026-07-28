package com.jlcindia.spring.service; 
 
import com.jlcindia.spring.entity.Book;
import java.util.List; 

public interface BookService { 
 public List<Book> getAllBooks(); 
 public List<Book> getAllBooks(int start,int total); 
 public Book getBookById(Integer bid); 
 public void addBook(Book book); 
 public void updateBook(Book book); 
 public void deleteBook(Integer bid); 
 public int getBookCount(); 
}