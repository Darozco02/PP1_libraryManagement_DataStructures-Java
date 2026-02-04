package com.mycompany.fi21023111_pp1;

import java.util.Date;

/**
 *
 * @author orozc
 */
public class Revista extends Producto{
    
    private String frecuenciaPublicacion; // (mensual, bisemanal, semanal)
    
    // Metodo Constructor
    public Revista(String frecuenciaPublicacion, String nombre, double precio, Date fechaPublicacion) {
        super(nombre, precio, fechaPublicacion);
        this.frecuenciaPublicacion = frecuenciaPublicacion;
    }
    
    //Getter y Setters
    public String getFrecuenciaPublicacion() {
        return frecuenciaPublicacion;
    }

    public void setFrecuenciaPublicacion(String frecuenciaPublicacion) {
        this.frecuenciaPublicacion = frecuenciaPublicacion;
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio();
        /*
        Descuentos:
        -publicadas mensualmente = 5%
        -publicadas bisemanalmente = 10%
        -publicadas semanalmente = 20%
        */
    }
    
    
    
    
    
}
