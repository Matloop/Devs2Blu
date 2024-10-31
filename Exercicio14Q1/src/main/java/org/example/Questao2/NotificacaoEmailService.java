package org.example.Questao2;

public class NotificacaoEmailService implements NotificacaoEmail {
    @Override
    public void enviarEmail() {
        System.out.println("Enviando e-mail: ");
    }
}