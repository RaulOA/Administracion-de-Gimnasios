
package Datos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListBook {
    
    static ArrayList<Book> listbook = new ArrayList<>();
    
    // raul. Este metodo se trae los datos del panel de ingresar clientes y los 
    // reune todos en un objeto, el cual inserta dentro del array list:
    
    public void InsertarDatos(String ID, String nombre,String apellido,String genero,String peso, String altura, String telefono, String padecimientos){
        Book libro = new Book();
        libro.setID(ID);
        libro.setNombre(nombre);
        libro.setApellido(apellido);
        libro.setGenero(genero);
        libro.setPeso(peso);
        libro.setAltura(altura);
        libro.setTelefono(telefono);
        libro.setPadecimientos(padecimientos);
        
        listbook.add(libro);
        
        JOptionPane.showMessageDialog(null, "Cliente Ingresado");
    }
       
    
    // raul. Este metodo se ejecuta al presionar el boton verificar y
    // es para verificar todos los objetos ingresados en el array list:
    public void getBooks(){
        
        String cadena = "";
        System.out.println("Tamaño del array: "+listbook.size()+"\n");
        for (int i = 0; i < listbook.size(); i++) {
            cadena+="Cliente: "+(i+1)+"\n";
            cadena+="ID: "+listbook.get(i).getID()+"\n";
            cadena+="Nombre: "+listbook.get(i).getNombre()+"\n";
            cadena+="Apellido: "+listbook.get(i).getApellido()+"\n";
            cadena+=""+"\n";            
        }
        JOptionPane.showMessageDialog(null, cadena);        
    }    
}
