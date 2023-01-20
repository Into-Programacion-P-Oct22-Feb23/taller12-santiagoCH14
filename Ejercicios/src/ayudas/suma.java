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
public class suma {

    public static void main(String[] args) {

        int valor1 = 5; // 3 // 6
        int valor2 = 4; // 5 // 1

        System.out.printf("%d\n", obtenerSuma(valor1, valor2));
    }

    public static int obtenerSuma(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            if (a == 0) {
                return b;
            } else {
                return 1 + obtenerSuma(a, b - 1);
            }
        }
    }

}
