import java.util.*;

public class Exercicio05 {

     public static void main(String[] args) {

          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);

          System.out.println("Codigo: ");
          int codigo = sc.nextInt();

          System.out.println("Quantidade: ");
          int quantidade = sc.nextInt();

          double valor = 0;

          if (codigo == 1) {
               valor = 4.00;
          } else if (codigo == 2) {
               valor = 4.50;
          } else if (codigo == 3) {
               valor = 5.00;
          } else if (codigo == 4) {
               valor = 2.00;
          } else if (codigo == 5) {
               valor = 1.50;
          } else {
               System.out.println("ERRO: TENTE O CODIGO DE 1 A 5.");
          }

          double total = quantidade * valor;

          System.out.printf("Total: R$ %.2f\n", total);

          sc.close();
     }
}
