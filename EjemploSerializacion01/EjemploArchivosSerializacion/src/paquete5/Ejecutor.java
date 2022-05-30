/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "Hospital.data";
        
        Hospital hos1 = new Hospital("Tara Hernandez", 2,344.5);
        Hospital hos2 = new Hospital("Jean Panamito", 2,1200.5);
        Hospital hos3 = new Hospital("Jose Jimenez", 6,10.5);
        

        EscrituraArchivoSecuencial archivo = 
                new EscrituraArchivoSecuencial(nombreArchivo);
        
        // establecer el valor del atributo registro
        archivo.establecerRegistroHospital(hos1);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(hos2);
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(hos3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
        
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerHospital();
        System.out.println(lectura);
    }
}
