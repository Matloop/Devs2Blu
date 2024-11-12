package br.com.exemplo.bridge.cores.questao1.formas;

import br.com.exemplo.bridge.cores.questao1.cores.Cor;
import br.com.exemplo.bridge.cores.questao1.cores.Estilo;

//Abstra��o
public abstract class Forma {
 protected Cor cor;
 protected Estilo estilo;

 // Construtor que recebe uma implementa��o de cor
 protected Forma(Cor cor,Estilo estilo) {
     this.cor = cor;
     this.estilo = estilo;
 }

    public abstract void aplicarCor();

    public abstract void desenhar();

    public abstract void aplicarEstilo();
}
