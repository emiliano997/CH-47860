package edu.coderhouse.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.coderhouse.books.entity.AuthorEntity;
import edu.coderhouse.books.response.AuthorResponse;
import edu.coderhouse.books.service.AuthorService;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<AuthorEntity>> findAll() {
        return ResponseEntity.ok(authorService.findAll());
    }

    @GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<AuthorResponse> findById(@PathVariable Long id) {
        AuthorEntity author = authorService.findById(id);
        if (author == null) {
            AuthorResponse response = new AuthorResponse("No se encontró el autor");
            return new ResponseEntity<AuthorResponse>(response, null, 404);
        }
        AuthorResponse response = new AuthorResponse("Todo ok", author);
        return new ResponseEntity<AuthorResponse>(response, null, 200);
    }

    @PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<AuthorResponse> save(@RequestBody AuthorEntity author) {
        AuthorEntity authorSaved = authorService.save(author);
        AuthorResponse response = new AuthorResponse("Todo ok", authorSaved);
        return new ResponseEntity<AuthorResponse>(response, null, HttpStatusCode.valueOf(200));
    }

    @PutMapping(value = "/{id}", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
            MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<AuthorResponse> update(@PathVariable Long id, @RequestBody AuthorEntity author) {
        AuthorEntity authorFound = authorService.findById(id);

        if (authorFound == null) {
            AuthorResponse response = new AuthorResponse("No se encontró el autor");
            return new ResponseEntity<AuthorResponse>(response, null, 404);
        }

        author.setAutorId(id);
        AuthorEntity authorSaved = authorService.update(author);
        AuthorResponse response = new AuthorResponse("Todo ok", authorSaved);
        return new ResponseEntity<AuthorResponse>(response, null, HttpStatusCode.valueOf(200));
    }

    @DeleteMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<AuthorResponse> deleteById(@PathVariable Long id) {
        AuthorEntity author = authorService.findById(id);
        if (author == null) {
            AuthorResponse response = new AuthorResponse("No se encontró el autor");
            return new ResponseEntity<AuthorResponse>(response, null, 404);
        }
        authorService.deleteById(id);
        AuthorResponse response = new AuthorResponse("Autor eliminado", author);
        return new ResponseEntity<AuthorResponse>(response, null, 200);
    }

}
