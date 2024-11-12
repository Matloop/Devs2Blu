package br.com.exemplo.bridge.cores.questao1.formas;

import br.com.exemplo.bridge.cores.questao1.cores.Cor;
import br.com.exemplo.bridge.cores.questao1.cores.Estilo;

public class Triangulo extends Forma {
    public Triangulo(Cor cor, Estilo estilo) {
        super(cor,estilo);
    }


    @Override
    public void aplicarCor() {
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um triângulo");
        cor.aplicarCor();
        estilo.definirEstilo();
    }

    @Override
    public void aplicarEstilo() {

    }
}
