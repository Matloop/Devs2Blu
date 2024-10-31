package org.example.Questao3;

public class Armazenamento {
    private ArmazenamentoDados mecanismoArmazenamento;

    public Armazenamento(ArmazenamentoDados mecanismoArmazenamento) {
        this.mecanismoArmazenamento = mecanismoArmazenamento;
    }

    public void salvarDados(String dados) {
        mecanismoArmazenamento.armazenar(dados);
    }
}
