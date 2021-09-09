package br.com.dynamous.vendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.dynamous.vendas.dto.SaleDTO;
import br.com.dynamous.vendas.services.SaleService;


@RestController
@RequestMapping(value="/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity <Page<SaleDTO>> findAll(Pageable pageable){	
		Page<SaleDTO> list = service.findAll(pageable);	
		return ResponseEntity.ok(list);
		
		
	}

}
