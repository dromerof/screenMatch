public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre  = "Encanto";
        miPelicula.fechaLanzamineto = 2021;
        miPelicula.duracionMinutos = 120;

        System.out.println("Mi película es: " + miPelicula.nombre);
        System.out.println("Fue estrena en el año: " + miPelicula.fechaLanzamineto);

        Pelicula miPelicula2 = new Pelicula();
        miPelicula2.nombre = "Daniel";
        miPelicula2.fechaLanzamineto = 2022;
        miPelicula2.duracionMinutos = 180;

        System.out.println("Mi película2 es: " + miPelicula2.nombre);
        System.out.println("Fue estrena en el año: " + miPelicula2.fechaLanzamineto);

    }
}
