package com.maique;

//Se for fazer uma config de segurança, ficaria SecurityConfiguration... Cada arquivo de configuração deve ter o sufixo correspondente.

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration {

    @Bean(name = "applicationName") //criar objeto string para podermos usar. convem usar nomes diferentes para beans de mesmo tipo de objeto.
    public String applicationName(){
        return "Sistema de Vendas";
    }
}
