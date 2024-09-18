package com.aluracursos.screenmatch.modelos;

public class Pelicula {

    public String nombre;
    public int fechaLanzamineto;
    public int duracionMinutos;
    boolean incluidoPlan;
    private double sumaEvaluaciones;
    private int totalEvaluciones;

    public int getTotalEvaluciones(){
        return totalEvaluciones;
    }

    public void muestraFichatecnica() {
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("La pelicula Fue estrena en el año: " + fechaLanzamineto);
        System.out.println("La duracion en minutos de la pelicula es: " + duracionMinutos);
    }

    public void evaluacion(double nota) {
        sumaEvaluaciones += nota;
        totalEvaluciones++;
    }

    public double calculaMedia() {
        return sumaEvaluaciones / totalEvaluciones;
    }
}
