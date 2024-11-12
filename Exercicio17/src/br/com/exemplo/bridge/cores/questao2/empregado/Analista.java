package br.com.exemplo.bridge.cores.questao2.empregado;


import br.com.exemplo.bridge.cores.questao2.formato.FormatoExportacao;

public class Analista extends Empregado {
    public Analista(String nome, int idade, double salario, FormatoExportacao formato) {
        super(nome, idade, salario,formato);
    }
}
