//Juan David Garcia Carrion
//Santiago Chavez
package ejercicios;

import ayudas.factorial;

public class Problema1 {

    public static void main(String[] args) {
        int[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        int[][] resultado = new int[4][2];

        for (int i = 0; i < datos.length ; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                resultado[i][j] = factorial.factorial(datos[i][j]);
            }
        }
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.println(resultado[i][j]);
            }
 
        }
    }   

}
