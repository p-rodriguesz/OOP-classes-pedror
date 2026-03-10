package Lessons;
import java.util.Scanner;

public class mediapond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero:");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero:");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro numero:");
        double num3 = scanner.nextDouble();

        double mediaPonderada = ((num1 * 2) + (num2 * 3) + (num3 * 5))/ (2 + 3 + 5);

        System.out.print("A media ponderada dos tres numeros é: " + mediaPonderada);
        scanner.close();
    }


}