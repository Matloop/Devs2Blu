package listaexercicios12.principioSRP.ex1;

public class LivrosService {
    public void alugar(Livro livro) {
        if (!livro.isAlugado()) {
            livro.setAlugado(true);
            System.out.println("O livro " + livro.getTitulo() + " foi alugado.");
        } else {
            System.out.println("O livro " + livro.getTitulo() + " já está alugado.");
        }
    }

    public void gerarRelatorio(Livro livro) {
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Categoria: " + livro.getCategoria());
        System.out.println("Status: " + (livro.isAlugado() ? "Alugado" : "Disponível"));
    }
}
