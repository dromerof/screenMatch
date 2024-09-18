import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaLanzamineto(2021);
        miPelicula.setDuracionMinutos(120);
        miPelicula.setIncluidoPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evaluacion(10);
        miPelicula.evaluacion(10);
        miPelicula.evaluacion(6.7);
        System.out.println("El total de las evaluaciones de la película es: " + miPelicula.getTotalEvaluciones());
        System.out.println("La media de la película es: " + miPelicula.calculaMedia());

    }
}
