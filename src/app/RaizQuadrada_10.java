package app;

import java.util.Scanner;

public class RaizQuadrada_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular a raiz quadrada: ");
        double numero = scanner.nextDouble();

        if (numero < 0) {
            System.out.println("Número inválido! Não é possível calcular a raiz quadrada de número negativo.");
        } else {
            double raiz = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é: " + raiz);
        }

        scanner.close();
    }
}

