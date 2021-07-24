/*
Hacer un Algoritmo en Java (Utilizar esta clase) que almacene las calificaciones de los periodos Academicos de las asignaturas de 
un estudiante del colegio HighSchool.  Las asignaturas son:

1. Matemàticas
2. Ciencias
3. Ingles
4. Informática
5. Deportes

La escala de calificación es en porcentaje 0 a 100.

El programa permite realizar 4 opciones al usuario a través de un menú:

1. Cargar calificaciones Estudiante.
2. Imprimir Boletin (Todas las Asignaturas)
3. Imprimir Estado  Asignatura (Ver calificaciones de la Asignatura seleccionada)
4. Salir

 */
package unab;

import javax.swing.JOptionPane;

public class Reto1 {
    public static void main(String[] args) {
        int opcion = 0;
        String [] materias = {"MATEMATICAS","CIENCIAS","INGLES","INFORMATICA","DEPORTES"};
        int[][] calificaciones = new int[5][4];
        
    // Declaración de variables
        
        
        
        while(opcion != 4){
            opcion = Menu();
            switch(opcion){
                case 1: CargarCalificaciones(materias, calificaciones);
                break;
                case 2: Boletin(materias, calificaciones);
                break;
                case 3: EstadoAsignatura(materias, calificaciones);
                break;
                case 4:
                    opcion = 4;
                    System.exit(0);                                  /*Profe yo hize uso de JOptionPane
                    break;                                           Por que ya desde hace un tiempo lo uso y
                default:                                             se me hace mas comodo de utilizar*/
                    System.out.println("Digite una opcion valida.");
            }
        }
        
    }    
    
    public static int Menu(){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite una opcion:\n"
        + "********Menú********\n" +
        "1. Cargar las calificaciones estudiante.\n"+
        "2. Imprimir boletin.\n"+
        "3. Imprimir estado asignatura.\n" +
        "4. Salir"));
        return opcion;
    }
    
    public static void CargarCalificaciones(String [] x, int[][] y){
        int puntero = 0;
        int contador = 0;
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[0].length; j++) {
                ++contador;
                y[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Porfavor digite la calificacion"
                        + " de la Asignatura " + x[puntero] + " del periodo academico "
                                + contador + "\n(Recuerde que la nota es un porcentaje que va de 0 a 100)"));
            }
            puntero++;
            contador = 0;
        }
    }
    
    
    public static void Boletin(String [] x, int[][] y){
        String boletin = "";
        int puntero = 0;
        int contador =  0;
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[0].length; j++) {
                contador++;
                boletin += "Nota de "+x[puntero]+" en el Periodo " + contador + " = " + y[i][j] + "\n";
                
            }
            boletin += "*******************************************\n";
            puntero++;
            contador = 0;
        }
        JOptionPane.showMessageDialog(null,boletin);
    }
    
    public static void EstadoAsignatura(String [] x, int [][] y){
        String Asignatura = JOptionPane.showInputDialog("Digite el nombre de la "
                + "Asignatura que desa conocer el estado.\n"+
                "(Matematicas, Ciencias, Ingles, Informatica, Deportes)");
        
        if(Asignatura.equalsIgnoreCase(x[0])){
            String estado = "";
            int contador = 0;
            for (int i = 0; i < y.length; i++) {
                for (int j = 0; j < y[0].length; j++) {
                    if(i==0){
                        estado += "Nota de " + x[0] + " en el "
                                + "periodo " + ++contador + " = " + y[i][j] + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, estado);
                
            }
        }else if(Asignatura.equalsIgnoreCase(x[1])){
            String estado = "";
            int contador = 0;
            for (int i = 0; i < y.length; i++) {
                for (int j = 0; j < y[0].length; j++) {
                    if(i==1){
                       estado += "Nota de " + x[1] + " en el "
                                + "periodo " + ++contador + " = " + y[i][j]+ "\n";
                    }
                }
                JOptionPane.showMessageDialog(null,estado);
            }
        }else if(Asignatura.equalsIgnoreCase(x[2])){
            String estado = "";
            int contador = 0;
            for (int i = 0; i < y.length; i++) {
                for (int j = 0; j < y[0].length; j++) {
                    if(i==2){
                        estado += "Nota de " + x[2] + " en el "
                                + "periodo " + ++contador + " = " + y[i][j] + "\n";
                    }
                }
                 JOptionPane.showMessageDialog(null,estado);
            }
        }else if(Asignatura.equalsIgnoreCase(x[3])){
            String estado = "";
            int contador = 0;
            for (int i = 0; i < y.length; i++) {
                for (int j = 0; j < y[0].length; j++) {
                    if(i==2){
                        estado += "Nota de " + x[3] + " en el "
                                + "periodo " + ++contador + " = " + y[i][j] + "\n";
                    }
                }
                 JOptionPane.showMessageDialog(null,estado);
            }
        }else if(Asignatura.equalsIgnoreCase(x[4])){
            String estado = "";
            int contador = 0;
            for (int i = 0; i < y.length; i++) {
                for (int j = 0; j < y[0].length; j++) {
                    if(i==2){
                        estado += "Nota de " + x[4] + " en el "
                                + "periodo " + ++contador + " = " + y[i][j] + "\n";
                    }
                }
                 JOptionPane.showMessageDialog(null,estado);
            }
        }
    }
}
