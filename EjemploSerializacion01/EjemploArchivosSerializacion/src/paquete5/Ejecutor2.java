/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import paquete4.*;


public class Ejecutor2 {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "Hospital.data";
        String cedula_buscar = "Jean Panamito";
        Hospital hospital_buscar;
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerIdentificador(cedula_buscar);
        lectura.establecerHospitalBuscado();
        hospital_buscar = lectura.obtenerHospitalBuscado();
        if(hospital_buscar!=null){
            System.out.println(hospital_buscar.nombreHospital);
        }else{
            System.out.println("Hospital no encontrado");
        }
        
    }
}
