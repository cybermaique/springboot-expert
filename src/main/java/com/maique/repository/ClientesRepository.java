package com.maique.repository;

import com.maique.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository //diz q a classe vai ter acesso a base de dados
public class ClientesRepository {

    public void persistir(Cliente cliente) {
        //acessa a base e salva o cliente
    }
}
