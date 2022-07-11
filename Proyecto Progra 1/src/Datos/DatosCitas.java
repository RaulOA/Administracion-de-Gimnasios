package Datos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatosCitas {

    //Yir. Creo las variables de instancia con sus métodos get y set. 
    //La variable fecha lleva se captura con el formato Date porque la estoy tomando del jcalendar.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    private String nombre;
    private String apellido;
    private Date fecha;
    private String hora;
    private String numero;
}
