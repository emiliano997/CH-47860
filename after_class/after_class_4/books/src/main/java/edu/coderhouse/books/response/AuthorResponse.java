package edu.coderhouse.books.response;

import java.util.List;

import edu.coderhouse.books.entity.AuthorEntity;

public class AuthorResponse {

    private String message;

    private List<AuthorEntity> authors;

    private AuthorEntity author;

    public AuthorResponse() {
    }

    public AuthorResponse(String message) {
        this.message = message;
    }

    public AuthorResponse(String message, List<AuthorEntity> authors) {
        this.message = message;
        this.authors = authors;
    }

    public AuthorResponse(String message, AuthorEntity author) {
        this.message = message;
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AuthorEntity getAuthor() {
        return author;
    }

    public void setAuthor(AuthorEntity author) {
        this.author = author;
    }

    public List<AuthorEntity> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorEntity> authors) {
        this.authors = authors;
    }

}
