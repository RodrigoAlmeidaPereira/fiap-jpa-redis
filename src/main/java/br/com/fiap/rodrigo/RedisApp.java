package br.com.fiap.rodrigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("br.com.fiap.rodrigo")
public class RedisApp {

    public static void main(String[] args) {
        SpringApplication.run(RedisApp.class, args);
    }
}
