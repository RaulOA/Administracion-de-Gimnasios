package Datos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ListBook {
    public static ArrayList<Book> listbook = new ArrayList<>();
    // raul. Este metodo se ejecuta al presionar el boton verificar y
    // es para verificar todos los objetos ingresados en el array list:
    public void verificar(){
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
