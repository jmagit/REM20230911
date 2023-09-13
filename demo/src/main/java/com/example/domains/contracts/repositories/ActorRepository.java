package com.example.domains.contracts.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.example.domains.entities.Actor;
import com.example.domains.entities.dtos.ActorDTO;
import com.example.domains.entities.dtos.ActorSort;

public interface ActorRepository extends JpaRepository<Actor, Integer>, JpaSpecificationExecutor<Actor> {
	List<Actor> findTop5ByFirstNameStartingWithOrderByLastNameDesc(String prefijo);
	List<Actor> findTop5ByFirstNameStartingWith(String prefijo, Sort orderBy);
	Page<Actor> findByFirstNameStartingWith(String prefijo, Pageable pageable);
	List<Actor> findByActorIdGreaterThan(int id);
	List<ActorDTO> queryByActorIdGreaterThan(int id);
	List<ActorSort> readByActorIdGreaterThan(int id);
	<T> List<T> findByActorIdGreaterThan(int id, Class<T> tipo);
	
	@Query("from Actor a where a.actorId > ?1")
	List<Actor> findUltimosJPQL(int id);
	@Query(value = "select * from actor a where a.actor_id > ?1", nativeQuery = true)
	List<Actor> findUltimosSQL(int id);
	
}
