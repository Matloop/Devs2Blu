package org.example.Questao4;

public class AutenticacaoPorEmail implements EstrategiaAutenticacao {
    @Override
    public boolean autenticar(String email, String senha) {
        System.out.println("Autenticando por e-mail");
        return email.equals("matheus@gmail.com") && senha.equals("senha123");
    }
}
