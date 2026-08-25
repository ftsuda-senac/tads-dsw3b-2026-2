package br.senac.tads.dsw.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HelloWorldController {

    @GetMapping
    public String obterJson() {
        ExemploJson objeto = new ExemploJson();
        String json = objeto.gerarJson();
        return json;
    }

}
