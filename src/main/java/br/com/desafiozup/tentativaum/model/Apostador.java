package br.com.desafiozup.tentativaum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Apostador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "id_apostador")
	private long id;
	
	@Column( name = "nome")
	private String nome;
	
	@Column( name = "sobrenome")
	private String sobrenome;
	
	@Column( name = "email" , nullable = false)	
	private String email;
	
}
