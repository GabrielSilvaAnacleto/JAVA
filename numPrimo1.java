
package recursividade2;
import java.util.Scanner;
public class numPrimo1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int v;
         v = teclado.nextInt();
        int auxiliador = 2;
        int aux2 = 0;

        while (auxiliador < v){
           if (v%auxiliador != 0){
           aux2 = (aux2 + 1);}
        auxiliador = (auxiliador + 1);
               }
        if ( aux2 == v - 2){
            System.out.println("o numero é primo");
        
        }
    }
    
}
