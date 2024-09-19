import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        System.out.println("\n****************************************************************\n");

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

        System.out.println("\n****************************************************************\n");

        Pelicula miPelicula2 = new Pelicula();
        miPelicula2.setNombre("Matrix");
        miPelicula2.setFechaLanzamineto(1998);
        miPelicula2.setDuracionMinutos(180);

        System.out.println("\n****************************************************************\n");

        Serie casaDragon = new Serie();
        casaDragon.setNombre("Casa del Dragon");
        casaDragon.setFechaLanzamineto(2023);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println("La serie Casa del Dragon tiene una duracion en minutos de: " + casaDragon.getDuracionMinutos());

        System.out.println("\n****************************************************************\n");

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(miPelicula2);
        System.out.println("El tiempo total de la película es: " + calculadora.getTiempoTotal() + " minutos");

        System.out.println("\n****************************************************************\n");




    }

}
