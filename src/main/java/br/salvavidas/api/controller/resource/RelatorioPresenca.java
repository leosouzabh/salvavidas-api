package br.salvavidas.api.controller.resource;

import java.util.List;

public class RelatorioPresenca {

	private Long idSalvavidas;
	private String nomeSalvavidas;
	private List<CultoRelatorioPresenca> presencas;
	
	public Long getIdSalvavidas() {
		return idSalvavidas;
	}
	public RelatorioPresenca setIdSalvavidas(Long idSalvavidas) {
		this.idSalvavidas = idSalvavidas;
		return this;
	}
	public List<CultoRelatorioPresenca> getPresencas() {
		return presencas;
	}
	public RelatorioPresenca setPresencas(List<CultoRelatorioPresenca> presencas) {
		this.presencas = presencas;
		return this;
	}
	public String getNomeSalvavidas() {
		return nomeSalvavidas;
	}
	public RelatorioPresenca setNomeSalvavidas(String nomeSalvavidas) {
		this.nomeSalvavidas = nomeSalvavidas;
		return this;
	}	
	
	

}


