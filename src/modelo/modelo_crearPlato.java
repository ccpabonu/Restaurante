/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;
import vista.crear_plato;
import static vista.crear_plato.menu;


/**
 *
 * @author Asus
 */
public class modelo_crearPlato {
    
    crear_plato view;
    String name=null;
    Producto I1, I2, I3, I4, I5, I6, I7, I8, I9, I10=null;
    double  C1, C2, C3, C4, C5, C6, C7, C8, C9, C10=0;

    
    
    public modelo_crearPlato(crear_plato view){
        this.view=view;
    }
    
    public crear_plato getView() {
        return view;
    }

    public void setView(crear_plato view) {
        this.view = view;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Producto getI1() {
        return I1;
    }

    public void setI1(Producto I1) {
        this.I1 = I1;
    }

    public Producto getI2() {
        return I2;
    }

    public void setI2(Producto I2) {
        this.I2 = I2;
    }

    public Producto getI3() {
        return I3;
    }

    public void setI3(Producto I3) {
        this.I3 = I3;
    }

    public Producto getI4() {
        return I4;
    }

    public void setI4(Producto I4) {
        this.I4 = I4;
    }

    public Producto getI5() {
        return I5;
    }

    public void setI5(Producto I5) {
        this.I5 = I5;
    }

    public Producto getI6() {
        return I6;
    }

    public void setI6(Producto I6) {
        this.I6 = I6;
    }

    public Producto getI7() {
        return I7;
    }

    public void setI7(Producto I7) {
        this.I7 = I7;
    }

    public Producto getI8() {
        return I8;
    }

    public void setI8(Producto I8) {
        this.I8 = I8;
    }

    public Producto getI9() {
        return I9;
    }

    public void setI9(Producto I9) {
        this.I9 = I9;
    }

    public Producto getI10() {
        return I10;
    }

    public void setI10(Producto I10) {
        this.I10 = I10;
    }

    public double getC1() {
        return C1;
    }

    public void setC1(double C1) {
        this.C1 = C1;
    }

    public double getC2() {
        return C2;
    }

    public void setC2(double C2) {
        this.C2 = C2;
    }

    public double getC3() {
        return C3;
    }

    public void setC3(double C3) {
        this.C3 = C3;
    }

    public double getC4() {
        return C4;
    }

    public void setC4(double C4) {
        this.C4 = C4;
    }

    public double getC5() {
        return C5;
    }

    public void setC5(double C5) {
        this.C5 = C5;
    }

    public double getC6() {
        return C6;
    }

    public void setC6(double C6) {
        this.C6 = C6;
    }

    public double getC7() {
        return C7;
    }

    public void setC7(double C7) {
        this.C7 = C7;
    }

    public double getC8() {
        return C8;
    }

    public void setC8(double C8) {
        this.C8 = C8;
    }

    public double getC9() {
        return C9;
    }

    public void setC9(double C9) {
        this.C9 = C9;
    }

    public double getC10() {
        return C10;
    }

    public void setC10(double C10) {
        this.C10 = C10;
    }
    
 
    
       public void IngredientesCB( MinHeap <Producto> ingredientes){//llenar Combo box con datos de un minheap
        view.Ingrediente1.addItem("Nulo");
        view.Ingrediente2.addItem("Nulo");
        view.Ingrediente3.addItem("Nulo");
        view.Ingrediente4.addItem("Nulo");
        view.Ingrediente5.addItem("Nulo");
        view.Ingrediente6.addItem("Nulo");
        view.Ingrediente7.addItem("Nulo");
        view.Ingrediente8.addItem("Nulo");
        view.Ingrediente9.addItem("Nulo");
        view.Ingrediente10.addItem("Nulo"); 
        for(int i=1;i<=ingredientes.size();i++){
            view.Ingrediente1.addItem(ingredientes.getNode(i).getNombre());
            view.Ingrediente2.addItem(ingredientes.getNode(i).getNombre());
            view.Ingrediente3.addItem(ingredientes.getNode(i).getNombre());
            view.Ingrediente4.addItem(ingredientes.getNode(i).getNombre());
            view.Ingrediente5.addItem(ingredientes.getNode(i).getNombre());
            view.Ingrediente6.addItem(ingredientes.getNode(i).getNombre());
            view.Ingrediente7.addItem(ingredientes.getNode(i).getNombre());
            view.Ingrediente8.addItem(ingredientes.getNode(i).getNombre());
            view.Ingrediente9.addItem(ingredientes.getNode(i).getNombre());
            view.Ingrediente10.addItem(ingredientes.getNode(i).getNombre()); 
        }
    } 

    public void crearplato(){
    
        Plato nuevo=new Plato(this.name,this.I1,this.I2,this.I3,this.I4,this.I5,this.I6,this.I7,this.I8,this.I9,this.I10,
                this.C1,this.C2,this.C3,this.C4,this.C5,this.C6,this.C7,this.C8,this.C9,this.C10);
        menu.add(nuevo);
        JOptionPane.showMessageDialog(null, "Plato creado con exito");
    
    }   
}
