package br.com.exemplo.bridge.cores.questao2.empregado;


import br.com.exemplo.bridge.cores.questao2.formato.FormatoExportacao;

import java.sql.Array;

public class Secretaria extends Empregado {
    public Secretaria(String nome, int idade, double salario, FormatoExportacao formato) {
        super(nome, idade, salario,formato);
    }



}
