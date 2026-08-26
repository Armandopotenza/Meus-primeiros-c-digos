/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zero4.zero4;
import java.util.Scanner;
/**
 *
 * @author 45559704890
 */
public class ZERO4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite um caractere: ");
        char caractere = sc.next().charAt(0);
        
        if(Character.isDigit(caractere)){
            System.out.println("Caractere é um numero ");
        }else if (Character.isLetter(caractere)){
            
            char caractereMinuscula = Character.toLowerCase(caractere);
            
            if(caractereMinuscula == 'a' ||
                    caractereMinuscula == 'e'||
                    caractereMinuscula == 'i'||
                    caractereMinuscula == 'o'||
                    caractereMinuscula == 'u'){
                System.out.println("Caractere é uma vogal");
                
            }else{
                System.out.println("Caractere inválido");
              
            }
            sc.close();
        }
       
        
    
                
                
    }
}
