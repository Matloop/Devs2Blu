package org.example.Questao2;

public class NotificacaoPushService implements NotificacaoPush {

    @Override
    public void enviarPush() {
        System.out.println("Enviando notificação push: ");
    }
}
