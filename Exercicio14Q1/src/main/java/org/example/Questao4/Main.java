package org.example.Questao4;

public class Main {
    public static void main(String[] args) {

        EstrategiaAutenticacao autenticacaoEmail = new AutenticacaoPorEmail();
        Usuario usuarioEmail = new Usuario(autenticacaoEmail);
        boolean loginEmail = usuarioEmail.login("matheus@gmail.com", "senha123");
        System.out.println("Login por e-mail: " + (loginEmail ? "Sucesso" : "Falhou"));

        EstrategiaAutenticacao autenticacaoBiometria = new AutenticacaoPorBiometria();
        Usuario usuarioBiometria = new Usuario(autenticacaoBiometria);
        boolean loginBiometria = usuarioBiometria.login("id", "");
        System.out.println("Login por biometria: " + (loginBiometria ? "Sucesso" : "Falhou"));
    }
}
