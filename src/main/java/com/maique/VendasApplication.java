package com.maique;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //dps de iniciar o spring, todas as annotations são analisadas, instâncias são criadas e colocadas dentro do container IOC para poderem ser usados.
@RestController //essa classe vai ser um controlador rest. vou conseguir controllar/enviar msg pro navegador.
public class VendasApplication { //é comum por a classe q vai inicializar a aplicação com o sufixo application

    //@Autowired
    //@Qualifier("applicationName") //fazendo a injeção dessa dependencia/bin
    @Value("${application.name}") //estamos injetando o "Bean" pelo application.properties, por isso eliminamos o autowired e o qualifier acima.
    private String applicationName;

    @GetMapping("/hello") //na hr q iniciar, aparece o helloworld no /hello
    public String helloWorld(){
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args); //inicializando aplicação springboot (classe q vai iniciar, argumentos)
    }
}
