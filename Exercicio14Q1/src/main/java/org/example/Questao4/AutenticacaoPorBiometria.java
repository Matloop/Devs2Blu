package org.example.Questao4;

public class AutenticacaoPorBiometria implements EstrategiaAutenticacao {
    @Override
    public boolean autenticar(String idBiometrico, String credencial) {
        System.out.println("Autenticando por biometria");
        return idBiometrico.equals("id");
    }
}
