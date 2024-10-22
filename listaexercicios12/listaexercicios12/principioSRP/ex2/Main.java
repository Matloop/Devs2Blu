package listaexercicios12.principioSRP.ex2;

public class Main {
	public static void main(String[] args) {
		Conta conta = new Conta("João Silva", 1000.00);
		HistoricoTransacoes historico = new HistoricoTransacoes();

		ContaService contaService = new ContaService(historico);

		contaService.depositar(conta, 200.00);
		contaService.sacar(conta, 150.00);

		contaService.gerarRelatorioSaldo(conta);
		contaService.exibirRelatorioTransacao();
	}
}

