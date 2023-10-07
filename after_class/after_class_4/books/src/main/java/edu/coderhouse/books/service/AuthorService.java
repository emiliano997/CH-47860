package edu.coderhouse.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.coderhouse.books.entity.AuthorEntity;
import edu.coderhouse.books.repository.AuthorRepository;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<AuthorEntity> findAll() {
        return authorRepository.findAll();
    }

    public AuthorEntity findById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public AuthorEntity save(AuthorEntity author) {
        return authorRepository.save(author);
    }

    public AuthorEntity deleteById(Long id) {
        AuthorEntity author = findById(id);
        authorRepository.deleteById(id);
        return author;
    }

    public AuthorEntity update(AuthorEntity author) {
        return authorRepository.save(author);
    }

}
