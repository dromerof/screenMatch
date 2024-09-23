package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evaluacion(9);
        Pelicula miPelicula2 = new Pelicula("Matrix", 1998);
        miPelicula2.evaluacion(6);
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.evaluacion(10);
        Serie casaDragon = new Serie("Casa del Dragon", 2023);


        Pelicula pl = peliculaDeBruno;

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(miPelicula);
        lista.add(miPelicula2);
        lista.add(peliculaDeBruno);
        lista.add(casaDragon);

        for (Titulo item : lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
            System.out.println(pelicula.getClasificacion());
            }
        }
    }
}
