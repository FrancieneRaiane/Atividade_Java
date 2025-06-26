package app;

import java.util.Scanner;

public class SomaTresNumeros_2 {
    public static void main(String[] args) {
        // Cria o objeto Scanner para ler entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Pede e lê os três números
        System.out.print("Digite o primeiro número a ser somado: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número a ser somado: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número a ser somado: ");
        int num3 = scanner.nextInt();

        // Calcula a soma
        int soma = num1 + num2 + num3;

        // Exibe o resultado
        System.out.println("A soma dos três valores é: " + soma);

        // Fecha o scanner
        scanner.close();
    }
}

