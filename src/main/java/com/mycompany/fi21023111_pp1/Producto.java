package com.mycompany.fi21023111_pp1;

import java.util.Date;

/**
 *
 * @author orozc
 */
public class Producto {
    
    private String nombre;
    private double precio;
    private Date fechaPublicacion;
    
    // Metodo Constructor
    public Producto(String nombre, double precio, Date fechaPublicacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.fechaPublicacion = fechaPublicacion;
    }

    // Getter y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    // Metodo que devuelve el precio del producto 
    public double calcularPrecio(){
        return precio;
    }

}
