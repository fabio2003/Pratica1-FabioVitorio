import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double temperaturaF = sc.nextDouble();

        double temperaturaC = (temperaturaF - 32) * 5/9;

        System.out.println("A temperatura em graus Celsius é: " + temperaturaC);
    }
}
