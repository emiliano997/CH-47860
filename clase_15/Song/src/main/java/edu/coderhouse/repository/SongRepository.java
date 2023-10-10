package edu.coderhouse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.coderhouse.entity.SongEntity;

@Repository
public interface SongRepository extends JpaRepository<SongEntity, Long> {

    public List<SongEntity> findByArtistId(Long artistId);

}
