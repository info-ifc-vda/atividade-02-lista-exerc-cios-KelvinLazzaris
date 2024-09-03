/* Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os
códigos de dez contas e seus respectivos saldos. Os códigos devem ser armazenados
em um vetor de números inteiros (não pode haver mais de uma conta com o mesmo
código) e os saldos devem ser armazenados em um vetor de números reais. O saldo
deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta 504 foi
armazenada na quinta posição do vetor de códigos, seu saldo deverá ficar na quinta
posição do vetor de saldos. Depois de fazer a leitura dos valores, deverá aparecer o
seguinte menu na tela:

• Efetuar depósito
• Efetuar saque
• Consultar o ativo bancário (soma de todos os saldos)
• Finalizar programa

Obs.1: ao depositar, deve-se solicitar o valor e o código da conta a receber o depósito.

Obs.2: para sacar, a mesma coisa. Também, deve-se verificar se tem saldo suficiente
para o saque. */

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] codigosContas = new int[10];
        double[] saldos = new double[10];

        for (int i = 0; i < 2; i++) {
            System.out.print("\nDigite o código da conta " + (i + 1) + ": ");
            codigosContas[i] = scanner.nextInt();

            for (int j = 0; j < i; j++) {
                if (codigosContas[i] == codigosContas[j]) {
                    System.out.println("Código já existente. Por favor, insira um código diferente.");
                    i--;
                    break;
                }
            }

            System.out.print("Digite o saldo da conta " + codigosContas[i] + ": ");
            saldos[i] = scanner.nextDouble();
        }

        // Menu
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Efetuar depósito");
            System.out.println("2. Efetuar saque");
            System.out.println("3. Consultar o ativo bancário");
            System.out.println("4. Finalizar programa");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("\nDigite o código da conta para depósito: ");
                int codigo = scanner.nextInt();

                // Procura o código da conta no vetor
                int index = -1;
                for (int i = 0; i < codigosContas.length; i++) {
                    if (codigosContas[i] == codigo) {
                        index = i;
                        break;
                    }
                }

                if (index != -1) {
                    System.out.print("\nDigite o valor do depósito: ");
                    double valor = scanner.nextDouble();
                    saldos[index] += valor;
                    System.out.println("\nDepósito efetuado com sucesso! Novo saldo: " + saldos[index]);
                } else {
                    System.out.println("\nConta não encontrada.");
                }

            } else if (opcao == 2) {
                System.out.print("\nDigite o código da conta para saque: ");
                int codigo = scanner.nextInt();

                // Procura o código da conta no vetor
                int index = -1;
                for (int i = 0; i < codigosContas.length; i++) {
                    if (codigosContas[i] == codigo) {
                        index = i;
                        break;
                    }
                }

                if (index != -1) {
                    System.out.print("\nDigite o valor do saque: ");
                    double valor = scanner.nextDouble();
                    if (saldos[index] >= valor) {
                        saldos[index] -= valor;
                        System.out.println("\nSaque efetuado com sucesso! Novo saldo: " + saldos[index]);
                    } else {
                        System.out.println("\nSaldo insuficiente.");
                    }
                } else {
                    System.out.println("\nConta não encontrada.");
                }

            } else if (opcao == 3) {
                double soma = 0;
                for (double saldo : saldos) {
                    soma += saldo;
                }
                System.out.println("\nAtivo bancário total: " + soma);

            } else if (opcao == 4) {
                System.out.println("\nFinalizando programa...");
            } else {
                System.out.println("\nOpção inválida. Tente novamente.");
            }

        } while (opcao != 4);
    }
}