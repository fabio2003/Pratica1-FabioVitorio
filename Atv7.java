import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida do lado do quadrado: ");
        double lado = sc.nextDouble();

        double area = lado * lado;

        double dobroArea = 2 * area;

        System.out.println("O dobro da área do quadrado é: " + dobroArea);
    }
}
