package edu.coderhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.coderhouse.entity.ArtistEntity;

@Repository
public interface ArtistRepository extends JpaRepository<ArtistEntity, Long> {

}
