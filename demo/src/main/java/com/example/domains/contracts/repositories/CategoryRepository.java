package com.example.domains.contracts.repositories;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.domains.entities.Category;

@RepositoryRestResource(path="categorias", itemResourceRel="categoria", collectionResourceRel="categorias")
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
