import java.util.Scanner;

public class Pelicula {

    String nombre;
    int fechaLanzamineto;
    int duracionMinutos;
    boolean incluidoPlan;
    private double sumaEvaluaciones;
    private int totalEvaluciones;

    int getTotalEvaluciones(){
        return totalEvaluciones;
    }

    void muestraFichatecnica() {
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("La pelicula Fue estrena en el año: " + fechaLanzamineto);
        System.out.println("La duracion en minutos de la pelicula es: " + duracionMinutos);
    }

    void evaluacion(double nota) {
        sumaEvaluaciones += nota;
        totalEvaluciones++;
    }

    double calculaMedia() {
        return sumaEvaluaciones / totalEvaluciones;
    }
}
