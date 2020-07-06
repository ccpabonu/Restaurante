/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Asus
 */
public class V_diaria {
    String fecha;
    double vendido;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getVendido() {
        return vendido;
    }

    public void setVendido(double vendido) {
        this.vendido = vendido;
    }

    public V_diaria(String fecha, double vendido) {
        this.fecha = fecha;
        this.vendido = vendido;
    }
    
}
