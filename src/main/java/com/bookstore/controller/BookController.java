package com.bookstore.controller;

import com.bookstore.entity.Book;
import com.bookstore.entity.MyBookList;
import com.bookstore.service.BookService;
import com.bookstore.service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class BookController {
    @Autowired
    private BookService service;

    @Autowired
    private MyBookListService myBookService;

    @GetMapping("/")
    public String  home()
    {
        return "home";

    }

    @GetMapping("/book_register")
    public String bookRegister()
    {
        return "bookRegister";
    }

    @GetMapping("/available_books")
    public ModelAndView availableBooks()
    {
        List<Book>list = service.getAllBooks();
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("availableBooks");
//        mv.addObject("book",list);
        return new ModelAndView("availableBooks","book",list);
    }



    @PostMapping("/save")
    public String addBooks(@ModelAttribute Book b)
    {
        service.save(b);
        return "redirect:/available_books";
    }

    @GetMapping("/my_books")
    public String getMyBooks(Model model)
    {
        List<MyBookList> list = myBookService.getAllMyBooks();
        model.addAttribute("books", list);
        return "myBooks";
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id)
    {

        Book b = service.getBookById(id);
        MyBookList mb = new MyBookList(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
        myBookService.saveMyBook(mb);
        return "redirect:/my_books";
    }
    @RequestMapping("/bookEdit/{id}")
    public String bookEdit(@PathVariable("id") int id, Model model) {
        Book b = service.getBookById(id);
        model.addAttribute("book", b);
        return "bookEdit";
    }
    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") int id) {
        service.deleteByID(id);
        return "redirect:/available_books";
    }
}
