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
                case 7:
                    continuar=false;
                    break;
            }


        }

    }

    public static void exercicio1(){
        Scanner sc = new Scanner(System.in);
        int cmChico = 150;
        int cmJuca = 110;
        int anos = 0;
        while (cmJuca < cmChico){
            cmJuca+= 3;
            cmChico += 2;
            anos++;
        }

        System.out.println(anos);
    }

    public static void exercicio2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digie o limite inferior");
        int limiteInferior = sc.nextInt();
        System.out.println("Digie o limite superior");
        int limiteSuperior = sc.nextInt();
        int soma = 0;
        while (limiteInferior < limiteSuperior){
            if(limiteInferior % 2 == 0){
                System.out.print(limiteInferior + " ");
                soma += limiteInferior;
            }
            limiteInferior++;
        }

        System.out.println("\n Soma " + soma);
    }

    public static void exercicio3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        if(ePrimo(numero)){
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }


    }

    public static boolean ePrimo(int numero){
        if(numero < 2){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(numero); i++){
            if(numero % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void exercicio4(){
        Scanner sc = new Scanner(System.in);
        String senha = "1234";
        String senhaUsuario = "";
        for (int i = 0; i < 3;i++){
            System.out.println("Tente uma senha: ");
            senhaUsuario = sc.nextLine();
            if(senhaUsuario.equals(senha)){
                System.out.println("Senha correta!");
                break;
            } else {
                System.out.println("Senha incorreta!");
            }

            if(i == 2){
                System.out.println("Acabaram as chances");
            }
        }


    }

    public static void exercicio5(){
        Scanner sc = new Scanner(System.in);
        int numeroAdivinhar = 5;
        int numeroUsuario = 0;
        while (numeroAdivinhar != numeroUsuario){
            System.out.println("Adivinhe o número de 1-10");
            numeroUsuario = sc.nextInt();

            if(numeroAdivinhar == numeroUsuario){
                System.out.println("Acertou");
                break;
            }

            System.out.println("Número errado");
        }
    }

}