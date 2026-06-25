import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[]args){
        
        Locale.setDefault(Locale.US);
        Scanner Sc = new Scanner(System.in);

        int x = Sc.nextInt();
        int y = Sc.nextInt();
        
        int Soma = x + y ;

        System.out.printf("SOMA = " + Soma);

        Sc.close();
    }
}