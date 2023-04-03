import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso dos peixes (em kg): ");
        double peso = sc.nextDouble();

        double excesso = 0.0;
        double multa = 0.0;

        if (peso > 50.0) {
            excesso = peso - 50.0;
            multa = excesso * 4.0;
        }

        System.out.println("Peso dos peixes: " + peso + " kg");
        if (excesso > 0.0) {
            System.out.println("Excesso de peso: " + excesso + " kg");
            System.out.println("Valor da multa: R$ " + multa);
        } else {
            System.out.println("Não houve excesso de peso.");
        }

        sc.close();
    }
}
