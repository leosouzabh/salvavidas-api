package br.salvavidas.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.salvavidas.api.model.Salvavidas;
import br.salvavidas.api.service.SalvavidasService;

@RestController
@RequestMapping("/api/salvavidas")
public class SalvavidasRestController {

	private static final Logger log = LoggerFactory.getLogger(SalvavidasRestController.class);
	
	private SalvavidasService SalvavidasService;
	
	public SalvavidasRestController(SalvavidasService SalvavidasService) {
		this.SalvavidasService = SalvavidasService;
	}

	

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Iterable<Salvavidas>> list() {
		return ResponseEntity.ok(SalvavidasService.listaTodos());
	}
	
	
		

}
