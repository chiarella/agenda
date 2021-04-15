package br.com.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_agenda")
public class Agenda {

	private String nome;

	private int telefone;

	private String endereco;

	// a tecla "ALT" + "S" ou aba SOURCE

	// a teccla ctrl + s = salva a classe que esta

	// a teccla ctrl + shift + s = salva a classe que esta

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	// metodo construtor sem parametros
	public Agenda() {
		super();
	}

	// metodo construtor com parametros
	public Agenda(String nome, int telefone, String endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}

}
