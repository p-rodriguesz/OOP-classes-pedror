
package Lessons;

import java.util.Scanner;

public class somaquatronumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o primeiro numero:");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero:");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro numero:");
        int num3 = scanner.nextInt();

        System.out.print("Digite o quarto numero:");
        int num4 = scanner.nextInt();

       int soma = num1 + num2 + num3 + num4;

        System.out.print("A soma dos quatro numeros é: " + soma);

        scanner.close();
    }
}