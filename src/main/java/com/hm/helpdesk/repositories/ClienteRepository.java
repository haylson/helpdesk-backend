package com.hm.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hm.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
