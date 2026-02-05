package com.mycompany.fi21023111_pp1;

import java.util.Date;

/**
 *
 * @author orozc
 */
public class FI21023111_PP1 {

    public static void main(String[] args) {
        
        // Arreglo Libros
        Libro[] almacenarLibros = new Libro[5];
        almacenarLibros[0] = new Libro(350, "Editorial Deportes", "Futbol Tico", 11250.0, new Date(17/5/2025));
        almacenarLibros[1] = new Libro(1400, "Editorial Historia", "II Guerra Mundial", 50000.0, new Date(23/8/2020));
        almacenarLibros[2] = new Libro(100, "Editorial Cuentos", "Cuentos Para Dormir", 10000.0, new Date(10/3/2022));
        almacenarLibros[3] = new Libro(800, "Editorial Peliculas", "Harry Potter", 30000.0, new Date(30/4/2025));
        almacenarLibros[4] = new Libro(700, "Editorial Biografias", "Biografia Steve Jobs", 40000.0, new Date(7/5/2023));
        // Mostrar precio Libros
        double totalLibros = Libro.precioTotalLibros(almacenarLibros);
        
        // Recursividad para mostrar cuantos datos hay dentro del arreglo Libro[]
        int cantidadLibros = Libro.cantidadLibros(almacenarLibros, 0);
        System.out.println("La cantidad de libros en el arreglo es de: " + cantidadLibros + " Libros" + "\n");
        
        // Arreglo Revistas
        Revista[] almacenarRevista = new Revista[5];
        almacenarRevista[0] = new Revista("semanal", "Recetas Dulces", 10000.0, new Date(26/4/2025));
        almacenarRevista[1] = new Revista("bisemanal", "Formula1 2025", 8500.0, new Date(3/9/2025));
        almacenarRevista[2] = new Revista("mensual", "Tecnologia Fidelitas", 5000.0, new Date(10/4/2025));
        almacenarRevista[3] = new Revista("semanal", "National Geografic", 11250.0, new Date(20/8/2025));
        almacenarRevista[4] = new Revista("mensual", "NBA Stars", 13800.0, new Date(15/2/2024));
        // Mostrar precio total Revistas
        double totalRevistas = Revista.precioTotalRevistas(almacenarRevista);
        
        // Recursividad para mostrar cuantos datos hay dentro del arreglo Libro[]
        int cantidadRevistas = Revista.cantidadRevistas(almacenarRevista, 0);
        System.out.println("La cantidad de revistas dentro del arreglo es de: " + cantidadRevistas + " Revistas" + "\n");

        
        // Arreglo Periodicos
        Periodico[] almacenarPeriodico = new Periodico[5];
        almacenarPeriodico[0] = new Periodico(30, "La Nacion", 4200.0, new Date(1/1/2026));
        almacenarPeriodico[1] = new Periodico(3, "El Financiero", 4200.0, new Date(26/1/2026));
        almacenarPeriodico[2] = new Periodico(2, "Semanario Universidad", 4200.0, new Date(5/2/2026));
        almacenarPeriodico[3] = new Periodico(1, "El Guardian", 4200.0, new Date(2/2/2026));
        almacenarPeriodico[4] = new Periodico(3, "Diario Extra", 4200.0, new Date(17/1/2026));
        // Mostrar precio total de Periodicos
        double totalPeriodicos = Periodico.precioTotalPeriodicos(almacenarPeriodico);


    }
}
