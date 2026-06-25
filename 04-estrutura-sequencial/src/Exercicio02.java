import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double pi = 3.14159;

        Double raio = sc.nextDouble();
        Double area = pi * Math.pow(raio, raio);

        System.out.printf("A = %.4f" , area);
        sc.close(); 
    }
}