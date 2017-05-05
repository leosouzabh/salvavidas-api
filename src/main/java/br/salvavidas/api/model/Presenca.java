package br.salvavidas.api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Presenca {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Salvavidas salvavidas;
	
	private Boolean presente;
	
	@ManyToOne
	private Culto culto;
	
	
	public Long getId() {
		return id;
	}
	public Presenca setId(Long id) {
		this.id = id;
		return this;
	}
	public Salvavidas getSalvavidas() {
		return salvavidas;
	}
	public Presenca setSalvavidas(Salvavidas salvavidas) {
		this.salvavidas = salvavidas;
		return this;
	}
	public Boolean getPresente() {
		return presente;
	}
	public Presenca setPresente(Boolean presente) {
		this.presente = presente;
		return this;
	}
	public Culto getCulto() {
		return culto;
	}
	public Presenca setCulto(Culto culto) {
		this.culto = culto;
		return this;
	}
	
	
	
	
}
