package com.hm.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.helpdesk.domain.Chamado;
import com.hm.helpdesk.domain.Cliente;
import com.hm.helpdesk.domain.Tecnico;
import com.hm.helpdesk.domain.enums.Perfil;
import com.hm.helpdesk.domain.enums.Prioridade;
import com.hm.helpdesk.domain.enums.Status;
import com.hm.helpdesk.repositories.ChamadoRepository;
import com.hm.helpdesk.repositories.ClienteRepository;
import com.hm.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Tecnico 01", "10118889044", "tec1@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Cliente 01", "89263801061", "cli1@mail.com", "456");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
