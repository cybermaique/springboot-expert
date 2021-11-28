package com.maique;

//Se for fazer uma config de segurança, ficaria SecurityConfiguration... Cada arquivo de configuração deve ter o sufixo correspondente.

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")
public class MinhaConfiguration {

    //@Bean(name = "applicationName") //criar objeto string para podermos usar. convem usar nomes diferentes para beans de mesmo tipo de objeto.

    @Bean
//    commandlinerunner: qd o spring subir, vai buscar os bean q sao commandlinerunner, e ele vai executar o codigo q ta ali em baixo
//    entao ele vai executar q nem se fosse uma classe q inicializa junto com a aplicação
//    tem um unico metodo q é o run (dentro dele é possivel ver)
    public CommandLineRunner executar(){
        return args ->{
            System.out.printf("Rodando a configuração de Desenvolvimento");
        };
    }
}
