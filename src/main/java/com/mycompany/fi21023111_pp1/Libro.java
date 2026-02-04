package com.mycompany.fi21023111_pp1;

import java.util.Date;

/**
 *
 * @author orozc
 */
public class Libro extends Producto{
    
    private int numPaginas;
    private String editorial;

    // Metodo Constructor
    public Libro(int numPaginas, String editorial, String nombre, double precio, Date fechaPublicacion) {
        super(nombre, precio, fechaPublicacion);
        this.numPaginas = numPaginas;
        this.editorial = editorial;
    }
    
    //Getter y Setters

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    // Metodo para calcular precio
    @Override
    public double calcularPrecio() {
        return super.calcularPrecio();
        /*
        Hay que agregar los descuentos:
        -mas de 300paginas = descuento de 10%
        -mas de 1000paginas = descuento adicional del 20% osea 30%
        */
    }
    
    
    
    
    
}
