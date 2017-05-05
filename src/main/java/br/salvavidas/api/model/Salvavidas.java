package br.salvavidas.api.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
public class Salvavidas {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String idImagem;
	private String nome;
	private Boolean presente;

	
	public Long getId() {
		return id;
	}

	public Salvavidas setId(Long id) {
		this.id = id;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public Salvavidas setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public String getIdImagem() {
		return idImagem;
	}

	public Salvavidas setIdImagem(String idImagem) {
		this.idImagem = idImagem;
		return this;
	}

	public Boolean getPresente() {
		return presente;
	}

	public Salvavidas setPresente(Boolean presente) {
		this.presente = presente;
		return this;
	}

	

}
