package com.example.domains.contracts.repositories;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.domains.core.contracts.repositories.RepositoryWithProjections;
import com.example.domains.entities.Film;

@RepositoryRestResource(path="peliculas", itemResourceRel="pelicula", collectionResourceRel="peliculas")
public interface FilmRepository extends JpaRepository<Film, Integer> {
}
