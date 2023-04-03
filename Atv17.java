import java.util.Scanner;

public class LojaDeTintas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o tamanho em metros quadrados da área a ser pintada: ");
        double tamanhoArea = input.nextDouble();
        
        double litrosTinta = tamanhoArea / 6 * 1.1;
        
        int latas18 = (int) Math.ceil(litrosTinta / 18);
        
        double precoLatas18 = latas18 * 80;
        
        int galoes36 = (int) Math.ceil(litrosTinta / 3.6);
        
        double precoGaloes36 = galoes36 * 25;

        int latasMix = (int) (litrosTinta / 18);
        int galoesMix = (int) Math.ceil((litrosTinta % 18) / 3.6);
        
        double precoLatasMix = latasMix * 80;
        double precoGaloesMix = galoesMix * 25;
        double precoTotalMix = precoLatasMix + precoGaloesMix;
        
        System.out.println("\nQuantidade de latas de 18 litros: " + latas18);
        System.out.println("Preço total das latas de 18 litros: R$ " + precoLatas18);
        System.out.println("\nQuantidade de galões de 3,6 litros: " + galoes36);
        System.out.println("Preço total dos galões de 3,6 litros: R$ " + precoGaloes36);
        System.out.println("\nQuantidade de latas de 18 litros: " + latasMix);
        System.out.println("Quantidade de galões de 3,6 litros: " + galoesMix);
        System.out.println("Preço total das latas e galões misturados: R$ " + precoTotalMix);
    }
}
