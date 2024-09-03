/* Faça um programa que dados 2 vetores inteiros de tamanhos 10 e 5, respectivamente, calcule e mostre 2 vetores resultantes:

• no primeiro vetor resultante, cada elemento será composto pela soma de cada número par do primeiro vetor somado a todos os números do segundo vetor;

• o segundo vetor resultante será composto pela quantidade de divisores que cada número ímpar do primeiro vetor tem no segundo vetor. */

public class Ex_3 {
    public static void main(String[] args) {

        int[] vetor1 = {2, 5, 8, 13, 7, 6, 4, 9, 10, 15}; 
        int[] vetor2 = {3, 5, 7, 11, 13}; 

        int[] resultado1 = new int[vetor1.length];
        int[] resultado2 = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            int soma = 0;
            if (vetor1[i] % 2 == 0) { 
                for (int j = 0; j < vetor2.length; j++) {
                    soma += vetor2[j];
                }
                resultado1[i] = vetor1[i] + soma;
            }
        }

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 2 != 0) { 
                int contadorDivisores = 0;
                for (int j = 0; j < vetor2.length; j++) {
                    if (vetor1[i] % vetor2[j] == 0) { 
                        contadorDivisores++;
                    }
                }
                resultado2[i] = contadorDivisores;
            }
        }

        System.out.println("\nPrimeiro vetor resultante:");

        for (int i = 0; i < resultado1.length; i++) {
            System.out.print(resultado1[i] + " ");
        }

        System.out.println("\n\nSegundo vetor resultante:");

        for (int i = 0; i < resultado2.length; i++) {
            System.out.print(resultado2[i] + " ");
        }
    }
}