package com.bookstore.service;

import com.bookstore.entity.MyBookList;
import com.bookstore.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {

    @Autowired
    private MyBookRepository mrepo;

    public void saveMyBook(MyBookList mbl) {
        mrepo.save(mbl);
    }

    public List<MyBookList> getAllMyBooks() {
        return mrepo.findAll();
    }

    public void deleteById(int id){
        mrepo.deleteById(id);
    }
}
