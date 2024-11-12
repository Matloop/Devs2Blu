package br.com.exemplo.bridge.cores.questao2.empregado;


import br.com.exemplo.bridge.cores.questao2.formato.FormatoExportacao;

public abstract class Empregado {
    String nome;
    int idade;
    double salario;
    protected FormatoExportacao formato;

    public Empregado(String nome, int idade, double salario, FormatoExportacao formato) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.formato = formato;
    }

    public String exportar() {
        String[] dados = {nome, String.valueOf(idade), String.valueOf(salario)};
        return formato.exportarDados(dados);
    }
}
