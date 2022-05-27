/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Profesor;
import paquete1.LibretaCalificacion;

/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {

    public static void main(String[] args) {
        Calificacion c1 = new Calificacion(1.10, "Mate");
        
        Calificacion c2 = new Calificacion(2, "Programacion");
       
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
         c1.establecerProfesor(prof1);
         c2.establecerProfesor(prof2);
        System.out.println("-----------------------------");

        // ArrayList
        ArrayList<Calificacion> calificaciones = new ArrayList<>();
        calificaciones.add(c1);
        calificaciones.add(c2);

       

        for (int i = 0; i < calificaciones.size(); i++) {
            //nombre
            //NOmbre dela materia
            //la nota
            Calificacion p = calificaciones.get(i);
            System.out.printf("%s - %s - (%.2f)\n",
                    calificaciones.get(i).obtenerProfesor().obtenerNombre(),
                    calificaciones.get(i).obtenerNombreMateria(),
                    calificaciones.get(i).obtenerNota());
        }

    }
}
