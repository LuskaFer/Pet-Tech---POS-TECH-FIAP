package br.com.fiap.pet_tech.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.pet_tech.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, UUID>{

}
