package com.maique.service;

import ch.qos.logback.core.net.server.Client;
import com.maique.model.Cliente;
import com.maique.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    @Autowired //pra injetar essa instancia. nas versões mais atuais do springboot, nao e necessario.
    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }
    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);

    }

    public void validarCliente(Cliente cliente){
        //aplica validações
    }
}
