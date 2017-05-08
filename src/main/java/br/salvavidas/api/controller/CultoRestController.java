package br.salvavidas.api.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.salvavidas.api.controller.resource.CultoResource;
import br.salvavidas.api.model.Culto;
import br.salvavidas.api.model.Presenca;
import br.salvavidas.api.model.Salvavidas;
import br.salvavidas.api.repository.CultoRepository;
import br.salvavidas.api.repository.SalvavidasRepository;

@RestController
@RequestMapping("/api/culto")
public class CultoRestController {

	private static final Logger log = LoggerFactory.getLogger(CultoRestController.class);
	
	private CultoRepository cultoRepository;
	private SalvavidasRepository salvavidasRepository;
	public CultoRestController(CultoRepository cultoRepository, SalvavidasRepository salvavidasRepository) {
		this.cultoRepository = cultoRepository;
		this.salvavidasRepository = salvavidasRepository;
	}

	@RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public ResponseEntity<Void> save(@RequestBody List<CultoResource> cultos) {
		
		for ( CultoResource culto : cultos ){
			
			Culto cultoDb = new Culto()
					.setData(culto.getData())
					.setTipo(culto.getTipoCulto())
					.setQtdPessoas(culto.getQtdPessoas())
					.setPreletor(culto.getPreletor())
					.setObservacao(culto.getObservacao());
			
			List<Long> ids = parseIdsPresenca(culto);
			Set<Presenca> presentes = getListaPresenca(ids, cultoDb);
			cultoDb.setPresenca(presentes);
			
			cultoRepository.save(cultoDb);
		}	
		
		return ResponseEntity.ok().build();
	}

	private Set<Presenca> getListaPresenca(List<Long> ids, Culto cultoDb) {
		Set<Presenca> presencas = new HashSet<>();
		for(Salvavidas sv : salvavidasRepository.findAll()){
			presencas.add(new Presenca()
					.setSalvavidas(sv)
					.setCulto(cultoDb)
					.setPresente(ids.contains(sv.getId())));			
		}
		
		
		return presencas;
	}

	private List<Long> parseIdsPresenca(CultoResource culto) {
		List<Long> ids = new ArrayList<>();
		String[] idsStr = culto.getPresencas().split(";");
		for (String idStr : idsStr){
			ids.add(Long.parseLong(idStr));
		}
		return ids;
	}
	
	
	
		

}
