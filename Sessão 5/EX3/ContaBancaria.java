package Sessao5.EX3;

import java.util.Scanner;

public class ContaBancaria {
    private double saldo;
    private int nrmovimentos;

    public ContaBancaria(int numeroConta) {
        this.saldo = 0.0;
        this.nrmovimentos = 0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor a depositar não pode ser negativo ou zero.");
            return;
        }
        this.saldo += valor;
        this.nrmovimentos++;
    }

    public void levantar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor a levantar não pode ser negativo ou zero.");
            return;
        }
        if (this.saldo < valor) {
            System.out.println("Movimento não autorizado: saldo insuficiente.");
            return;
        }
        this.saldo -= valor;
        this.nrmovimentos++;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNrMovimentos() {
        return nrmovimentos;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1234);

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Depositar");
            System.out.println("2. Levantar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Consultar Total de Movimentos");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Valor a depositar: ");
                    double valorDepositar = scanner.nextDouble();
                    conta.depositar(valorDepositar);
                }
                case 2 -> {
                    System.out.print("Valor a levantar: ");
                    double valorLevantar = scanner.nextDouble();
                    conta.levantar(valorLevantar);
                }
                case 3 -> System.out.println("Saldo atual: " + conta.getSaldo());
                case 4 -> System.out.println("Número de movimentos: " + conta.getNrMovimentos());
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }
}