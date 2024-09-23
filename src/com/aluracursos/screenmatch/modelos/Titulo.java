package com.aluracursos.screenmatch.modelos;

public class Titulo  implements Comparable<Titulo>{

    private String nombre;
    private int fechaLanzamineto;
    private int duracionMinutos;
    private boolean incluidoPlan;
    private double sumaEvaluaciones;
    private int totalEvaluciones;

    public Titulo(String nombre, int fechaLanzamineto) {
        this.nombre = nombre;
        this.fechaLanzamineto = fechaLanzamineto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaLanzamineto() {
        return fechaLanzamineto;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public boolean isIncluidoPlan() {
        return incluidoPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaLanzamineto(int fechaLanzamineto) {
        this.fechaLanzamineto = fechaLanzamineto;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void setIncluidoPlan(boolean incluidoPlan) {
        this.incluidoPlan = incluidoPlan;
    }

    public int getTotalEvaluciones() {
        return totalEvaluciones;
    }


    public void muestraFichaTecnica() {
        System.out.println("El nombre de la película es: " + nombre);
        System.out.println("La película Fue estrena en el año: " + fechaLanzamineto);
        System.out.println("La duracion en minutos de la película es: " + getDuracionMinutos());
    }

    public void evaluacion(double nota) {
        sumaEvaluaciones += nota;
        totalEvaluciones++;
    }

    public double calculaMedia() {
        return sumaEvaluaciones / totalEvaluciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}


