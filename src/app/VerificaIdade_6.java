package app;

import java.util.Scanner;

public class VerificaIdade_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do aluno: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("O aluno é maior de idade.");
        } else {
            System.out.println("O aluno é menor de idade.");
        }

        scanner.close();
    }
}
