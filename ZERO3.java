/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zero3.zero3;
import java.util.Scanner;
/**
 *
 * @author 45559704890
 */
public class ZERO3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor do saque: ");
        int saque = sc.nextInt();
        
        if(saque < 10 || saque > 600){
            System.out.println("Valor invalido");
        } else {
            int restante = saque;
            
            int notas100 = restante / 100;
            restante = restante % 100;
            int notas50 = restante / 50;
            restante = restante % 50;
            int notas10 = restante / 10;
            restante = restante % 10;
            int notas5 = restante / 5;
            restante = restante % 5;
            int notas1 = restante;
            
            System.out.println("\n-----Notas Fornecidas-----\n");
            System.out.println("Notas R$100: " + notas100);
            System.out.println("Notas R$50: " + notas50);
            System.out.println("Notas R$10: " + notas10);
            System.out.println("Notas R$5: " + notas5);
            System.out.println("Notas R$1: " + notas1);
            
        }
           sc.close();     
    }
}
