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
    
    /**
     * El siguiente metodo calculara el precio final del producto Libro, segun
     * el numero de paginas se le aplicara un descuento al precio final.
     * 
     * @author Daniel Orozco
     * 
     * @return este metodo retorna un valor double con el precio final del producto
     * despues de aplicar los descuentos.
     */
    @Override
    public double calcularPrecio() {
        
        double precioFinalLibro;
        
        if (numPaginas > 1000) {
            precioFinalLibro = getPrecio() * 0.70;
            System.out.println("- El precio del libro es de: " + getPrecio() + " Colones"  + "\n"
                              + "recibira un 30% de descuento, " + "\n"
                              + "por lo que su precio final sera de: " + precioFinalLibro + " Colones" + "\n");
            }
        else if(numPaginas > 300 && numPaginas < 999){
            precioFinalLibro = getPrecio() * 0.90;
            System.out.println("- El precio del libro es de: " + getPrecio() + " Colones" + "\n"
                              + "recibira un 10% de descuento, " + "\n"
                              + "por lo que su precio final sera de: " + precioFinalLibro + " Colones" + "\n");
        } else {
            precioFinalLibro = getPrecio();
            System.out.println("- El precio final del Libro es de: " + precioFinalLibro + " Colones" + "\n");
        }
        return super.calcularPrecio();
    }
    
    /**
     * El siguiente metodo precioTotalLibros() hara un calculo del precio de
     * todos los libros y lo mostrara en pantalla
     * 
     * @author Daniel Orozco
     * @param almacenarLibros este parametro se refiere a los datos guardados en el arreglo Libro[]
     * @return este metodo retorna el precioTotalLibros; con la suma de los
     * precios de todos los libros dentro del arreglo.
     */
    public static double precioTotalLibros(Libro[] almacenarLibros){
        double precioTotalLibros = 0;
        
        for (int i = 0; i < almacenarLibros.length; i++) {
            double precioLibro = almacenarLibros[i].calcularPrecio();
            // Sumar todos los libros
            precioTotalLibros += precioLibro;
        }
        
        System.out.println("El precio de todos los libros es de: " + precioTotalLibros + " Colones");
        return precioTotalLibros;
    } 
    
    /**
     * El siguiente metodo aplica la recursividad, de manera en que si la
     * posicion es mayor o igual a la cantidad del arreglo Libro[] esta 
     * cumplira su caso base, en caso que no se cumpla la condicion, el 
     * metodo sumara 1 a la posicion.
     * 
     * @author Daniel Orozco
     * 
     * @param almacenarLibros este parametro traera la informacion del 
     * arreglo Libro[]
     * @param posicion este parametro indica la posicion del libro dentro
     * del arreglo Libro[]
     * 
     * @return en este caso el metodo retorna la cantidad de datos dentro del
     * arreglo Libro[]
     */
    public static int cantidadLibros(Libro[] almacenarLibros, int posicion){
        // Caso Base
        if (posicion >= almacenarLibros.length) {
            return 0;
        // Caso Recursivo
        } else {
            return 1 + cantidadLibros(almacenarLibros, posicion + 1);
        }        
    }
  
}
