package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Calculo de Area e Perimetro");
            System.out.println("1 - Retangulo");
            System.out.println("2 - Circulo");
            System.out.print("Escolha uma opcao: ");

            int opcao = scanner.nextInt();
            FormaGeometrica forma;
            String nomeForma;

            if (opcao == 1) {
                System.out.print("Informe a largura: ");
                double largura = scanner.nextDouble();
                System.out.print("Informe a altura: ");
                double altura = scanner.nextDouble();

                forma = new Retangulo(largura, altura);
                nomeForma = "Retangulo";
            } else if (opcao == 2) {
                System.out.print("Informe o raio: ");
                double raio = scanner.nextDouble();

                forma = new Circulo(raio);
                nomeForma = "Circulo";
            } else {
                System.out.println("Opcao invalida.");
                return;
            }

            System.out.printf("%s - Area: %.2f%n", nomeForma, forma.calcularArea());
            System.out.printf("%s - Perimetro: %.2f%n", nomeForma, forma.calcularPerimetro());
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Entrada invalida: " + e.getMessage());
        }
    }
}
