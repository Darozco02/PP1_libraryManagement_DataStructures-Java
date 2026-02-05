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
    
    /**
     * El metodo calcularPrecio() calculara el precio final del producto
     * Periodico, segun el periodo de publicaciones se le aplicara un descuento al precio
     * final.
     *
     * @author Daniel Orozco
     *
     * @return este metodo retorna un valor double con el precio final del
     * producto despues de aplicar los descuentos.
     */
    @Override
    public double calcularPrecio() {
        double precioFinalPeriodico;
        
        if (numEdicionesMes >= 30) {
            precioFinalPeriodico = getPrecio() * 0.69;
            System.out.println("-El precio del periodico es de: " + getPrecio() + " Colones" + "\n"
                    + "Debido al periodo de publicacion recibira un descuento del 29% \n"
                    + "Su precio final sera de: " + precioFinalPeriodico + " Colones" + "\n");
            
        } else if(numEdicionesMes >=  3 && numEdicionesMes <= 29){
            precioFinalPeriodico = getPrecio() * 0.98;
            System.out.println("-El precio del periodico es de: " + getPrecio() + " Colones" + "\n"
                    + "Debido al periodo de publicacion recibira un descuento del 2% \n"
                    + "Su precio final sera de: " + precioFinalPeriodico + "Colones" + "\n");
            
        } else if(numEdicionesMes == 2){
            precioFinalPeriodico = getPrecio() * 0.99;
            System.out.println("-El precio del periodico es de: " + getPrecio() + " Colones" + "\n"
                    + "Debido al periodo de publicacion recibira un descuento del 1% \n"
                    + "Su precio final sera de: " + precioFinalPeriodico + " Colones" + "\n");
            
        } else {
            precioFinalPeriodico = getPrecio();
            System.out.println("-El precio del periodico es de: " + precioFinalPeriodico + " Colones" + "\n");
        }
        return super.calcularPrecio();
    }
    
    /**
     * El siguiente metodo precioTotalPeriodicos() hara un calculo del precio de
     * todos los libros y lo mostrara en pantalla
     * 
     * @author Daniel Orozco
     * @param almacenarPeriodicos este parametro se refiere a los datos guardados en el arreglo Periodico[]
     * @return este metodo retorna el precioTotalPeriodicos; con la suma de los
     * precios de todos los periodicos dentro del arreglo.
     */
    public static double precioTotalPeriodicos(Periodico[] almacenarPeriodicos){
        double precioTotalPeriodicos = 0;
        
        for (int i = 0; i < almacenarPeriodicos.length; i++) {
            double precioPeriodico = almacenarPeriodicos[i].calcularPrecio();
            // Sumar todos los libros
            precioTotalPeriodicos += precioPeriodico;
        }
        
        System.out.println("El precio de todos los periodicos es de: " + precioTotalPeriodicos + " Colones");
        return precioTotalPeriodicos;
    }
    
    
    
}
