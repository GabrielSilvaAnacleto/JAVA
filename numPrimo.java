
package javaapplication4;
import java.util.Scanner;
public class numPrimo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0;
        int num1 = 0;
        int num2 = 1;
        
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        if (num1 < num2){
        for (int i = num1+1; i < num2; i++){
        if (i%2!=0){
            soma = soma + i;
        }
        } 
    }
        else if (num2 < num1){
        for (int i = num2+1; i < num1; i++){
        if (i%2!=0){
            soma = soma + i;
        }
        } 
    }
        System.out.println(""+ soma);
    } 
}
    
    
