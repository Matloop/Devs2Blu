import Questao1.factory.TemaClaroFactory;
import Questao1.factory.TemaEscuroFactory;
import Questao1.factory.TemaFactory;
import Questao1.model.Label;
import Questao1.model.TextBox;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner para receber input do usuário
        Scanner scanner = new Scanner(System.in);

        // Inicializa com o tema Claro
        TemaFactory temaFactory = new TemaClaroFactory();
        Label label = temaFactory.createLabel();
        TextBox textBox = temaFactory.createTextBox();

        // Renderiza os componentes do Tema Claro
        System.out.println("Usando o Tema Claro:");
        label.paint();
        textBox.paint();

        // Alternância de temas
        while (true) {
            System.out.println("\nDeseja alternar para o outro tema? (sim/não)");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                // Alterna para o tema Escuro
                if (temaFactory instanceof TemaClaroFactory) {
                    temaFactory = new TemaEscuroFactory();
                    System.out.println("\nMudando para o Tema Escuro...");
                } else {
                    temaFactory = new TemaClaroFactory();
                    System.out.println("\nMudando para o Tema Claro...");
                }

                // Cria os componentes com a nova fábrica
                label = temaFactory.createLabel();
                textBox = temaFactory.createTextBox();

                // Renderiza os componentes do novo tema
                label.paint();
                textBox.paint();
            } else {
                System.out.println("Encerrando programa.");
                break;
            }
        }

        // Fechar scanner
        scanner.close();
    }
}
