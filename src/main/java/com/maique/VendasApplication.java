package com.maique;
//por padrão, o spring boot utiliza o HikariCP como database padrão
import com.maique.domain.entity.Cliente;
import com.maique.domain.repositorio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes){
        return args -> {
            clientes.salvar(new Cliente("Maique"));
            clientes.salvar(new Cliente("Igor"));

            List<Cliente> todosClientes = clientes.obterTodos();
            todosClientes.forEach(System.out::println); //vai imprimir o valor q vier... forEach pra percorer a lista de String... tem q criar o toString (criado na classe Clientes)
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}