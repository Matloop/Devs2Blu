package listaexercicios12.principioSRP.ex2;

import java.util.ArrayList;
import java.util.List;

public class HistoricoTransacoes {
    private List<String> transacoes;

    public HistoricoTransacoes() {
        this.transacoes = new ArrayList<>();
    }

    public void gerarRelatorioTransacoes() {
        System.out.println("Relatório de Transações");
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }
    }

    public void fazerTransacoes(String transacao) {
        transacoes.add(transacao);
    }
}
