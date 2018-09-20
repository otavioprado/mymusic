package br.com.ciandt.mymusic.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "musica")
public class Musica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "artista_id", insertable = false)
	private Artista artista;
	
	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
