package com.mycompany.fi21023111_pp1;

import java.util.Date;

/**
 *
 * @author orozc
 */
public class Revista extends Producto {

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

    /**
     * El metodo calcularPrecio() calculara el precio final del producto
     * Revista, segun las publicaciones se le aplicara un descuento al precio
     * final.
     *
     * @author Daniel Orozco
     *
     * @return este metodo retorna un valor double con el precio final del
     * producto despues de aplicar los descuentos.
     */
    @Override
    public double calcularPrecio() {
        double precioFinalRevista;

        if (frecuenciaPublicacion.equalsIgnoreCase("semanal")) {
            precioFinalRevista = getPrecio() * 0.80;
            System.out.println("-El precio de la revista es de: " + getPrecio() + "Colones" + "\n"
                    + "Debido a su frecuencia de publicacion recibira un descuento del 20% \n"
                    + "Su precio final sera de: " + precioFinalRevista + "Colones" + "\n");

        } else if (frecuenciaPublicacion.equalsIgnoreCase("bisemanal")) {
            precioFinalRevista = getPrecio() * 0.90;
            System.out.println("-El precio de la revista es de: " + getPrecio() + " Colones" + "\n"
                    + "Debido a su frecuencia de publicacion recibira un descuento del 10% \n"
                    + "Su precio final sera de: " + precioFinalRevista + " Colones" + "\n");

        } else if (frecuenciaPublicacion.equalsIgnoreCase("mensual")) {
            precioFinalRevista = getPrecio() * 0.95;
            System.out.println("-El precio de la revista es de: " + getPrecio() + " Colones" + "\n"
                    + "Debido a su frecuencia de publicacion recibira un descuento del 5% \n"
                    + "Su precio final sera de: " + precioFinalRevista + " Colones" + "\n");

        } else {
            precioFinalRevista = getPrecio();
            System.out.println("-El precio de la revista es de: " + precioFinalRevista + " Colones" + "\n");
        }
        return super.calcularPrecio();
    }
    
     /**
     * El siguiente metodo precioTotalRevistas() hara un calculo del precio de
     * todos los libros y lo mostrara en pantalla
     * 
     * @author Daniel Orozco
     * @param almacenarRevista parametro se refiere a los datos guardados en el arreglo Revista[]
     * @return este metodo retorna el precioTotalRevistas; con la suma de los
     * precios de todos las revistas dentro del arreglo.
     */
    public static double precioTotalRevistas(Revista[] almacenarRevista){
        double precioTotalRevistas = 0;
        
        for (int i = 0; i < almacenarRevista.length; i++) {
            double precioRevista = almacenarRevista[i].calcularPrecio();
            // Sumar todos los libros
            precioTotalRevistas += precioRevista;
        }
        
        System.out.println("El precio de todas las revistas es de: " + precioTotalRevistas + " Colones");
        return precioTotalRevistas;
    }
    
    /**
     * El siguiente metodo aplica la recursividad, de manera en que si la
     * posicion es mayor o igual a la cantidad del arreglo Revista[] esta 
     * cumplira su caso base, en caso que no se cumpla la condicion, el 
     * metodo sumara 1 a la posicion.
     * 
     * @author Daniel Orozco
     * 
     * @param almacenarRevistas este parametro traera la informacion del 
     * arreglo Libro[]
     * @param posicion este parametro indica la posicion del libro dentro
     * del arreglo Libro[]
     * 
     * @return en este caso el metodo retorna la cantidad de datos dentro del
     * arreglo Libro[]
     */
    public static int cantidadRevistas(Revista[] almacenarRevistas, int posicion){
        // Caso Base
        if (posicion >= almacenarRevistas.length) {
            return 0;
        // Caso Recursivo
        } else {
            return 1 + cantidadRevistas(almacenarRevistas, posicion + 1);
        }        
    }

}
