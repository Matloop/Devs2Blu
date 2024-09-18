import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar  =true;
        while (continuar) {
            System.out.println("Escolha o exercicio: ");
            
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
        System.out.println("Insira o valor do cateto1 : ");
        double cateto1 = sc.nextDouble();
        System.out.println("Insira o valor do cateto2 : ");
        double cateto2 = sc.nextDouble();
        double hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
        System.out.println("A hipotenusa é : "+ hipotenusa);
    }

    public static void exercicio2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o lado do quadrado: ");
        double lado = sc.nextDouble();
        System.out.println("A área do quadrado é "+ lado * lado);
    }

    public static void exercicio3(){
        Scanner sc = new Scanner(System.in);
        double quantiaPaga = 1000 * 32.87;
        System.out.println("A quantia paga é " + quantiaPaga);
        double comissaoCompra = quantiaPaga * 0.02;
        System.out.println("A comissão é " + comissaoCompra);
        double quantiaVendida = 33.92 * 1000;
        double comissaoVenda = quantiaVendida * 0.02;
        System.out.println("Foi vendida por: " + quantiaVendida);
        double resto = quantiaVendida - comissaoCompra - quantiaPaga - comissaoVenda ;
        System.out.println("José deveu: " + resto + "R$");
    }

    public static void exercicio4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a velocidade: ");
        int velocidade = sc.nextInt();
        System.out.println("O carro percorrerá " + velocidade * 5 + "km em 5 horas");
        System.out.println("O carro percorrerá " + velocidade * 8 + "km em 8 horas");
        System.out.println("O carro percorrerá " + velocidade * 12 + "km em 12 horas");
    }

    public static void exercicio5(){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double d = sc.nextInt();
        double e = sc.nextInt();
        double f = sc.nextInt();

        double y = ((a * f) - (c * d)) / ((a * e) - (b * d));

        double x =((c * e)- (b * f)) / ((a * e) - (b * d));

        System.out.println("x: "  + x);
        System.out.println("y: "  + y);

    }

    public static void exercicio6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a área: ");
        double area = scanner.nextDouble();
        double acre = 4046.86;
        double pesQuadrados =  1.07639;
        double hectar = 10000;
        System.out.println("A área em acres é: " + area / acre);
        System.out.println("A área em pés quadrados é: " + area * pesQuadrados * 10);
        System.out.println("A área em hectares é: " + area / hectar);

    }

}