package edu.coderhouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.coderhouse.entity.SongEntity;
import edu.coderhouse.repository.SongRepository;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    public List<SongEntity> findAll() {
        return songRepository.findAll();
    }

    public SongEntity findById(Long id) {
        return songRepository.findById(id).orElse(null);
    }

    public List<SongEntity> findByArtistId(Long artistId) {
        return songRepository.findByArtistId(artistId);
    }

    public SongEntity save(SongEntity song) {
        return songRepository.save(song);
    }

}
