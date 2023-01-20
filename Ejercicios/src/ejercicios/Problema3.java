/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import ayudas.suma;

public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] datos = {100, 90, 80, 70, 60};
        int[] datos2 = {200, 190, 180, 170, 160};
        int[] resultado = new int[5];
        for (int i = 0; i < datos.length; i++) {
         resultado[i]= suma.obtenerSuma(datos[i], datos2[i]);
        }
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
    }
    

}
