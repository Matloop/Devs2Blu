import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProjetoPesquisa {
    private int codigo;
    private String titulo;
    private String dataInicio;
    private String dataFim;
    private Professor professorResponsavel;
    private List<Pesquisador> equipe;

    public ProjetoPesquisa(int codigo, String titulo, String dataInicio, String dataFim, Professor professorResponsavel) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.professorResponsavel = professorResponsavel;
        this.equipe = new ArrayList<>();
        this.equipe.add(professorResponsavel); // Adiciona o professor responsável à equipe automaticamente
    };

    public void inserirPesquisador(Pesquisador pesquisador) {
        this.equipe.add(pesquisador);
    }

    public void mostrarProjeto(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Data de inicio: " + this.dataInicio);
        System.out.println("Data de fim: " + this.dataFim);
        System.out.println("Professor responsável: " + this.professorResponsavel.getNome());

        StringBuilder equipeMostrar = new StringBuilder();
        for (Pesquisador pesquisador : this.equipe) {
            equipeMostrar.append(pesquisador.getNome());
            equipeMostrar.append(" - ");
        }

        System.out.println("Equipe: " + equipeMostrar.toString());
    }

    public int getCodigo(){
        return this.codigo;
    }

}
