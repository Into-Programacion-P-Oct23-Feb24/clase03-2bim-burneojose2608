/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo002 {
     public static void main(String[] args) {
     int[][] arreglo1 = {{10, 41, 40}, {1,2,3} ,{1,12,4}};
     int suma =0;
         for (int fila = 0; fila < arreglo1.length; fila++) {
             for (int columna = 0; columna < arreglo1[fila].length; columna++) {
                 if(fila == columna ){
                     suma = suma  + arreglo1[fila][columna];
                 }
             }
         }
         System.out.printf("%d\n",suma);
    
     }
}
