/* Faça um programa que leia um conjunto não determinado de valores, um de cada vez, e
escreva uma tabela com cabeçalho, que deve ser repetido a cada vinte linhas. A tabela
deverá conter o valor lido, seu cubo e sua raiz quadrada. Finalize quando a entrada for
um número negativo ou 0. */

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        while (true) {
            System.out.print("\nDigite um número (ou um número negativo/zero para sair): ");
            double valor = scanner.nextDouble();

            if (valor <= 0) {
                break;
            }

            double cubo = Math.pow(valor, 3);
            double raizQuadrada = Math.sqrt(valor);

            System.out.printf("%-15.2f %-15.2f %-15.2f%n", valor, cubo, raizQuadrada);

            contador++;

            if (contador % 20 == 0) {
                System.out.println();
                System.out.printf("%-15s %-15s %-15s%n", "Valor", "Cubo", "Raiz Quadrada");
                System.out.println("----------------------------------------------------");
            }
        }
    }
}