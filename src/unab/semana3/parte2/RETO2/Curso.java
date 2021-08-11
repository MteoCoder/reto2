/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unab.semana3.parte2.RETO2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Curso {

    private String nombreCurso;
    ArrayList<Estudiante> estudiantes;

    public Curso() {
        estudiantes = new ArrayList<>();
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void ingresarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

 

    public static void EstadoAsignaturaEstudiante(ArrayList<Curso> c) {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
        for (Curso a : c) {
            for (Estudiante x : a.getEstudiantes()) {
                if (nombre.equalsIgnoreCase(x.getNombre())) {
                    JOptionPane.showMessageDialog(null, x.EstadoAsignatura());
                }
            }

        }
    }

}
