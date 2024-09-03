/* Faça um programa que, dados 2 vetores com 10 números inteiros cada, gere e imprima um vetor dos números não comuns aos vetores */

import java.util.Arrays;

public class Ex_2 {
    public static void main(String[] args) {
        
        int[] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetor2 = {5, 6, 7, 8, 11, 12, 13, 14, 15, 16};
        
        int[] numerosNaoComuns = new int[vetor1.length + vetor2.length];
        int count = 0;
        
        for (int i = 0; i < vetor1.length; i++) {

            boolean encontrado = false;

            for (int j = 0; j < vetor2.length; j++) {
                if (vetor1[i] == vetor2[j]) {
                    encontrado = true;
                    break;
                }
            }

            if (encontrado != true) {
                numerosNaoComuns[count++] = vetor1[i];
            }
        }

        for (int i = 0; i < vetor2.length; i++) {

            boolean encontrado = false;

            for (int j = 0; j < vetor1.length; j++) {
                if (vetor2[i] == vetor1[j]) {
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                numerosNaoComuns[count++] = vetor2[i];
            }
        }
        
        int[] vetorNaoComum = Arrays.copyOf(numerosNaoComuns, count);

        System.out.println("\nNúmeros não comuns aos vetores:");

        for (int num : vetorNaoComum) {
            System.out.print(num + " ");
        }
    }
}