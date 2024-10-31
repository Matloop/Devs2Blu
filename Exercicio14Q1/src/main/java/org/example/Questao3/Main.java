package org.example.Questao3;

public class Main {
    public static void main(String[] args) {
        Armazenamento armazenamentoBanco = new Armazenamento(new BancoDeDados());
        armazenamentoBanco.salvarDados("Dados importantes para o Banco de Dados");

        Armazenamento armazenamentoArquivo = new Armazenamento(new ArquivoDeTexto());
        armazenamentoArquivo.salvarDados("Dados importantes para o Arquivo de Texto");
    }
}
