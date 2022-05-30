/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    String nombreHospital;
    int numeroCamas;
    double presupuesto;
    
    public Hospital(String nombre, int m, double n) {
        nombreHospital=nombre; 
        presupuesto = n;
        numeroCamas = m;
        
    }

    public void establecerNombre(String n) {
        nombreHospital = n;
    }

    public void establecerNumeroCamas(int m) {
        numeroCamas =m;
    }
    public void establecerPresupuesto(double x){
    presupuesto = x;
    }
    

    public String obtenerNombre() {
        return nombreHospital;
    }

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }
    
    public double obtenerPresupuesto() {
        return presupuesto;
    }
}