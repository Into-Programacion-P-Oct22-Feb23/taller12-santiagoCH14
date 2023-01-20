/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import org.apache.commons.lang3.math.NumberUtils;

public class Problema05 {

    public static void main(String args[]) {
    String[] dataInicial = {"100", "90", "1n", "10", "H1", "H2"};  
    int[] datafinal = new int [6];
    
        for (int i = 0; i < dataInicial.length; i++) {
            datafinal[i] = NumberUtils.toInt(dataInicial[i]);
        }
        for (int i = 0; i < dataInicial.length; i++) {
            System.out.println(datafinal[i]);
        }
    }
}

