package br.com.dynamous.vendas.dto;

import java.io.Serializable;

import br.com.dynamous.vendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private String SellerName;
	private  Long visited;
	private  Long deals;
	
	public SaleSuccessDTO() {
		// TODO Auto-generated constructor stub
	}



	public SaleSuccessDTO(Seller sellerName, Long visited, Long deals) {
		SellerName = sellerName.getName();
		this.setVisited(visited);
		this.setDeals(deals);
	}



	public String getSellerName() {
		return SellerName;
	}

	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}



	public Long getVisited() {
		return visited;
	}



	public void setVisited(Long visited) {
		this.visited = visited;
	}



	public Long getDeals() {
		return deals;
	}



	public void setDeals(Long deals) {
		this.deals = deals;
	}


	
}
