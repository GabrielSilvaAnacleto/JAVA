
package exercício14;
//faça um código que leia uma matriz e faça a soma de seus componentes
import java.util.Scanner;
public class SomaMatriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int v[][] = new int[5][4];
        int soma = 0;
        for (int i = 0; i < 5;i++){
           for (int j = 0; j < 4;j++){ 
               v[i][j] = teclado.nextInt();
               soma = soma + v[i][j];
           }
        }
        System.out.println("A SOMA É:" + soma);
             
    }
    
}
