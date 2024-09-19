import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha o exercicio(1-4): ");

            System.out.println("Digite 7 para sair");
            int selectExercicio = sc.nextInt();

            switch (selectExercicio) {
                case 1:
                    exercicio1();
                    break;
                case 2:
                    exercicio2();
                    break;
                case 3:
                    exercicio3();
                    break;
                case 4:
                    exercicio4();
                    break;
                case 7:
                    continuar = false;
                    break;
            }
        }

    }

    public static void exercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é impar");
        }
    }

    public static void exercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade do nadador");
        int idade = sc.nextInt();
        if (idade >= 5 && idade <= 7) {
            System.out.println("Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Juvenil B");
        } else {
            System.out.println("Adulto");
        }
    }

    public static void exercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o fruto, laranja(a), limão(b), morango(c)");
        String fruta = sc.next();
        System.out.println("Informe o preço unitário");
        double precoUnitario = sc.nextInt();
        switch (fruta) {
            case "a":
                System.out.println("O valor da caixa de laranja com 60 unidades é: " + (60 * precoUnitario));
                break;
            case "b":
                System.out.println("O valor da caixa de limão com 80 unidades é: " + (80 * precoUnitario));
                break;
            case "c":
                System.out.println("O valor da caixa de morango com 20 unidades é: " + (20 * precoUnitario));
                break;
            default:
                System.out.println("Erro");
        }
    }

    public static void exercicio4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero 1: ");
        double numero1 = sc.nextInt();
        System.out.println("Numero 2: ");
        double numero2 = sc.nextInt();
        System.out.println("Operação: divisão(/), multiplicação(*), adição(+) e subtração(-)");
        String operacao = sc.next();
        switch (operacao) {
            case "/":
                System.out.println(numero1 / numero2);
                break;
            case "*":
                System.out.println(numero1 * numero2);
                break;
            case "-":
                System.out.println(numero1 - numero2);
                break;
            case "+":
                System.out.println(numero1 + numero2);
                break;
            default:
                System.out.println("erro");
        }
    }
}