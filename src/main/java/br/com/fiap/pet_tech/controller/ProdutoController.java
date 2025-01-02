package br.com.fiap.pet_tech.controller;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.pet_tech.dto.ProdutoDTO;
import br.com.fiap.pet_tech.entities.Produto;
import br.com.fiap.pet_tech.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoService service;
	
	@GetMapping
	public ResponseEntity<Collection<ProdutoDTO>> findAll() {
		var produtos = service.findAll();
		return ResponseEntity.ok(produtos);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProdutoDTO> findById(@PathVariable UUID id) {
		var produto = service.findById(id);
		return ResponseEntity.ok(produto);
	}
	
	@PostMapping
	public ResponseEntity<ProdutoDTO> save(@RequestBody ProdutoDTO produtoDTO) {
		produtoDTO = service.save(produtoDTO);
		return ResponseEntity.status(201).body(produtoDTO);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ProdutoDTO> update(
			@PathVariable UUID id, 
			@RequestBody ProdutoDTO produtoDTO) {
		
		produtoDTO = service.update(id, produtoDTO);
		return ResponseEntity.ok(produtoDTO);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable UUID id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	
	
	
	
	
}
