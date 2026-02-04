package com.mycompany.fi21023111_pp1;

import java.util.Date;

/**
 *
 * @author orozc
 */
public class Periodico extends Producto{
    
    private int numEdicionesMes;

    // Metodo Constructor
    public Periodico(int numEdicionesMes, String nombre, double precio, Date fechaPublicacion) {
        super(nombre, precio, fechaPublicacion);
        this.numEdicionesMes = numEdicionesMes;
    }
    
    // Getter y Setters
    public int getNumEdicionesMes() {
        return numEdicionesMes;
    }

    public void setNumEdicionesMes(int numEdicionesMes) {
        this.numEdicionesMes = numEdicionesMes;
    }
    
    // Metodo Calcular Precio (Aplica el polimorfismo)
    @Override
    public double calcularPrecio() {
        return super.calcularPrecio();
        /*
        1.Si el periodo se publica 1 vez al mes. No tiene descuento.
        2.Si se publica 2 veces al mes. Descuento del 1%.
        3.Si se publica 3 veces al mes. Descuento del 2%.
        4.Si se publica 30 veces al mes. Descuento del 29%.
        */
    }
    
    
    
}
