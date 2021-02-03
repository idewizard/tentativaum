package br.com.desafiozup.tentativaum.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
public class Apostador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "id_apostador")
	private long id;
	
	@Column( name = "nome" , nullable = false)
	private String nome;
	
	@Column( name = "sobrenome")
	private String sobrenome;
	
	@Column( name = "email" , nullable = false, unique = true)	
	private String email;
		
	@JsonIgnoreProperties("apostador")
	@OneToMany(mappedBy = "apostador" , cascade = CascadeType.ALL)
	private List<Aposta> apostas;
}
