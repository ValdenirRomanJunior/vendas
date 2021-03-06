package br.com.dynamous.vendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.dynamous.vendas.dto.SaleDTO;
import br.com.dynamous.vendas.dto.SaleSuccessDTO;
import br.com.dynamous.vendas.dto.SaleSumDTO;
import br.com.dynamous.vendas.entities.Sale;
import br.com.dynamous.vendas.repositories.SaleRepository;
import br.com.dynamous.vendas.repositories.SellerRepository;


@Service
public class SaleService {
	
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageble){
		sellerRepository.findAll();
		Page<Sale> result =repository.findAll(pageble);	
		return result.map(x -> new SaleDTO(x));
		
	}
		@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupBySeller(){
		return repository.amountGroupdBySeller();
	}
	
		public List<SaleSuccessDTO> successGroupdBySeller(){
			return repository.successGroupdBySeller();
			
		}
	

}
