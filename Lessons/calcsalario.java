package Lessons;
import java.util.Scanner;


public class calcsalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salario do funcionario:");
        double salario = scanner.nextDouble();

        double salarioFinal = salario + (salario    * 0.25);

        System.out.print("O salario final do funcionario é: " + salarioFinal);
        scanner.close();
    }
}