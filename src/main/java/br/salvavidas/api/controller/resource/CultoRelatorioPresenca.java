package br.salvavidas.api.controller.resource;

import java.util.Date;

public class CultoRelatorioPresenca {

	private String culto;
	private Date data;
	private Boolean presenca;
	
	public String getCulto() {
		return culto;
	}
	public CultoRelatorioPresenca setCulto(String culto) {
		this.culto = culto;
		return this;
	}
	public Boolean getPresenca() {
		return presenca;
	}
	public CultoRelatorioPresenca setPresenca(Boolean presenca) {
		this.presenca = presenca;
		return this;
	}
	public Date getData() {
		return data;
	}
	public CultoRelatorioPresenca setData(Date data) {
		this.data = data;
		return this;
	}
	
	
	
}

