package br.salvavidas.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.salvavidas.api.model.Culto;


public interface CultoRepository extends CrudRepository<Culto, Long> {

	List<Culto> findTop12ByOrderByDataDesc();
	
}
