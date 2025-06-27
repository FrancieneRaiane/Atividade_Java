package app;

import java.util.Scanner;

public class RadarDeVelocidade_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Velocidade máxima permitida (pode ser ajustada)
        int velocidadePermitida = 60;

        System.out.print("Digite a velocidade do veículo (km/h): ");
        int velocidade = scanner.nextInt();

        // Verificação da velocidade
        if (velocidade < velocidadePermitida) {
            System.out.println("Velocidade abaixo do limite. Tudo certo!");
        } else if (velocidade == velocidadePermitida) {
            System.out.println("Velocidade dentro da média permitida.");
        } else {
            System.out.println("Velocidade acima do permitido! Multa aplicada.");
        }

        scanner.close();
    }
}

