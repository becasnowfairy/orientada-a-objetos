package Sessao1;

import java.util.Scanner;

public class exercicios {
    public static void main(String[] args) {
        int idade = 20;
        String nome = "João";
        double altura = 1.80;
        boolean estaTrabalhando = false;
        char sexo = 'M';
        System.out.println("Hellooooooo");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
        System.out.println("A trabalhar? " + estaTrabalhando);

        String name2;
        int idade2;
        try (Scanner k = new Scanner(System.in)) {
            System.out.println("Insira um Nome:");
            name2 = k.nextLine();
            System.out.println("Insira uma Idade:");
            idade2 = k.nextInt();
        }

        System.out.println("Chamas te " + name2 + " e tens " + idade2 + " anos.");
    }

}
