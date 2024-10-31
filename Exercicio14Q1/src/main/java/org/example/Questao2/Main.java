package org.example.Questao2;

public class Main {
    public static void main(String[] args) {

        NotificacaoEmail notificacaoEmail = new NotificacaoEmailService();
        notificacaoEmail.enviarEmail();

        NotificacaoSMS notificacaoSMS = new NotificacaoSMSService();
        notificacaoSMS.enviarSMS();

        NotificacaoPushService notificacaoPushService = new NotificacaoPushService();
        notificacaoPushService.enviarPush();
    }
}
