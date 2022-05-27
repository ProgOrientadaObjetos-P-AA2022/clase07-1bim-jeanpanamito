/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Empresa;
import paquete1.Profesor;
import paquete1.LibretaCalificacion;

/**
 *
 * @author reroes
 */
public class ManejoArrayList4 {

    public static void main(String[] args) {

        Empresa e1 = new Empresa("Empresa 1", "Loja");
        Empresa e3 = new Empresa ("Empresa 3", "Guayaquil");
        Empresa e2 = new Empresa("Empresa 2", "Cuenca");
        ArrayList<Empresa> empresas = new ArrayList<>();
        empresas.add(e1);
        empresas.add(e2);
        empresas.add(e3);
        for (int i = 0; i < empresas.size(); i++) {
            //nombre
            //ciudad

            System.out.printf("%s - %s\n",
                    empresas.get(i).obtenerNombre(), 
                    empresas.get(i).obtenerCiudad());
        }

    }

}
