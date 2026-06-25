import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, aTri, aCir, aTrap, aQuad, aRetan;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        aTri = (A * C) /2;
        aCir = 3.14159 * Math.pow(C,2);
        aTrap = (A + B) * C /2;
        aQuad = (B * B);
        aRetan = (A * B);

        System.out.printf("TRIANGULO: %.3f\n", aTri);
        System.out.printf("CIRCULO: %.3f\n", aCir);
        System.out.printf("TRAPEZIO: %.3f\n", aTrap);
        System.out.printf("QUADRADO: %.3f\n", aQuad);
        System.out.printf("RETANGULO: %.3f\n", aRetan);
        
        sc.close();
    }

}
