/* Faça um programa que preencha uma matriz 7x7 de números inteiros e crie dois vetores
com sete posições cada um que contenham, respectivamente, o maior elemento de
cada uma das linhas e o menor elemento de cada uma das colunas. Escreva a matriz
e os dois vetores gerados. */

import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[7][7];
        int[] maiorLinha = new int[7];
        int[] menorColuna = new int[7];
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("\nDigite o elemento [" + i + "][" + j + "] da matriz: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < 7; i++) {
            int maior = matriz[i][0]; 
            for (int j = 1; j < 7; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }

            maiorLinha[i] = maior;
        }

        for (int j = 0; j < 7; j++) {
            int menor = matriz[0][j]; 
            for (int i = 1; i < 7; i++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }

            menorColuna[j] = menor;
        }

        System.out.println("\nMatriz 7x7:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }

        System.out.println("\n\nVetor dos maiores elementos das linhas:");

        for (int i = 0; i < 7; i++) {
            System.out.print(maiorLinha[i] + "\t");
        }
        
        System.out.println("\n\nVetor dos menores elementos das colunas:");

        for (int j = 0; j < 7; j++) {
            System.out.print(menorColuna[j] + "\t");
        }
    }
}