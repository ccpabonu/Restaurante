/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ccpabonu
 */
public class Usuario {
    private String cuenta;
    private String pass;

    public Usuario(String cuenta, String pass) {
        this.cuenta = cuenta;
        this.pass = pass;
    }
    public boolean equal(Usuario u2){       
        return (u2.getCuenta() == null ? this.cuenta == null : u2.getCuenta().equals(this.cuenta)) && u2.getPass()==this.pass;        
    }    

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}