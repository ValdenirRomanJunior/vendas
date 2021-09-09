package br.com.dynamous.vendas.dto;

import java.io.Serializable;

import br.com.dynamous.vendas.entities.Seller;

public class SellerDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	
	public SellerDTO() {
		// TODO Auto-generated constructor stub
	}

	
	public SellerDTO(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}


	public SellerDTO(Seller entity) {	
		this.id = entity.getId();
		this.nome = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
