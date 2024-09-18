import com.aluracursos.screenmatch.modelos.Pelicula;

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
        System.out.println("El total de las evaluciones de la pelicula es: " + miPelicula.getTotalEvaluciones());
        System.out.println("La media de la película es: " + miPelicula.calculaMedia());


    }
}
