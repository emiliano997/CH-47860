package edu.coderhouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.coderhouse.entity.ArtistEntity;
import edu.coderhouse.service.MainService;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    private MainService mainService;

    @GetMapping(value = "/artist/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<ArtistEntity> getArtistById(@PathVariable Long id) {
        try {
            ArtistEntity artist = mainService.getArtistById(id);
            return ResponseEntity.ok(artist);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.notFound().build();
        }
    }

}
