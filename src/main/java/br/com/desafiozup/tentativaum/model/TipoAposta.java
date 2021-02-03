package br.com.desafiozup.tentativaum.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class TipoAposta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "idtipo_aposta")
	private long id;
	
	@Column(name = "tipo_aposta")
	private String tipoAposta;
	
	@OneToMany(mappedBy = "tipoAposta")
    private List<Sorteio> sorteio;
	
}
