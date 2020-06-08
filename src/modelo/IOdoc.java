/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Asus
 */
public class IOdoc {
    public static void GuardarInventario(MinHeap <Producto> datos) throws IOException{
        
        FileWriter writer=null;
        
        try{
            writer= new FileWriter("Inventario.txt");
            for(int i=1;i<=datos.size();i++){
                Producto aux=datos.getNode(i);
                writer.write(aux.getNombre()+","+aux.getCantidad()+","+aux.getCosto()+"\n");
            }
            
        }catch(FileNotFoundException ex){
            System.out.println("Ha ocurrido un error al intentar abrir el archivo: ");
            ex.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }finally{
            System.out.println("El archivo liberado");
            writer.close();
        }
       
    }
    
        public static void CargarInventario(MinHeap <Producto> datos) throws FileNotFoundException, IOException{
        
        try{   
            File file=new File("Inventario.txt");
            
            FileReader fileReader= new FileReader(file);
            BufferedReader reader=new BufferedReader(fileReader);
            
            String line=null;
            
            while ((line=reader.readLine()) != null){
                String[] cont=line.split(",");
                Producto aux= new Producto(cont[0],Integer.parseInt(cont[1]),Integer.parseInt(cont[2]));
                datos.put(aux);
            }
            reader.close();
            
        }catch(FileNotFoundException ex){
            System.out.println("Ha ocurrido un error al intentar abrir el archivo: ");
            ex.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
        
}
