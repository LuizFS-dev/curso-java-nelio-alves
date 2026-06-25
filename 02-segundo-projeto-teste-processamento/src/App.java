import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[]args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        double larg, comp, precoM, area, precoArea;
        
        System.out.print("Largura: ");
        larg = scanner.nextDouble();
        System.out.print("Comprimento: ");
        comp = scanner.nextDouble();
        System.out.print("Preço: ");
        precoM = scanner.nextDouble();

        area = larg * comp;
        precoArea = area * precoM;

        System.out.println("");
        System.out.printf("AREA TOTAL = %.2f\n", area);
        System.out.printf("PRECO TOTAL = %.2f", precoArea);
        
        
        scanner.close();
    }
}