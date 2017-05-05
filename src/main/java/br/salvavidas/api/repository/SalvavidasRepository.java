package br.salvavidas.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import br.salvavidas.api.model.Salvavidas;


public interface SalvavidasRepository extends CrudRepository<Salvavidas, Long> {

}
