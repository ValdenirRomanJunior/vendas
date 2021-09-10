package br.com.dynamous.vendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.dynamous.vendas.dto.SaleSuccessDTO;
import br.com.dynamous.vendas.dto.SaleSumDTO;

import br.com.dynamous.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new br.com.dynamous.vendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
		List<SaleSumDTO> amountGroupdBySeller();
	
	@Query("SELECT new br.com.dynamous.vendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
		List<SaleSuccessDTO> successGroupdBySeller();
}
