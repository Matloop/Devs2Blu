package org.example.Questao4;

public class Usuario {
    private EstrategiaAutenticacao estrategiaAutenticacao;

    public Usuario(EstrategiaAutenticacao estrategiaAutenticacao) {
        this.estrategiaAutenticacao = estrategiaAutenticacao;
    }

    public boolean login(String identificador, String credencial) {
        return estrategiaAutenticacao.autenticar(identificador, credencial);
    }
}
