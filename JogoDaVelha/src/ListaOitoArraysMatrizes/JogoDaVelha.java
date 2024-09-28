package ListaOitoArraysMatrizes;

import java.util.Scanner;

public class JogoDaVelha {
    private char[][] jogoVelha;
    private int jogada;
    char sinal;
    int linha, coluna;
    boolean ganhou = false;
    Scanner scan = new Scanner(System.in);


    public JogoDaVelha() {
        jogoVelha = new char[3][3];
    }

    public void start(){
        while (!ganhou){
            verificarJogador();

            jogadaLinha();

            jogadaColuna();

            verificarPosicaoInvalida();

            imprimirTabuleiro();

            verificarGanhador();
        }
    }

    public void verificarJogador(){
        if (jogada % 2 == 1){ //jogador 1
            System.out.println("Vez do Jogador 1. Escolha linha e coluna (1-3)");
            sinal = 'X';
        } else {
            System.out.println("Vez do Jogador 2. Escolha linha e coluna (1-3)");
            sinal = 'O';
        }
    };

    public void jogadaLinha(){
        boolean linhaValida = false;
        while (!linhaValida){
            System.out.println("Entre com a linha (1, 2 ou 3)");
            linha = scan.nextInt();
            if (linha >=1 && linha <=3){
                linhaValida = true;
            } else {
                System.out.println("Entrada inválida, tente novamente");
            }
        }
    }

    public void jogadaColuna(){
        boolean colunaValida = false;
        while (!colunaValida){
            System.out.println("Entre com a coluna (1, 2 ou 3)");
            coluna = scan.nextInt();
            if (coluna >=1 && coluna <=3){
                colunaValida = true;
            } else {
                System.out.println("Entrada inválida, tente novamente");
            }
        }
    }

    public void verificarPosicaoInvalida(){
        System.out.println("antes linha " + linha + "antes comluna " + coluna);
        //verifica posição válida
        linha--;
        coluna--;
        System.out.println("linha " + linha + "comluna " + coluna);
        if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O'){
            System.out.println("Posição já usada, tente novamente");
        } else {
            jogoVelha[linha][coluna] = sinal;
            jogada++;
        }
    }

    public void imprimirTabuleiro(){
        for (int i=0; i<jogoVelha.length; i++){
            for (int j=0; j<jogoVelha[i].length; j++){
                System.out.print(jogoVelha[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public void verificarGanhador(){
        if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') || //linha 1
                (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X')	|| //linha 2
                (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || //linha 3
                (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || //coluna 1
                (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || //coluna 2
                (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || //coluna 3
                (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')) { //diagonal
            ganhou = true;
            System.out.println("Parabéns, jogador 1 ganhou!");
        } else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') || //linha 1
                (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O')	|| //linha 2
                (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') || //linha 3
                (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') || //coluna 1
                (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') || //coluna 2
                (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') || //coluna 3
                (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')) { //diagonal
            ganhou = true;
            System.out.println("Parabéns, jogador 2 ganhou!");
        } else if (jogada > 9){
            ganhou = true;
            System.out.println("Ninguém ganhou essa partida.");
        }
    }
}
