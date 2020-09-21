package br.com.tecnisys.bc;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class PiadaService {

    private final List<Piada> piadas = new ArrayList<>();

    public Piada sortearPiada(){
        popularPiadas();
        int indice = new Random().nextInt(piadas.size());
        return piadas.get(indice);
    }

    private void popularPiadas() {
        piadas.add(new Piada(1,"Qual tempero é odiado pelos outros? O sal grosso!"));
        piadas.add(new Piada(2,"Qual é o nome da cidade que molha os bêbados quando chove? BarSemLona"));
    }
}
