package Datos;

import java.util.ArrayList;

public class Entrenadores extends Book {

    private String especialidad;
    public static ArrayList<Entrenadores> listrainers = new ArrayList<>();

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void inscribirentrenador(String Nombre, String Edad, String Telefono, String Especialidad) {

        Entrenadores nuevo = new Entrenadores();
        nuevo.setNombre(Nombre);
        nuevo.setEdad(Edad);
        nuevo.setTelefono(Telefono);
        nuevo.setEspecialidad(Especialidad);
        listrainers.add(nuevo);

    }
}
