package Lessons;
import java.util.Scanner;

public class salarioimposto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario base:");
        double salariobase = scanner.nextDouble();

        double salariofinal = (salariobase * 0.05) - (salariobase * 0.07);

        System.out.println("Salario final: " + salariofinal);
        scanner.close();

    }
}