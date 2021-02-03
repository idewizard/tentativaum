package br.com.desafiozup.tentativaum.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data public class Aposta { 

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "idaposta")
	private long id;
	
	@Column( name = "data_aposta")
	private Date dataAposta;
	
	@Column( name = "numeros_sorteados", nullable = false)
	private String numerosSorteados;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "apostador_id_apostador")
	private Apostador apostador;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sorteio_idsorteio")
	private Sorteio sorteio;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_aposta_idtipo_aposta")
	private TipoAposta tipoAposta;
	
}
