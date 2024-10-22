package listaexercicios12.principioSRP.ex2;

public class ContaService {
    private HistoricoTransacoes historicoTransacoes;

    public ContaService(HistoricoTransacoes historicoTransacoes) {
        this.historicoTransacoes = historicoTransacoes;
    }

    public void depositar(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        historicoTransacoes.fazerTransacoes("Depósito de: " + valor);
    }

    public void sacar(Conta conta, double valor) {
        if (valor <= conta.getSaldo()) {
            conta.setSaldo(conta.getSaldo() - valor);
            historicoTransacoes.fazerTransacoes("Saque de: " + valor);
        } else {
            historicoTransacoes.fazerTransacoes("Tentativa de saque sem saldo suficiente: " + valor);
        }
    }

    public void gerarRelatorioSaldo(Conta conta) {
        System.out.println("Relatório de Saldo");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo atual: " + conta.getSaldo());
    }

    public void exibirRelatorioTransacao() {
        historicoTransacoes.gerarRelatorioTransacoes();
    }
}
