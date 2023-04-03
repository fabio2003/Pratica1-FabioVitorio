import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        System.out.print("Digite um número real: ");
        double num3 = sc.nextDouble();

        int resultado1 = (num1 * 2) * (num2 / 2);
        double resultado2 = (num1 * 3) + num3;

        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + resultado1);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + resultado2);

        sc.close();
    }
}
