package com.adenix.appspring.repository;

import org.springframework.data.repository.CrudRepository;

import com.adenix.appspring.models.Evento;

public interface EventoRepository extends CrudRepository<Evento,String>{

	Evento findByCodigo(long codigo);
}
