/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication76;

import java.util.Arrays;

/**
 *
 * @author reroes
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] arreglo = {{1,2,3},{11,22,33}};
        
        for(int fila=0; fila<arreglo.length; fila++){
            
            for(int columna=0; columna<arreglo[fila].length; columna++){
                System.out.printf("%d\t", arreglo[fila][columna]);
            }    
            System.out.println("");
            
        }
        
        
        
        
    }
    
}
