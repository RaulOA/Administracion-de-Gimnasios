/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author PC
 */
public class ProductosVenta {
    
    String productos []={"Bebidas Energeticas","BATIDO DE PROTEÍNA","BOTELLA DE AGUA","SCOOP PREENTRENO","GUANTES","SCOOP DE KREATINA","BANANOS","CONFITES","INSCRIPCION"};
    double precios []={1000,1500,800,1000,5000,1000,100,25,15000};
    double precio=0;
    int cantidad=0;

    public ProductosVenta() {
    }

    public String[] getProductos() {
        return productos;
    }

    public void setProductos(String[] productos) {
        this.productos = productos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
