package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o exercício: ");
        int exercicio = sc.nextInt() ;

        switch (exercicio){
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
            case 5:
                exercicio5();
                break;
            case 6:
                exercicio6();
                break;
            case 7:
                exercicio7();
                break;
            case 8:
                exercicio8();
                break;
            case 9:
                exercicio9();
                break;
            case 10:
                exercicio10();
                break;

        }
    }

    public static void exercicio1(){
        double saldo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o saldo: ");
        saldo = sc.nextInt();

        System.out.println("O saldo com reajuste é " + (saldo + (saldo / 100)));
    }
    public static void exercicio2(){
        double media1 = 0;
        double media2 = 0;

        media1 = (8 + 9 + 7) / 3;
        media2 = ((4+5+6) / 3);

        System.out.println("A média 1 é "+ (8 + 9 + 7) / 3);
        System.out.println("A média 1 é "+ (4+5+6) / 3);


        System.out.println("A soma das médias é " + (media1 + media2));

        System.out.println("A média das médias é " + (media1 + media2) / 2);
    }
    public static void exercicio3(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor 1: ");
        int valor1 = sc.nextInt();

        System.out.println("Digite o valor 1: ");
        int valor2 = sc.nextInt();

        System.out.println(valor1 + valor2);
        System.out.println((valor1 + valor2) * 2 );
    }
    public static void exercicio4(){
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        double idadeAleatorio =  Math.random() * 101;

        System.out.printf("A sua idade é " + Math.round(idadeAleatorio) );
    }
    public static void exercicio5(){
        Scanner sc = new Scanner(System.in);

        int minutosUsados = sc.nextInt();

        double valorMinuto = 2.30 / 60;

        System.out.println("Você pagará " + valorMinuto * minutosUsados );

    }
    public static void exercicio6(){
        Scanner sc = new Scanner(System.in);
        int numFolhas = 0;
        double total = 0;

        System.out.println("Digite o número de folhas: ");

        numFolhas = sc.nextInt();
        total = numFolhas * 0.16;

        System.out.println("O total a ser pago é 1 R$1" + total );
    }
    public static void exercicio7(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora: ");

        int horaInformada = 0;
        horaInformada = sc.nextInt();

        System.out.println("Minutos: " + horaInformada * 60);
        System.out.println("Segundos: " + horaInformada * 60 * 60);
    }
    public static void exercicio8(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor: ");

        double valorInformado = sc.nextDouble();
        double novoValor = (valorInformado / 100) * 91;

        System.out.println("O valor com desconto é " + novoValor);
    }
    public static void exercicio9(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o sálario: ");

        double salarioBase = sc.nextDouble();
        salarioBase = (salarioBase / 100) * 98;

        System.out.println("O sálario pós correção é " + salarioBase);
    }
    public static void exercicio10(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o sálario: ");

        int valor = sc.nextInt();
        int novovalor = (valor / 100) * 98;

        System.out.println("O sálario com reajustes é " + novovalor );
    }
}