import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaProjetos {
    private static List<Professor> professores = new ArrayList<>();
    private static List<Aluno> alunos = new ArrayList<>();
    private static List<ProjetoPesquisa> projetos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarDados(); // Adiciona alguns dados de exemplo
        menuPrincipal();
    }

    private static void inicializarDados() {
        // Adicionando alguns professores e alunos para teste
        professores.add(new Professor("Arquelau", "P001", 5600));
        professores.add(new Professor("Almeida", "P002", 6200));
        professores.add(new Professor("Ricardo", "P003", 5800));

        alunos.add(new Aluno("Nathan", "A001"));
        alunos.add(new Aluno("Felipe", "A002"));
        alunos.add(new Aluno("Maria", "A003"));
    }

    private static void menuPrincipal() {
        while (true) {
            System.out.println("\n=== SISTEMA DE PROJETOS DE PESQUISA ===");
            System.out.println("1 - Cadastrar projeto com um integrante");
            System.out.println("2 - Cadastrar projeto com vários integrantes");
            System.out.println("3 - Cadastrar múltiplos projetos");
            System.out.println("4 - Buscar projeto por código");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    cadastrarProjetoUmIntegrante();
                    break;
                case 2:
                    cadastrarProjetoVariosIntegrantes();
                    break;
                case 3:
                    cadastrarMultiplosProjetos();
                    break;
                case 4:
                    buscarProjetoPorCodigo();
                    break;
                case 5:
                    System.out.println("Encerrando o sistema...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static Professor selecionarProfessor() {
        System.out.println("\nProfessores disponíveis:");
        for (int i = 0; i < professores.size(); i++) {
            System.out.println(i + " - " + professores.get(i).getNome());
        }
        System.out.print("Selecione o professor (número): ");
        return professores.get(scanner.nextInt());
    }

    private static Aluno selecionarAluno() {
        System.out.println("\nAlunos disponíveis:");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(i + " - " + alunos.get(i).getNome());
        }
        System.out.print("Selecione o aluno (número): ");
        return alunos.get(scanner.nextInt());
    }

    private static ProjetoPesquisa criarProjeto() {
        // Obter e validar o código
        int codigo = validarCodigo();
        scanner.nextLine(); // Limpar buffer após leitura do código

        // Obter demais informações do projeto
        System.out.print("Título do projeto: ");
        String titulo = scanner.nextLine();

        System.out.print("Data de início (dd/mm/aaaa): ");
        String dataInicio = scanner.nextLine();

        System.out.print("Data de fim (dd/mm/aaaa): ");
        String dataFim = scanner.nextLine();

        Professor professorResponsavel = selecionarProfessor();
        scanner.nextLine(); // Limpar buffer após seleção do professor

        return new ProjetoPesquisa(codigo, titulo, dataInicio, dataFim, professorResponsavel);
    }

    private static void cadastrarProjetoUmIntegrante() {
        System.out.println("\n=== CADASTRAR PROJETO COM UM INTEGRANTE ===");
        ProjetoPesquisa projeto = criarProjeto();

        System.out.println("\nAdicionar um integrante além do professor responsável:");
        System.out.println("1 - Professor");
        System.out.println("2 - Aluno");
        int tipo = scanner.nextInt();

        if (tipo == 1) {
            projeto.inserirPesquisador(selecionarProfessor());
        } else if (tipo == 2) {
            projeto.inserirPesquisador(selecionarAluno());
        }

        projetos.add(projeto);
        System.out.println("Projeto cadastrado com sucesso!");
    }

    private static void cadastrarProjetoVariosIntegrantes() {
        System.out.println("\n=== CADASTRAR PROJETO COM VÁRIOS INTEGRANTES ===");
        ProjetoPesquisa projeto = criarProjeto();

        while (true) {
            System.out.println("\nAdicionar integrante:");
            System.out.println("1 - Professor");
            System.out.println("2 - Aluno");
            System.out.println("3 - Finalizar");
            int opcao = scanner.nextInt();

            if (opcao == 3) break;

            if (opcao == 1) {
                projeto.inserirPesquisador(selecionarProfessor());
            } else if (opcao == 2) {
                projeto.inserirPesquisador(selecionarAluno());
            }
        }

        projetos.add(projeto);
        System.out.println("Projeto cadastrado com sucesso!");
    }

    private static void cadastrarMultiplosProjetos() {
        System.out.println("\n=== CADASTRAR MÚLTIPLOS PROJETOS ===");

        while (true) {
            System.out.println("\n1 - Cadastrar novo projeto");
            System.out.println("2 - Finalizar cadastro de projetos");
            int opcao = scanner.nextInt();

            if (opcao == 2) break;

            cadastrarProjetoVariosIntegrantes();
        }
    }

    private static void buscarProjetoPorCodigo() {
        System.out.print("\nDigite o código do projeto: ");
        int codigo = scanner.nextInt();

        boolean encontrado = false;
        for (ProjetoPesquisa projeto : projetos) {
            if (projeto.getCodigo() == codigo) {
                projeto.mostrarProjeto();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Projeto não encontrado!");
        }
    }

    private static int validarCodigo() {
        System.out.print("Código do projeto: ");
        int codigo = scanner.nextInt();

        while (true) {
            boolean codigoExiste = false;

            // Verifica se o código existe em algum projeto
            for (ProjetoPesquisa proj : projetos) {
                if (proj.getCodigo() == codigo) {
                    codigoExiste = true;
                    break;
                }
            }

            // Se o código não existe, retorna ele
            if (!codigoExiste) {
                return codigo;
            }

            // Se existe, pede um novo código
            System.out.println("Código já está sendo utilizado");
            System.out.print("Digite outro código: ");
            codigo = scanner.nextInt();
        }
    }


}