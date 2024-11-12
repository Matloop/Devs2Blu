package br.com.exemplo.bridge.cores.questao2.formato;

public class FormatoCSV implements FormatoExportacao {

    @Override
    public String exportarDados(String[] dados) {
        return String.join(",", dados);
    }
}