package br.com.dynamous.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dynamous.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
