package Datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

public class BaseDeDatos {

    File archivo = new File("Lista de Clientes.txt");
    public static boolean pase = true;

    public void cargarArchivo() throws IOException {
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
        BufferedReader rd = new BufferedReader(new FileReader(archivo));
        String linea = null;
        while ((linea = rd.readLine()) != null) {

            StringTokenizer st = new StringTokenizer(linea, "+");
            while (st.hasMoreTokens()) {
                String ID = st.nextToken();
                String nombre = st.nextToken();
                String apellido = st.nextToken();
                String edad = st.nextToken();
                String genero = st.nextToken();
                String peso = st.nextToken();
                String altura = st.nextToken();
                String telefono = st.nextToken();
                String padecimientos = st.nextToken();
                String dia = st.nextToken();
                Book nuevos = new Book();
                nuevos.clientesEstaticos(ID, nombre, apellido, edad, genero, peso, altura, telefono, padecimientos, dia);
            }

        }

    }

    public void ingresarNuevo(String ID,
            String nombre,
            String apellido,
            String edad,
            String genero,
            String peso,
            String altura,
            String telefono,
            String padecimientos,
            String dia) throws FileNotFoundException, UnsupportedEncodingException, IOException {

        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true), "utf-8"));
        wr.write(ID + "+" + nombre
                + "+" + apellido
                + "+" + edad
                + "+" + genero
                + "+" + peso
                + "+" + altura
                + "+" + telefono
                + "+" + padecimientos
                + "+" + dia + "\n");
        wr.close();
    }

    public void refrescarBD() throws IOException {

        BufferedWriter br = new BufferedWriter(new FileWriter(archivo));
        br.write("");
        br.close();

        for (int i = 0; i < ListBook.listbook.size(); i++) {

            BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true), "utf-8"));
            wr.write(ListBook.listbook.get(i).getID() + "+"
                    + ListBook.listbook.get(i).getNombre() + "+"
                    + ListBook.listbook.get(i).getApellido() + "+"
                    + ListBook.listbook.get(i).getEdad() + "+"
                    + ListBook.listbook.get(i).getGenero() + "+"
                    + ListBook.listbook.get(i).getPeso() + "+"
                    + ListBook.listbook.get(i).getAltura() + "+"
                    + ListBook.listbook.get(i).getTelefono() + "+"
                    + ListBook.listbook.get(i).getPadecimientos() + "+"
                    + ListBook.listbook.get(i).getDia() + "\n");
            wr.close();

        }

    }
}
