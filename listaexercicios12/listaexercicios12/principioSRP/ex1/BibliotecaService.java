package listaexercicios12.principioSRP.ex1;

public class BibliotecaService {

    public void gerarRelatorioLivros(Biblioteca biblioteca) {
        for (Livro livro : biblioteca.getLivros()) {
            LivrosService livrosService = new LivrosService();
            livrosService.gerarRelatorio(livro);
        }
    }

    public void mostrarLivros(Biblioteca biblioteca) {
        for (Livro livro : biblioteca.getLivros()) {
            System.out.println(livro.getTitulo());
        }
    }

    public Livro buscarLivro(Biblioteca biblioteca,String titulo) {
        for (Livro livro : biblioteca.getLivros()) {
            if (titulo.equals(livro.getTitulo())) {
                return livro;
            }
        }
        System.out.println("Livro não encontrado");
        return null;
    }
}
