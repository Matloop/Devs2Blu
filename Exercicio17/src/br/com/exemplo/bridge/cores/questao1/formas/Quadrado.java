package br.com.exemplo.bridge.cores.questao1.formas;

import br.com.exemplo.bridge.cores.questao1.cores.Cor;
import br.com.exemplo.bridge.cores.questao1.cores.Estilo;

//Abstra��o Refinada para um Quadrado
public class Quadrado extends Forma {
 public Quadrado(Cor cor, Estilo estilo) {
     super(cor,estilo);
 }

    @Override
    public void aplicarCor() {

    }

    @Override
 public void desenhar() {
     System.out.println("Desenhando um quadrado");
     cor.aplicarCor();
     estilo.definirEstilo();

 }

    @Override
    public void aplicarEstilo() {

    }
}
