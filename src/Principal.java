public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre  = "Encanto";
        miPelicula.fechaLanzamineto = 2021;
        miPelicula.duracionMinutos = 120;

        miPelicula.muestraFichatecnica();
        miPelicula.evaluacion(10);
        miPelicula.evaluacion(10);
        miPelicula.evaluacion(6.7);

        System.out.println("La evalución de esta película es: " + miPelicula.sumaEvaluaciones);
        System.out.println("Total de evoluciones: " + miPelicula.totalEvaluciones);
        System.out.println("La media de la película es: " + miPelicula.calculaMedia());

        System.out.println("*****************************************************************");

        miPelicula.sumaEvaluaciones = 2;
        miPelicula.totalEvaluciones = 1;
        System.out.println("Nueva media de la película: " + miPelicula.calculaMedia());

        Pelicula miPelicula2 = new Pelicula();
        miPelicula2.nombre = "Daniel";
        miPelicula2.fechaLanzamineto = 2022;
        miPelicula2.duracionMinutos = 180;

/*
        miPelicula2.muestraFichatecnica();
*/

    }
}
