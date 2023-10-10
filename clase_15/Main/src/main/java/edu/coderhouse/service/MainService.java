package edu.coderhouse.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import edu.coderhouse.entity.ArtistEntity;
import edu.coderhouse.entity.SongEntity;

@Service
public class MainService {

    public ArtistEntity getArtistById(Long id) {
        RestTemplate restTemplate = new RestTemplate();

        ArtistEntity artist = restTemplate.getForObject("http://localhost:5000/api/artist/" + id, ArtistEntity.class);

        if (artist == null) {
            throw new RuntimeException("Artist not found");
        }

        List<SongEntity> songs = restTemplate.getForObject("http://localhost:5100/api/songs/artist/" + id, List.class);

        artist.setSongs(songs);

        return artist;
    }
}
