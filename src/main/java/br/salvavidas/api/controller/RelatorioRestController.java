package br.salvavidas.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.salvavidas.api.controller.resource.CultoRelatorioPresenca;
import br.salvavidas.api.controller.resource.RelatorioPresenca;
import br.salvavidas.api.model.Culto;
import br.salvavidas.api.model.Presenca;
import br.salvavidas.api.model.Salvavidas;
import br.salvavidas.api.repository.CultoRepository;
import br.salvavidas.api.repository.SalvavidasRepository;

@RestController
@RequestMapping("/api/relatorio")
public class RelatorioRestController {

	private static final Logger log = LoggerFactory.getLogger(RelatorioRestController.class);
	
	private CultoRepository cultoRepository;
	private SalvavidasRepository salvavidasRepository;
	public RelatorioRestController(CultoRepository cultoRepository, SalvavidasRepository salvavidasRepository) {
		this.cultoRepository = cultoRepository;
		this.salvavidasRepository = salvavidasRepository;
	}

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<RelatorioPresenca>> list() {
		
		List<RelatorioPresenca> retorno = new ArrayList<RelatorioPresenca>();
		
		Iterable<Culto> cultos = cultoRepository.findTop12ByOrderByDataDesc();
		Iterable<Salvavidas> svs = salvavidasRepository.findAll();
		
		
		for ( Salvavidas sv : svs ){
			
			RelatorioPresenca itemRelatorio = new RelatorioPresenca()
				.setIdSalvavidas(sv.getId())
				.setNomeSalvavidas(sv.getNome())
				.setPresencas(new ArrayList<CultoRelatorioPresenca>());
				
			for (Culto culto : cultos){
				itemRelatorio.getPresencas().add( 
						new CultoRelatorioPresenca()
							.setCulto(culto.getTipo().substring(0, 1)) 
							.setData(culto.getData())
							.setPresenca(estaPresente(sv, culto)));
			}
			retorno.add(itemRelatorio);
			
		}
		
		return ResponseEntity.ok(retorno);
	}
	
	
	private boolean estaPresente(Salvavidas sv, Culto culto){
		boolean presente = false;
		for (Presenca presenca : culto.getPresenca()){
			if ( presenca.getSalvavidas().getId().equals(sv.getId()) ){
				presente = presenca.getPresente();
				break;
			}
		}
		return presente;
	}
}
