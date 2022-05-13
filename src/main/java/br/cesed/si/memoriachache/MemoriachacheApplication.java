package br.cesed.si.memoriachache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MemoriachacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemoriachacheApplication.class, args);
    }

}
