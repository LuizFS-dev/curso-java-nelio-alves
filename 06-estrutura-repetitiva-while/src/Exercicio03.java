import java.util.*;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int alcool = 0, gas = 0, diesel = 0;

        while (true) {
            var X = sc.nextInt();

            switch (X) {
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gas += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                case 4:
                    System.out.printf("Muito obrigado\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gas, diesel);
                    break;
                default:
                    System.out.println("INVALIDO (1 à 4)");
                    break;
            }
            if (X == 4) {
                break;
            }
        }
        sc.close();
    }
}
