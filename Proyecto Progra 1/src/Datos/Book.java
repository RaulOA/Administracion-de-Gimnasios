package Datos;

public class Book {

    private String ID;
    private String nombre;
    private String apellido;
    private String edad;
    private String genero;
    private String peso;
    private String altura;
    private String telefono;
    private String padecimientos;
    private String dia;

    public Book() {
        ID = "";
        nombre = "";
        apellido = "";
        edad = "";
        genero = "";
        peso = "";
        altura = "";
        telefono = "";
        padecimientos = "";
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPadecimientos() {
        return padecimientos;
    }

    public void setPadecimientos(String padecimientos) {
        this.padecimientos = padecimientos;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

//     Este metodo carga los clientes de la base de datos al arraylist de clientes
    public void clientesEstaticos(String id, String no, String ap, String ed, String ge, String pe, String al, String te, String pa, String dia) {
        Book persona = new Book();
        persona.setID(id);
        persona.setNombre(no);
        persona.setApellido(ap);
        persona.setEdad(ed);
        persona.setGenero(ge);
        persona.setPeso(pe);
        persona.setAltura(al);
        persona.setTelefono(te);
        persona.setPadecimientos(pa);
        persona.setDia(dia);
        ListBook.listbook.add(persona);
    }

}
