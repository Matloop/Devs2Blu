package org.example.Questao1;

public class Main {
    public static void main(String[] args) {
        ImpressoraBasica impBasica = new ImpressoraBasica();
        ImpressoraImagemTexto impImagem = new ImpressoraImagemTexto();
        ImpressoraCompleta impCompleta = new ImpressoraCompleta();

        impBasica.imprimirTexto();

        impImagem.imprimirTexto();
        impImagem.imprimirImagem();

        impCompleta.imprimirTexto();
        impCompleta.imprimirImagem();
        impCompleta.imprimirRelatorio();
    }
}
