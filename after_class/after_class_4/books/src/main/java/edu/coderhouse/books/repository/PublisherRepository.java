package edu.coderhouse.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.coderhouse.books.entity.PublisherEntity;

@Repository
public interface PublisherRepository extends JpaRepository<PublisherEntity, Long> {

}
