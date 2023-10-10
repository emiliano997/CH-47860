package edu.coderhouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.coderhouse.entity.ArtistEntity;
import edu.coderhouse.repository.ArtistRepository;

@Service
public class ArtistService {

    @Autowired
    private ArtistRepository artistRepository;

    public List<ArtistEntity> findAll() {
        return artistRepository.findAll();
    }

    public ArtistEntity findById(Long id) {
        return artistRepository.findById(id).orElse(null);
    }

    public ArtistEntity save(ArtistEntity artist) {
        return artistRepository.save(artist);
    }

}
