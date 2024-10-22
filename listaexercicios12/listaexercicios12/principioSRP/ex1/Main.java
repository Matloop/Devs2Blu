package listaexercicios12.principioSRP.ex1;

public class Main {
    public static void main(String[] args) {
        Categoria ficcao = new Categoria("Ficção");
        Categoria aventura = new Categoria("Aventura");

        Autor autor1 = new Autor("J.K. Rowling");
        Autor autor2 = new Autor("J.R.R. Tolkien");

        Livro livro1 = new Livro("Harry Potter", autor1, ficcao);
        Livro livro2 = new Livro("O Senhor dos Anéis", autor2, aventura);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        BibliotecaService bibliotecaService = new BibliotecaService();
        LivrosService livrosService = new LivrosService();

        System.out.println("Livros disponíveis na biblioteca:");
        bibliotecaService.mostrarLivros(biblioteca);
        System.out.println();

        System.out.println("Tentando alugar o livro 'Harry Potter':");
        livrosService.alugar(livro1);
        System.out.println();

        System.out.println("Relatório dos livros:");
        bibliotecaService.gerarRelatorioLivros(biblioteca);
    }
}
