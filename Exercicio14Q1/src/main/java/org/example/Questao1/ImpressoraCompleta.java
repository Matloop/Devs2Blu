package org.example.Questao1;

public class ImpressoraCompleta implements ImpressoraTexto,ImpressoraImagem,ImpressoraRelatorioFinanceiro {

    @Override
    public void imprimirImagem() {
        System.out.println("Imprimir imagem");
    }

    @Override
    public void imprimirRelatorio() {
        System.out.println("Imprimindo relatório");
    }

    @Override
    public void imprimirTexto() {
        System.out.println("Imprimindo texto");
    }
}
