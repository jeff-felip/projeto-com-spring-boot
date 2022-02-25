package com.projeto.spring.repositories;

import com.projeto.spring.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository// anotação para dizer que a interface é um repositório, ou seja, camade de acesso aos dados
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {// herda de JpaReposytory

}
