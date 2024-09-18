public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre  = "Encanto";
        miPelicula.fechaLanzamineto = 2021;
        miPelicula.duracionMinutos = 120;

        miPelicula.muestraFichatecnica();
        miPelicula.evaluacion(10);
        miPelicula.evaluacion(10);

        System.out.println("La evalucion de esta pelicula es: " + miPelicula.sumaEvaluaciones);
        System.out.println("Total de evaluciones: " + miPelicula.totalEvaluciones);
        System.out.println("La media de la pelicula es: " + miPelicula.calculaMedia());

        Pelicula miPelicula2 = new Pelicula();
        miPelicula2.nombre = "Daniel";
        miPelicula2.fechaLanzamineto = 2022;
        miPelicula2.duracionMinutos = 180;

/*
        miPelicula2.muestraFichatecnica();
*/

    }
}
