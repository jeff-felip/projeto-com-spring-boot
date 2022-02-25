package com.projeto.spring.repositories;

import com.projeto.spring.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {// herda de JpaReposytory


}
