package com.bookStore.bookStore.service;

import com.bookStore.bookStore.entity.Book;
import com.bookStore.bookStore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bRepo;
    public void save(Book book) {
        bRepo.save(book);
    }

    public List<Book> getAllBook(){
        return bRepo.findAll();
    }

    public Book getBookById(int id){
        return bRepo.findById((id)).get();
    }

    public void deleteById(int id) {
        bRepo.deleteById(id);
    }

    public List<Book> findBooksByKeyword(String keyword){
        return bRepo.findBooksByKeyword(keyword);
    }
}
