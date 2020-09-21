package br.com.tecnisys.bc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Endpoint {

    private final PiadaService piadaService;

    public Endpoint(PiadaService piadaService) {
        this.piadaService = piadaService;
    }

    @GetMapping
    public Piada sortearPiada(){
        return piadaService.sortearPiada();
    }
}
