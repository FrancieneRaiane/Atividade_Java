package app;

import java.util.Scanner;

public class LoginSistema_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o login
        System.out.print("Digite o login: ");
        String login = scanner.nextLine();

        // Solicita a senha
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        // Verifica se login e senha estão corretos
        if (login.equals("admin") && senha.equals("12345678")) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Erro: login ou senha incorretos.");
        }

        scanner.close();
    }
}

