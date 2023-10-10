package edu.coderhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import edu.coderhouse.entity.ArtistEntity;
import edu.coderhouse.entity.SongEntity;
import edu.coderhouse.service.SongService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/songs")
public class SongController {

    @Autowired
    private SongService songService;

    @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<SongEntity>> findAll() {
        return ResponseEntity.ok(songService.findAll());
    }

    @GetMapping(value = "/artist/{artistId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<SongEntity>> findByArtistId(@PathVariable Long artistId) {
        return ResponseEntity.ok(songService.findByArtistId(artistId));
    }

    @GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<SongEntity> findById(@PathVariable Long id) {
        return ResponseEntity.ok(songService.findById(id));
    }

    @PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<SongEntity> save(@RequestBody SongEntity song) {
        try {
            RestTemplate restTemplate = new RestTemplate();

            String url = "http://localhost:5000/api/artist/" + song.getArtistId();

            ArtistEntity artist = restTemplate.getForObject(url, ArtistEntity.class);

            if (artist == null) {
                return ResponseEntity.status(400).body(null);
            }

            return ResponseEntity.ok(songService.save(song));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(500).body(null);
        }
    }

}
