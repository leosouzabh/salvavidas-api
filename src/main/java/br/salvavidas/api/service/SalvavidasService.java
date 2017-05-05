package br.salvavidas.api.service;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.salvavidas.api.model.Salvavidas;
import br.salvavidas.api.repository.SalvavidasRepository;

@Service
public class SalvavidasService {

	private SalvavidasRepository salvavidasRepository;
	
	public SalvavidasService(SalvavidasRepository salvavidasRepository) {
		this.salvavidasRepository = salvavidasRepository;
	}

	public Iterable<Salvavidas> listaTodos() {
		return salvavidasRepository.findAll();
	}
	
		
}