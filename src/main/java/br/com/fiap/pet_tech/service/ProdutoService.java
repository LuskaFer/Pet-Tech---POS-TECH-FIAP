package br.com.fiap.pet_tech.service;

import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.pet_tech.controller.exception.ControllerNotFoundException;
import br.com.fiap.pet_tech.dto.ProdutoDTO;
import br.com.fiap.pet_tech.entities.Produto;
import br.com.fiap.pet_tech.repository.ProdutoRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;

	public Collection<ProdutoDTO> findAll() {
		var produtos = repo.findAll();
		return produtos.stream().map(this::toProdutoDTO).collect(Collectors.toList());
	}

	public ProdutoDTO findById(UUID id) {
		var produto = repo.findById(id).orElseThrow(() -> new ControllerNotFoundException("Produto não encontrado"));
		return toProdutoDTO(produto);
	}

	public ProdutoDTO save(ProdutoDTO produtoDTO) {
		Produto produto = toProduto(produtoDTO);
		produto = repo.save(produto);
		return toProdutoDTO(produto);
	}

	public ProdutoDTO update(UUID id, ProdutoDTO produtoDTO) {

		try {
			Produto buscaProduto = repo.getReferenceById(id);
			buscaProduto.setNome(produtoDTO.nome());
			buscaProduto.setDescricao(produtoDTO.descricao());
			buscaProduto.setUrlDaImagem(produtoDTO.urlDaImagem());
			buscaProduto.setPreco(produtoDTO.preco());
			buscaProduto = repo.save(buscaProduto);

			return toProdutoDTO(buscaProduto);
		} catch (EntityNotFoundException e) {
			throw new ControllerNotFoundException("Produto não encontrado");
		}

	}

	public void delete(UUID id) {
		repo.deleteById(id);
	}

	private ProdutoDTO toProdutoDTO(Produto produto) {
		return new ProdutoDTO(produto.getId(), produto.getNome(), produto.getDescricao(), produto.getPreco(),
				produto.getUrlDaImagem());

	}

	private Produto toProduto(ProdutoDTO produtoDTO) {
		return new Produto(produtoDTO.id(), produtoDTO.nome(), produtoDTO.descricao(), produtoDTO.preco(),
				produtoDTO.urlDaImagem()

		);
	}

}
