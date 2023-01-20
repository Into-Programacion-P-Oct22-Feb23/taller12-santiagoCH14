//JUAN DAVID GARCIA
//SANTIAGO CHAVEZ
package ejercicios;

import ayudas.suma;

public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] datos1 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        int[][] datos2 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        int[][] datos3 = new int[4][3];

        for (int i = 0; i < datos1.length; i++) {
            for (int j = 0; j < datos1[i].length; j++) {
                datos3[i][j] = suma.obtenerSuma(datos1[i][j], datos2[i][j]);
            }
        }
        for (int i = 0; i < datos1.length; i++) {
            for (int j = 0; j < datos1[i].length; j++) {
                System.out.println(datos3[i][j]);
            }
        }
    }
}
