/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author ccpabonu
 */
public class IOdoc2 {

    public static void GuardarUsuarios(LinkedQueue list) throws IOException {

        {
        try
        {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Usuarios.txt"));
            
            oos.writeObject(list);            
            oos.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    } 

    }

    public static LinkedQueue CargarUsuarios() throws FileNotFoundException, IOException, ClassNotFoundException {
        LinkedQueue users = new LinkedQueue();
        try
        {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Usuarios.txt"));
            
            // Se lee el primer objeto
            Object aux = ois.readObject();
            
            users=(LinkedQueue) aux;          
         
            ois.close();
        }
        catch (EOFException e1)
        {
            System.out.println ("Fin de fichero");
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
        return users;
    }

}
