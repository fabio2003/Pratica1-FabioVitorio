import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int COBERTURA_LITROS = 3;
        final double PRECO_LATA = 80.0;
        final int LITROS_LATA = 18;

        System.out.print("Digite o tamanho da área a ser pintada em metros quadrados: ");
        int area = sc.nextInt();

        int litrosNecessarios = (area / COBERTURA_LITROS) + 1;
        int latasNecessarias = (litrosNecessarios + LITROS_LATA - 1) / LITROS_LATA;
        double precoTotal = latasNecessarias * PRECO_LATA;

        System.out.println("Quantidade de latas de tinta: " + latasNecessarias);
        System.out.printf("Preço total: R$ %.2f", precoTotal);

        sc.close();
    }
}
