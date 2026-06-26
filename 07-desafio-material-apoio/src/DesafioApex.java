import java.util.*;

public class DesafioApex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter three numbers: ");
        var x = sc.nextInt();
        var y = sc.nextInt();
        var z = sc.nextInt();

        var higher = max (x, y, z);
        
        showResult(higher);

        sc.close();
    }

    public static int max(int X, int Y, int Z) {
        int aux; 
        
        if (X > Y && X > Z) {
            aux = X;
        } else if (Y > Z) {
            aux = Y;
        } else {
            aux = Z;
        }
        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}
