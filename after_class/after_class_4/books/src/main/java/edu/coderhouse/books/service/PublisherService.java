package edu.coderhouse.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.coderhouse.books.entity.PublisherEntity;
import edu.coderhouse.books.repository.PublisherRepository;

@Service
public class PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    public List<PublisherEntity> findAll() {
        return publisherRepository.findAll();
    }

    public PublisherEntity findById(Long id) {
        return publisherRepository.findById(id).orElse(null);
    }

    public PublisherEntity save(PublisherEntity publisher) {
        return publisherRepository.save(publisher);
    }

}
