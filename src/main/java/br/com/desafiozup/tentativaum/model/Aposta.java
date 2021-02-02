package br.com.desafiozup.tentativaum.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data public class Aposta { 

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "id_aposta")
	private long id;
	
	@Column( name = "data_aposta")
	private Date dataAposta;
	
	@Column( name = "numeros_sorteados", nullable = false)
	private String numerosSorteados;
	
	
	
}
