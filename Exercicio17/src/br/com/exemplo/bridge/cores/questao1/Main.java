package br.com.exemplo.bridge.cores.questao1;

import br.com.exemplo.bridge.cores.questao1.cores.*;
import br.com.exemplo.bridge.cores.questao1.formas.Circulo;
import br.com.exemplo.bridge.cores.questao1.formas.Forma;
import br.com.exemplo.bridge.cores.questao1.formas.Quadrado;
import br.com.exemplo.bridge.cores.questao1.formas.Triangulo;

public class Main {
    public static void main(String[] args) {

        Forma circulo = new Circulo(new Azul(),new Tracejado());
        circulo.desenhar();
        System.out.println();
        Forma quadrado = new Quadrado(new Vermelho(),new Tracejado());

        quadrado.desenhar();
        System.out.println();
        Forma triangulo = new Triangulo(new Azul(),new Solido());

        triangulo.desenhar();
    }
}