package org.example.Questao3;

public class BancoDeDados implements ArmazenamentoDados {
    @Override
    public void armazenar(String dados) {
        System.out.println("Armazenando dados no Banco de Dados: " + dados);
    }
}
