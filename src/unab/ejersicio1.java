/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unab;

import javax.swing.JOptionPane;

public class ejersicio1 {

    public static void main(String[] args) {
        int opcion = 1;
        while (opcion != 0) {
            System.out.println("******Menu*******");
            System.out.println("1. Factorial de un numero.");
            System.out.println("2. Sumatoria 2N - 1.");
            System.out.println("3. Salir.");
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite una opcion de la consola: "));
            System.out.println("******************");
            switch (opcion) {
                case 1:
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
                    System.out.println(Factorial(numero));
                    break;
                case 2:
                    Sumatoria();
                    break;
                case 3:
                    opcion = 0;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite una opcion valida.");
            }
        }

    }

    public static int Factorial(int numero) {
        int j = 1, i = 1;
        do {
            j *= i;
            i++;
        } while (i <= numero);
        return j;
    }

    public static void Sumatoria() {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero N: "));
        int suma = 0;
        for (int i = 1; i <= N; i++) {
            suma += 2*i-1;
            System.out.println(suma);
        }
    }
}
