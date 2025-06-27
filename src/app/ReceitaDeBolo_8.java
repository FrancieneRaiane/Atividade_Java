package app;

import java.util.Scanner;

public class ReceitaDeBolo_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Menu de opções
            System.out.println("\nEscolha um número de 1 a 5 para ver um ingrediente da receita de bolo:");
            System.out.println("1 - Farinha");
            System.out.println("2 - Ovos");
            System.out.println("3 - Açúcar");
            System.out.println("4 - Leite");
            System.out.println("5 - Fermento");
            System.out.println("0 - Sair");

            System.out.print("Digite sua escolha: ");
            opcao = scanner.nextInt();

            // Switch com os ingredientes
            switch (opcao) {
                case 1:
                    System.out.println("Ingrediente escolhido é: Farinha de trigo");
                    break;
                case 2:
                    System.out.println("Ingrediente escolhido é: Ovos");
                    break;
                case 3:
                    System.out.println("Ingrediente escolhido é: Açúcar");
                    break;
                case 4:
                    System.out.println("Ingrediente escolhido é: Leite");
                    break;
                case 5:
                    System.out.println("Ingrediente escolhido é: Fermento em pó");
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha de 0 a 5.");
            }
        } while (opcao != 0);  // Repete enquanto a opção for diferente de 0

        scanner.close();
    }
}

