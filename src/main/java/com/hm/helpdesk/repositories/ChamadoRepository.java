package com.hm.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hm.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
