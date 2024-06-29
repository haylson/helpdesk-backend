package com.hm.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hm.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
