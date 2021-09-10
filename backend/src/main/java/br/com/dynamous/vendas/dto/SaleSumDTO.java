package br.com.dynamous.vendas.dto;

import java.io.Serializable;

import br.com.dynamous.vendas.entities.Seller;

public class SaleSumDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private String SellerName;
	private  Double soma;
	
	public SaleSumDTO() {
		// TODO Auto-generated constructor stub
	}

	public SaleSumDTO(Seller sellerName, Double soma) {
		this.SellerName = sellerName.getName();
		this.soma = soma;
	}

	public String getSellerName() {
		return SellerName;
	}

	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}

	public Double getSoma() {
		return soma;
	}

	public void setSoma(Double soma) {
		this.soma = soma;
	}
	
	
}
