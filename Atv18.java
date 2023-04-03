import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo em MB: ");
        double tamanho = input.nextDouble();

        System.out.print("Digite a velocidade do link de internet em Mbps: ");
        double velocidade = input.nextDouble() / 8;

        double tempo = tamanho / velocidade;
        int minutos = (int) Math.ceil(tempo / 60); // arredonda para cima o resultado em minutos

        System.out.printf("O tempo aproximado de download é de %d minutos.\n", minutos);

        input.close();
    }
}
