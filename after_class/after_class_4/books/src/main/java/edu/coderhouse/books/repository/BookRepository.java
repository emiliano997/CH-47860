package edu.coderhouse.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.coderhouse.books.entity.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {

}
