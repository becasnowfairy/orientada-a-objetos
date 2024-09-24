package Sessao3.PARTEI;

import java.util.Scanner;

public class parte1 {
    
    public static void main(String[] args) {
        // Task 1: Declare um vetor de 5 números inteiros e, de seguida, leia e guarde no mesmo os valores fornecidos pelo utilizador. Por fim, calcule e mostre a soma de todos os elementos.
        int[] vetor5 = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduza 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            vetor5[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += vetor5[i];
        }

        System.out.println("A soma dos elementos é: " + soma);

        // Task 2: Declare um vetor de 10 inteiros. De seguida, leia e guarde no mesmo os valores introduzidos pelo utilizador. Por fim, mostre os maior e menor valores.
        int[] vetor10 = new int[10];

        System.out.println("Introduza 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor10[i] = scanner.nextInt();
        }

        int max = vetor10[0];
        int min = vetor10[0];
        for (int i = 1; i < 10; i++) {
            if (vetor10[i] > max) {
                max = vetor10[i];
            }
            if (vetor10[i] < min) {
                min = vetor10[i];
            }
        }

        System.out.println("O maior valor é: " + max);
        System.out.println("O menor valor é: " + min);

        // Task 3: Solicite e leia 10 números inteiros e armazene-os num vetor. O programa deve pedir ao utilizador um número e verificar se o mesmo existe no vetor, mostrando a posição em que foi encontrado ou uma mensagem de que o número não está no vetor.
        int[] vetorSearch = new int[10];

        System.out.println("Introduza 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetorSearch[i] = scanner.nextInt();
        }

        System.out.println("Introduza um número para procurar:");
        int num = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (vetorSearch[i] == num) {
                System.out.println("O número foi encontrado na posição " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("O número não está no vetor.");
        }

        // Task 4: Crie um programa que solicite e leia 10 números inteiros introduzidos pelo utilizador e armazene-os num vetor. O programa deve garantir que não sejam digitados valores repetidos, solicitando uma nova entrada caso haja duplicação.
        int[] vetorUnique = new int[10];

        System.out.println("Introduza 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            boolean duplicate = false;
            int valor = scanner.nextInt();
            for (int j = 0; j < i; j++) {
                if (vetorUnique[j] == valor) {
                    System.out.println("Valor duplicado. Introduza novamente:");
                    i--; // retry
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                vetorUnique[i] = valor;
            }
        }
    }
}