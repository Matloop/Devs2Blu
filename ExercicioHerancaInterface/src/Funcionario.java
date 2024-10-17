public class Funcionario {
    private String nome;
    private String tipo;
    private int codigo;

    public Funcionario(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }
}
