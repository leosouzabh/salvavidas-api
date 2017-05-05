package br.salvavidas.api.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Culto {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Date data;
	private String tipo;
    private String qtdPessoas;
    private String preletor;
    private String observacao;
	
	@OneToMany(mappedBy="culto", cascade = CascadeType.ALL)
	private Set<Presenca> presenca;
	
	public Long getId() {
		return id;
	}
	public Culto setId(Long id) {
		this.id = id;
		return this;
	}
	public Date getData() {
		return data;
	}
	public Culto setData(Date data) {
		this.data = data;
		return this;
	}
	public String getTipo() {
		return tipo;
	}
	public Culto setTipo(String tipo) {
		this.tipo = tipo;
		return this;
	}
	public Set<Presenca> getPresenca() {
		return presenca;
	}
	public Culto setPresenca(Set<Presenca> presenca) {
		this.presenca = presenca;
		return this;
	}
	public String getQtdPessoas() {
		return qtdPessoas;
	}
	public Culto setQtdPessoas(String qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
		return this;
	}
	public String getPreletor() {
		return preletor;
	}
	public Culto setPreletor(String preletor) {
		this.preletor = preletor;
		return this;
	}
	public String getObservacao() {
		return observacao;
	}
	public Culto setObservacao(String observacao) {
		this.observacao = observacao;
		return this;
	}
	
	
}
