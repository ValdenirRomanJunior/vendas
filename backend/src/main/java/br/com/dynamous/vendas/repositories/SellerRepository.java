package br.com.dynamous.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dynamous.vendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
