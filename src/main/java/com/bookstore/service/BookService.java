package com.bookstore.service;

import com.bookstore.entity.Book;
import com.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repo;
    public void save(Book b){
        repo.save(b);
    }

    public List<Book> getAllBooks(){

        return repo.findAll();
    }

    public Book getBookById(int id){

        return repo.findById(id).get();
    }

    public void deleteByID(int id) {
         repo.deleteById(id);
    }

}
