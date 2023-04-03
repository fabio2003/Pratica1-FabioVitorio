import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora de trabalho: R$ ");
        double valorHora = sc.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = sc.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;
        double ir = 0.11 * salarioBruto;
        double inss = 0.08 * salarioBruto;
        double sindicato = 0.05 * salarioBruto;
        double salarioLiquido = salarioBruto - ir - inss - sindicato;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Desconto do Imposto de Renda (11%): R$ " + ir);
        System.out.println("Desconto do INSS (8%): R$ " + inss);
        System.out.println("Desconto do Sindicato (5%): R$ " + sindicato);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        sc.close();
    }
}
