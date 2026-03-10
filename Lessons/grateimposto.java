package Lessons;
import java.util.Scanner;


public class grateimposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario do funcionario:");
        double salario = scanner.nextDouble();

        double gratificacao = salario * 0.05;
        double imposto = salario * 0.07;
        double salariofinal = salario + gratificacao - imposto;

        System.out.println("Salario final: " + salariofinal);
        scanner.close();

    }
}