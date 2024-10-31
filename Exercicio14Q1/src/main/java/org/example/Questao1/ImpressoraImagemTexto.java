package org.example.Questao1;

public class ImpressoraImagemTexto implements ImpressoraImagem,ImpressoraTexto {

    @Override
    public void imprimirImagem() {
        System.out.println("Imprimindo imagem");
    }

    @Override
    public void imprimirTexto() {
        System.out.println("Imprimindo texto");
    }
}
