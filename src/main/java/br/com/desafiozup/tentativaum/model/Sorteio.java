package br.com.desafiozup.tentativaum.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Sorteio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_sorteio")
	private long id;
	
	@Column( name = "data_sorteio")
	private Date dataSorteio;
	
	@Column( name = "resultado_sorteio")
	private String resultadoSorteio;
	
	
	
}
