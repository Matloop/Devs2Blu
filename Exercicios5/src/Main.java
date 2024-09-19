import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar  =true;
        while (continuar) {
            System.out.println("Escolha o exercicio(1-6): ");

            System.out.println("Digite 7 para sair");
            int selectExercicio = sc.nextInt();

            switch (selectExercicio){
                case 1:exercicio1();
                    break;
                case 2:exercicio2();
                    break;
                case 3:exercicio3();
                    break;
                case 4:exercicio4();
                    break;
                case 5:exercicio5();
                    break;
                case 6:exercicio6();
                    break;
                case 7:
                    continuar=false;
                    break;
            }


        }

    }

    public static void exercicio1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor da compra: ");
        int valorCompra = sc.nextInt();
        System.out.println("Valor do pagamento: ");
        int valorPagamento = sc.nextInt();
        int nota100 = 0;
        int nota10 = 0;
        int nota1= 0;
        while (valorPagamento != valorCompra){
            if(valorPagamento - valorCompra >= 100){
                valorCompra += 100;
                nota100 ++;
            } else if(valorPagamento - valorCompra >= 10){
                valorCompra += 10;
                nota10 ++;
            } else if(valorPagamento - valorCompra >= 1){
                valorCompra += 1;
                nota1 ++;
            }

        }
        System.out.print(nota100 + " notas de 100, ");
        System.out.print(nota10 + " notas de 10 e ");
        System.out.print(nota1 + " notas de 1 ");
    }

    public static void exercicio2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do aluno");
        String nomeAluno = sc.next();
        System.out.println("Digite a nota 1");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a nota 3");
        double nota3 = sc.nextDouble();
        System.out.println("Digite a média dos exercícios");
        double mediaExercicio = sc.nextDouble();

        double mediaAproveitamento = ((nota1 + nota2) * 2 + (( nota3 * 3) + mediaExercicio)) / 7;
        System.out.printf(nomeAluno + " tirou conceito: ");
        if(mediaAproveitamento >= 9){
            System.out.println("A");
        } else if(mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0){
            System.out.println("B");
        } else if(mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5){
            System.out.printf("C");
        } else if(mediaAproveitamento < 6) {
            System.out.println("D");
        }
    }

    public static void exercicio3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o saldo médio");
        int saldoMedio = sc.nextInt();
        if(saldoMedio > 0 && saldoMedio <= 200){
            System.out.println(saldoMedio + " O valor do crédito vai ser: " + saldoMedio);
        } else if(saldoMedio > 200 && saldoMedio <= 300){
            System.out.println(saldoMedio + " O valor do crédito vai ser: " +( saldoMedio + (saldoMedio * 0.2)));
        } else if(saldoMedio > 400 && saldoMedio <= 600){
            System.out.println(saldoMedio + " O valor do crédito vai ser: " + (saldoMedio + (saldoMedio * 0.3)));
        } else if(saldoMedio > 600){
            System.out.println(saldoMedio + " O valor do crédito vai ser: " + (saldoMedio + (saldoMedio * 0.4)));
        }

    }

    public static void exercicio4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero 1: ");
        double numero1 = sc.nextInt();
        System.out.println("Numero 2: ");
        double numero2 = sc.nextInt();
        System.out.println("Operação: divisão(/), multiplicação(*), adição(+) e subtração(-)");
        String operacao = sc.next();
        double resultado = 0;
        switch (operacao) {
            case "/":
                resultado = (numero1 / numero2);
                break;
            case "*":
                resultado = (numero1 * numero2);
                break;
            case "-":
                resultado = (numero1 - numero2);
                break;
            case "+":
                resultado = (numero1 + numero2);
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

        System.out.println(resultado);
        if(resultado % 2 == 0){
            System.out.println("Par");
        } else{
            System.out.println("Impar");
        }

        if(resultado > 0){
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
    }

    public static void exercicio5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a letra");
        String letra = sc.next();
        String[] vogais = {"a","e","i","o","u"};
        boolean eVogal = false;
        for(String vogal : vogais){
            if(vogal.equals(letra)){
                eVogal = true;
            }
        }
        if(eVogal){
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
    }

    public static void exercicio6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        int ano = scanner.nextInt();
        boolean bissexto = false;
        if(ano % 400 == 0){
            bissexto = true;
        } else{
            if(ano % 4 == 0 && ano % 100 != 0){
                bissexto = true;
            } else {
                bissexto = false;
            }
        }

        if(bissexto){
            System.out.println("Bissexto");
        } else {
            System.out.println("Não Bissexto");
        }

    }

}