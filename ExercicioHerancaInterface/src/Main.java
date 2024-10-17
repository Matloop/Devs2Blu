public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Nathan","sdfsdf");
        Aluno aluno2 = new Aluno("Felipe","sdfsdf");
        Professor professorPrincipal = new Professor("Arquelau","sdfsdf",56);
        Professor prof2 = new Professor("Almeida","sdfsdf",32132);
        ProjetoPesquisa projeto = new ProjetoPesquisa(1,"ProjetoCiencia","20/08/2024","20/10/2024",professorPrincipal);
        projeto.inserirPesquisador(aluno1);
        projeto.inserirPesquisador(aluno2);
        projeto.inserirPesquisador(prof2);
        projeto.mostrarProjeto();

    };
}