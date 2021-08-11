/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unab.semana3.parte2.RETO2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Estudiante {

    private Curso curso;
    private String nombre;
    private static String[] Materias = {"MATEMATICAS", "CIENCIAS", "INGLES", "INFORMATICA", "DEPORTES"};
    int [][] Calificaciones;

    public Estudiante() {
     Calificaciones = new int[5][4];
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String[] getMaterias() {
        return Materias;
    }

    public int[][] getCalificaciones() {
        return Calificaciones;
    }

    public String Boletin() {
        String boletin = "";
        int puntero = 0;
        int contador = 0;
        for (int i = 0; i < Calificaciones.length; i++) {
            for (int j = 0; j < Calificaciones[0].length; j++) {
                contador++;
                boletin += "Nota de " + this.nombre + " en " +  Materias[puntero] + " en el Periodo " + contador + " = " + Calificaciones[i][j] + "\n";

            }
            boletin += "*******************************************\n";
            puntero++;
            contador = 0;
        }
        return boletin;
    }

    public void registrarCalificacion() {
        int puntero = 0;
        int contador = 0;
        for (int i = 0; i < Calificaciones.length; i++) {
            for (int j = 0; j < Calificaciones[0].length; j++) {
                ++contador;
                Calificaciones[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Porfavor digite la calificacion"
                        + " de la Asignatura " + Materias[puntero] + " del estudiante " + nombre + " en el periodo academico "
                        + contador + "\n(Recuerde que la nota es un porcentaje que va de 0 a 100)"));
            }
            puntero++;
            contador = 0;
        }
    }

    public String EstadoAsignatura() {
        String estado = "";
        String Asignatura = JOptionPane.showInputDialog("Digite el nombre de la "
                + "Asignatura que desa conocer el estado.\n"
                + "(Matematicas, Ciencias, Ingles, Informatica, Deportes)");

        if (Asignatura.equalsIgnoreCase(Materias[0])) {
            int contador = 0;
            for (int i = 0; i < Calificaciones.length; i++) {
                for (int j = 0; j < Calificaciones[0].length; j++) {
                    if (i == 0) {
                        estado += "Nota de " + this.nombre + " en " + Materias[0] + " en el "
                                + "periodo " + ++contador + " = " + Calificaciones[i][j] + "\n";
                    }
                }

            }
        } else if (Asignatura.equalsIgnoreCase(Materias[1])) {
            int contador = 0;
            for (int i = 0; i < Calificaciones.length; i++) {
                for (int j = 0; j < Calificaciones[0].length; j++) {
                    if (i == 1) {
                        estado += "Nota de " + this.nombre + " en " + Materias[1] + " en el "
                                + "periodo " + ++contador + " = " + Calificaciones[i][j] + "\n";
                    }
                }
            }
        } else if (Asignatura.equalsIgnoreCase(Materias[2])) {
            int contador = 0;
            for (int i = 0; i < Calificaciones.length; i++) {
                for (int j = 0; j < Calificaciones[0].length; j++) {
                    if (i == 2) {
                        estado += "Nota de " + this.nombre + " en " + Materias[2] + " en el "
                                + "periodo " + ++contador + " = " + Calificaciones[i][j] + "\n";
                    }
                }
            }
        } else if (Asignatura.equalsIgnoreCase(Materias[3])) {
            int contador = 0;
            for (int i = 0; i < Calificaciones.length; i++) {
                for (int j = 0; j < Calificaciones[0].length; j++) {
                    if (i == 3) {
                        estado += "Nota de " + this.nombre + " en " + Materias[3] + " en el "
                                + "periodo " + ++contador + " = " + Calificaciones[i][j] + "\n";
                    }
                }
            }
        } else if (Asignatura.equalsIgnoreCase(Materias[4])) {
            int contador = 0;
            for (int i = 0; i < Calificaciones.length; i++) {
                for (int j = 0; j < Calificaciones[0].length; j++) {
                    if (i == 4) {
                        estado += "Nota de " + this.nombre + " en " + Materias[4] + " en el "
                                + "periodo " + ++contador + " = " + Calificaciones[i][j] + "\n";
                    }
                }

            }
        }
        return estado;
    }

}
