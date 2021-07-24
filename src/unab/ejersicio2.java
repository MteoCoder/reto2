//VECTORES Y MATRICES.

//Hacer un Algoritmo en JAVA que me solicite datos
//flotantes para un vector 2X2 y me almacene
//en un vector unidimensional de longitud 2, los 
//promedios de los números de cada fila del vector Bidimensional
package unab;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ejersicio2 {
    public static void main(String[] args) {
        
        double [] vector = new double[2];
        double [][] matriz = new double[2][2];
        double promediofila1 = 0;
        double promediofila2 = 0;
        int puntero = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un valor flotante: "));
                if(i == 0){
                    promediofila1 += matriz[i][j];
                }else if(i == 1){
                    promediofila2 += matriz[i][j];
                }
            }
        }
        promediofila1 = promediofila1/2;
        vector[puntero] = promediofila1;
        promediofila2 = promediofila2/2;
        vector[vector.length-1] = promediofila2;
       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("**********SEPARADOR**********");
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i] + " ");
        }
        
    }
}
