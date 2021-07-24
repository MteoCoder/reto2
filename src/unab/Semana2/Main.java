/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unab.Semana2;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
        String boletin = "";
        int contador = 0, opcion = 0;
        double promedio = 0, nota = 0;
        String nombre;
        Tripulante trip;

        do {
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del tripulante");
            nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del tripulante"));
            trip = new Tripulante(nombre, nota);
            boletin += "El trpulante " + nombre + " tiene por nota " + nota + " \n";
            promedio += nota;
            contador++;
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese\n 1. Ingresar Tripulante\n"
                    + "2. salir"));

        } while (opcion != 2);
        JOptionPane.showMessageDialog(null, boletin + "\n El promedio es: "+
                CalcularPromedio(promedio, contador));
       

    }
    public static double CalcularPromedio(double prom, int contador){
        double resultado = prom/contador;
        return resultado;
    }
}
