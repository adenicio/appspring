package com.adenix.appspring.repository;

import org.springframework.data.repository.CrudRepository;

import com.adenix.appspring.models.Convidado;
import com.adenix.appspring.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{

	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
}
