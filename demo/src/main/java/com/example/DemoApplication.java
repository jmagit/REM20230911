package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.example.domains.contracts.repositories.ActorRepository;
import com.example.domains.contracts.repositories.LanguageRepository;
import com.example.domains.contracts.services.ActorService;
import com.example.domains.entities.Actor;
import com.example.domains.entities.dtos.ActorDTO;
import com.example.domains.entities.dtos.ActorSort;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Autowired
//	ActorRepository dao;
//	@Autowired
//	LanguageRepository dao2;
	
	@Autowired
	ActorService srv;
	
	@Override
	@Transactional
	public void run(String... args) throws Exception {
		System.out.println("Aplicación arrancada cambio");
		
//		dao.save(new Actor(0, "Pepito", "Grillo"));
//		var item = dao.findById(202);
//		if(item.isEmpty()) {
//			System.err.println("No encontrado");
//		} else {
//			var actor = item.get();
//			actor.setFirstName(actor.getFirstName().toUpperCase());
//			dao.save(actor);
//		}
//		dao.deleteById(202);
//		dao.findAll().forEach(System.out::println);
//		dao.findTop5ByFirstNameStartingWithOrderByLastNameDesc("P").forEach(System.out::println);
//		dao.findTop5ByFirstNameStartingWith("P", Sort.by("firstName")).forEach(System.out::println);
//		dao.findByActorIdGreaterThan(200).forEach(System.out::println);
//		dao.findUltimosJPQL(200).forEach(System.out::println);
//		dao.findUltimosSQL(200).forEach(System.out::println);
//		dao.findAll((root, query, builder) -> builder.greaterThan(root.get("actorId"), 200)).forEach(System.out::println);
//		dao.findAll(Sort.by("firstName","lastName").descending()).forEach(System.out::println);
//		dao.findAll(PageRequest.of(1, 10, Sort.by("actorId"))).forEach(System.out::println);
//		dao.findByFirstNameStartingWith("P", PageRequest.of(0, 5, Sort.by("actorId"))).forEach(System.out::println);
//		dao.findByFirstNameStartingWith("P", PageRequest.of(0, 5, Sort.by("actorId"))).getContent().forEach(System.out::println);
//		var item = dao.findById(1);
//		if(item.isEmpty()) {
//			System.err.println("No encontrado");
//		} else {
//			var actor = item.get();
//			System.out.println(actor);
//			actor.getFilmActors().forEach(p -> System.out.println(p.getFilm().getTitle()));
//		}
//		var actor = new Actor(0, null, "12345678z");
//		if(actor.isInvalid()) {
//			System.out.println(actor.getErrorsMessage());
//		} else {
//			dao.save(actor);
//		}
//		var dto = new ActorDTO(0, "kk", "ssss");
//		dao.save(ActorDTO.from(dto));
//		dao.findAll().forEach(p -> System.out.println(ActorDTO.from(p)));
//		dao.queryByActorIdGreaterThan(200).forEach(System.out::println);
//		dao.readByActorIdGreaterThan(200).forEach(p -> System.out.println(p.getActorId() + " " + p.getNombre()));
//		dao.findByActorIdGreaterThan(200, ActorDTO.class).forEach(System.out::println);
//		dao.findByActorIdGreaterThan(200, ActorSort.class).forEach(p -> System.out.println(p.getActorId() + " " + p.getNombre()));
//		dao.findAllBy(ActorDTO.class).forEach(System.out::println);
		srv.add(new Actor(0, null, "12345678z"));
	}
	
	@Transactional
	void transaccion() {
		
	}

}
