package br.cesed.si.memoriachache.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class CacheController {

    private int i;
    private int j;


    @GetMapping(path = "/helloword")
    //@Cacheable("helloword")
    public String helloWord() {
        i++;
        log.info("Path helloword acessada " + i + " vezes");
        return "hello world " + i;
    }

    @GetMapping(path = "/nothelloword")
    @CacheEvict("helloword")
    public String notHelloWord() {
        j++;
        log.info("Path  NOT helloword acessada " + j + " vezes");
        return "NOT hello world " + j;
    }
}
