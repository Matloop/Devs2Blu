import java.security.Principal;

public class Professor extends Funcionario implements Pesquisador {

    public Professor(String nome, String tipo, int codigo) {
        super(nome,codigo);
    }
    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getTipo() {
        return "Professor";
    }
}
