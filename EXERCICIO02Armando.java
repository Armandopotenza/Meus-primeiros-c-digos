/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio02;

        
/**
 *
 * @author 45559704890
 */
public class EXERCICIO02 {

    public static void main(String[] args) {
   
    
    double[] notas = {7.5, 8.0, 6.5, 9.0, 5.5, 7.0};
    
    double soma = 0;
    
    for (int i = 0; i < notas.length; i++)   {                              
        soma = soma + notas[i];
        
    }  
    
    double media = soma / notas.length;
    
    System.out.println("Soma: " + media);
    System.out.println("Media: " + soma);
        
        
        
        
        
    }
}
