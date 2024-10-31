package org.example.Questao2;

public class NotificacaoSMSService implements NotificacaoSMS {
    @Override
    public void enviarSMS() {
        System.out.println("Enviando SMS: ");
    }
}
