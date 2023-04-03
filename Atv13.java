import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura (em metros): ");
        double altura = sc.nextDouble();

        System.out.print("Digite seu sexo (M ou F): ");
        String sexo = sc.next();

        double pesoIdeal;

        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido.");
            sc.close();
            return;
        }

        System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");

        sc.close();
    }
}
