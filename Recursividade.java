package recursividade;
import java.util.Scanner;
public class Recursividade {
    public static void main(String[] args) {
        //Fa�a um programa que leia um n�mero e imprima seu fatorial.
        Scanner teclado = new Scanner(System.in);
        int numInicial;

        numInicial = teclado.nextInt();
        int auxiliador = numInicial;

        while (auxiliador > 1) {
            numInicial = (numInicial * auxiliador - 1);
            auxiliador = auxiliador - 1;
        }
        System.out.println("" + numInicial);
    }

}
