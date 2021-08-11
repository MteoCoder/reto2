// Hacer un aplicación en Java  aplicando el paradigma de POO, que almacene 
// las calificaciones de los periodos Académicos de las asignaturas de un estudiante 
// (Opcional - pueden hacerlo para varios estudiantes aplicando ArrayList) del colegio HighSchool.  
// Las asignaturas son:
//
// 1. Matemáticas
// 2. Ciencias
// 3. Ingles
// 4. Informática
// 5. Deportes
//
// (Opcional - pueden crear una clase en el que gestionen cuantas y cuales asignaturas cursan los estudiantes por grado).
//
// La escala de calificación es en porcentaje 0 a 100.
//
// El programa permite realizar 4 opciones al usuario a través de un menú:
//
// 1. Cargar calificaciones Estudiante.
// 2. Imprimir Boletín (Todas las Asignaturas)
// 3. Imprimir Estado  Asignatura (Ver calificaciones de la Asignatura seleccionada)
// 4. Salir
//
// (Si trabajan ArrayList para gestionar las asignaturas por grado, deben crear otra
// opción en la que se indique cuales son las asignaturas de ese grado y registrar sus estudiantes).
//
// INDICACIONES PARA LA ENTREGA: 
//
// Deben entregar un documento PDF en el que contengan imágenes de todo 
// el código generado describiendo brevemente la clases que definieron.  Dicho documento
// al final debe tener un link a un video en youtube en el que muestren la ejecución del programa y su correcto funcionamiento.
// Deben adjuntar el proyecto completo comprimido.
package unab.semana3.parte2.RETO2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
class Main {

    public static void main(String[] args) {
    ArrayList<Curso> cursos = new ArrayList<>();
    int NumeroCursos = Integer.parseInt(JOptionPane.showInputDialog("Digite el total de Cursos a ingresar"));
    Estudiante e;
    Curso c;
    int opcion = 0;
    
    for (int i = 0; i< NumeroCursos ;i++) {
        c = new Curso();
        c.setNombreCurso(JOptionPane.showInputDialog("Ingrese el nombre del curso " + i));
        cursos.add(c);
    }
        while (opcion != 4) {
            opcion = Menu();
            switch (opcion) {
                case 1:
                    e = new Estudiante();
                    e.setCurso(buscarCurso(cursos));
                    e.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del estudiante del curso "
                            + e.getCurso().getNombreCurso()));
                    e.registrarCalificacion();
                    e.getCurso().ingresarEstudiante(e);
                    break;
                case 2:
                    System.out.println(boletin(cursos));
                    break;
                case 3:
                    Curso.EstadoAsignaturaEstudiante(cursos);
                    break;
                case 4:
                    opcion = 4;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
            }
        }
    
    
}

public static int Menu() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite una opcion:\n"
                + "********Menú********\n"
                + "1. Cargar las calificaciones estudiante.\n"
                + "2. Imprimir boletin.\n"
                + "3. Imprimir estado asignatura.\n"
                + "4. Salir"));
        return opcion;
    }

    public static String boletin(ArrayList<Curso> c) {
        String boletin = "";

        for (Curso x : c) {
            boletin += "ESTUDIANTES DEL CURSO " + x.getNombreCurso() + "\n\n";
            for (Estudiante a : x.getEstudiantes()) {
                boletin += a.Boletin();
            }
        }
        return boletin;
    }
    
    public static Curso buscarCurso(ArrayList<Curso> c){
        Curso z = null;
        String nombreCurso = JOptionPane.showInputDialog("Ingrese el nombre del curso al que"
                + " pertenece el estudiante");
        for(Curso x: c){
            if(x.getNombreCurso().equalsIgnoreCase(nombreCurso)){
               z = x;
            }
        }
        return z;
    }

}
