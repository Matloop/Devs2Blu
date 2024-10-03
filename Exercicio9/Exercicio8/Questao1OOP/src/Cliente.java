public class Cliente {
    private String nome;
    private String telefone;
    private Endereco endereco;
    private Tema tema;
    private Aluguel aluguel;
    public Cliente(String nome, String telefone, Endereco endereco, Tema tema, Aluguel aluguel) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.tema = tema;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Tema getTema() {
        return tema;
    }
    public void setTema(Tema tema) {
        this.tema = tema;
    }
    public Aluguel getAluguel() {
        return aluguel;
    }
    public void setAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
    }
}

