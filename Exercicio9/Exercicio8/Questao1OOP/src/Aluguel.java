public class Aluguel {
    private double valor;
    private int desconto;

    public Aluguel(double valor, int desconto) {
        this.valor = valor;
        this.desconto = desconto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
}
