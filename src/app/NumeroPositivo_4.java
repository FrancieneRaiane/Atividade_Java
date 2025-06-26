package app;

import java.util.Scanner;

public class NumeroPositivo_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número positivo: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Você digitou o número positivo: " + numero);
        } else {
            System.out.println("Erro: o número deve ser positivo!");
        }
        scanner.close();
    }
}

