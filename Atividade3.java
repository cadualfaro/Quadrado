/*
Implementar um algoritmo que lê um valor N. Após isso cria e mostra o quadrado dos N primeiros inteiros.
 */
package atividade3;
import java.util.Scanner;
public class Atividade3 {

    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
            System.out.println("O programa ira mostrar o quadrado de todos os numeros positivos até o valor digitado\n");
            System.out.println("Digite o valor limite: ");
            
            int n = my_scan.nextInt();
            int v[] = new int[n];
           
            for(int i=0; i<n; i++){
            v[i] = (i+1)*(i+1);
            System.out.println("\nO quadrado de "+(i+1)+" é: "+v[i]);
            }
    }
    
}
