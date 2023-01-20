/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayudas;

/**
 *
 * @author UTPL
 */
public class factorial {

    public static void main(String[] args) {

        System.out.printf("%.2f\n", factorial(5));
        // 120
    }

    public static int factorial(int numero) { // 5 

        if (numero <= 1) { 

            return 1; 
        
        } else {

            return numero * factorial(numero - 1);

        }
        
    }

}
