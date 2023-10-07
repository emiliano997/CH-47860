package edu.coderhouse.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.coderhouse.books.entity.BookEntity;
import edu.coderhouse.books.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<BookEntity> findAll() {
        return bookRepository.findAll();
    }

    public BookEntity findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public BookEntity save(BookEntity book) {
        return bookRepository.save(book);
    }

}
