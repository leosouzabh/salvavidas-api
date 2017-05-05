package br.salvavidas.api.controller.resource;

import java.util.Date;

public class CultoResource  {

	private Date data;
    private String qtdPessoas;
    private String preletor;
    private String observacao;
    private String presencas;
    private String tipoCulto;
    
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
		
	}
	public String getQtdPessoas() {
		return qtdPessoas;
	}
	public void setQtdPessoas(String qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
		
	}
	public String getPreletor() {
		return preletor;
	}
	public void setPreletor(String preletor) {
		this.preletor = preletor;
		
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
		
	}
	public String getPresencas() {
		return presencas;
	}
	public void setPresencas(String presencas) {
		this.presencas = presencas;
		
	}
	public String getTipoCulto() {
		return tipoCulto;
	}
	public void setTipoCulto(String tipoCulto) {
		this.tipoCulto = tipoCulto;
		
	}

    
    
}
