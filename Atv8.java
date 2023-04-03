import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = sc.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = sc.nextDouble();

        double salario = valorHora * horasTrabalhadas;

        System.out.println("Seu salário no referido mês é de: " + salario);
    }
}
