import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        System.out.println("\n****************************************************************\n");

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setDuracionMinutos(120);
        miPelicula.setIncluidoPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evaluacion(10);
        miPelicula.evaluacion(10);
        miPelicula.evaluacion(6.7);
        System.out.println("El total de las evaluaciones de la película es: " + miPelicula.getTotalEvaluciones());
        System.out.println("La media de la película es: " + miPelicula.calculaMedia());

        System.out.println("\n****************************************************************\n");

        Pelicula miPelicula2 = new Pelicula("Matrix", 1998);
        miPelicula2.setDuracionMinutos(180);

        System.out.println("\n****************************************************************\n");

        Serie casaDragon = new Serie("Casa del Dragon", 2023);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println("La serie Casa del Dragon tiene una duración en minutos de: " + casaDragon.getDuracionMinutos());

        System.out.println("\n****************************************************************\n");

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(miPelicula2);
        System.out.println("El tiempo total de la película es: " + calculadora.getTiempoTotal() + " minutos");

        System.out.println("\n****************************************************************\n");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        System.out.println("\n****************************************************************\n");

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);
        filtroRecomendacion.filtra(episodio);

        System.out.println("\n****************************************************************\n");

        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.setDuracionMinutos(180);


        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(miPelicula2);

        System.out.println("El tamaño de la lista de películas es: " + listaDePeliculas.size());
        System.out.println("La primera película es: " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas.toString());
        System.out.println("toString de la película: " + listaDePeliculas.get(0).toString());
    }

}
