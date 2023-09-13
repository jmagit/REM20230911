package com.example.domains.entities.dtos;

import org.springframework.beans.factory.annotation.Value;

public interface ActorSort {
	int getActorId();
	@Value("#{target.lastName + ', ' + target.firstName}")
	String getNombre();
}
