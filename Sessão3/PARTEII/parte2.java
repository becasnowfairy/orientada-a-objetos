package Sessao3.PARTEII;

import java.util.Scanner;

public class parte2 {
    public static void main(String[] args) {
        // Task 1: Crie duas matrizes de 2x2 de inteiros. Carregue ambas com valores introduzidos pelo utilizador. O programa deverá calcular, para cada posição das matrizes, a respetiva  multiplicação e mostrar o resultado.
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduza valores para a matriz 1:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Introduza valores para a matriz 2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Multiplicação das matrizes:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int produto = matriz1[i][j] * matriz2[i][j];
                System.out.println("Posição (" + i + "," + j + "): " + produto);
            }
        }

        // Task 2: Crie uma matriz de inteiros com 2x2. Preencha todas as posições com um valor gerado aleatoriamente, entre 1 e 60. Mostre todos os valores. De seguida, calcule e mostre o determinante (determinante = (a * d) - (b * c), onde a, b, c e d são os elementos da matriz) da matriz em questão.
        int[][] matrizRandom = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizRandom[i][j] = (int) (Math.random() * 60) + 1;
                System.out.print(matrizRandom[i][j] + " ");
            }
            System.out.println();
        }

        int a = matrizRandom[0][0];
        int b = matrizRandom[0][1];
        int c = matrizRandom[1][0];
        int d = matrizRandom[1][1];

        int determinante = (a * d) - (b * c);
        System.out.println("Determinante: " + determinante);
    }
}