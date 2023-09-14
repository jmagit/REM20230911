package com.example;

import java.util.TreeMap;

import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.example.domains.contracts.repositories.ActorRepository;
import com.example.domains.contracts.repositories.LanguageRepository;
import com.example.domains.contracts.services.ActorService;
import com.example.domains.entities.Actor;
import com.example.domains.entities.dtos.ActorDTO;
import com.example.domains.entities.dtos.ActorSort;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import jakarta.transaction.Transactional;

@OpenAPIDefinition(
        info = @Info(
                title = "Microservicio: Demos del curso",
                version = "1.0",
                description = "Ejemplo de Microservicio utilizando la base de datos **Sakila**.",
                license = @License(name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0.html"),
                contact = @Contact(name = "Javier Martín", url = "https://github.com/jmagit", email = "support@example.com")
        ),
        externalDocs = @ExternalDocumentation(description = "Documentación del proyecto", url = "https://github.com/jmagit/REM20230911")
)
@SecurityScheme(name = "bearerAuth", type = SecuritySchemeType.HTTP, scheme = "bearer", bearerFormat = "JWT")
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Bean
    OpenApiCustomizer sortSchemasAlphabetically() {
        return openApi -> {
            var schemas = openApi.getComponents().getSchemas();
            openApi.getComponents().setSchemas(new TreeMap<>(schemas));
        };
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
		System.out.println("Aplicación arrancada");
		
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
//		srv.add(new Actor(0, null, "12345678z"));
	}
	
	@Transactional
	void transaccion() {
		
	}

}
