/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zero2.zero21;
import java.util.Scanner;

/**
 *
 * @author 45559704890
 */
public class ZERO21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o 1° numero: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite o 2° numero: ");
        double n2 = sc.nextDouble();
        
        if(n1>n2){
            System.out.println("N1 MAIOR!!!");
        }else if (n1<n2){
            System.out.println("N2 MAIOR!!!");
        }else{
            System.out.println("N°s IGUAIS!!!");
        }
        
        
       
    }
}
