package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el nombre de la película: ");
        var busqueda = teclado.nextLine();
        String busquedaCodificada = URLEncoder.encode(busqueda, StandardCharsets.UTF_8);
        String direccion = "https://www.omdbapi.com/?t=" + busquedaCodificada + "&apikey=1a5f7624";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(miTituloOmdb);

            Titulo miTitulo = new Titulo(miTituloOmdb);
            System.out.println("Titulo ya convertido: " + miTitulo);
        } catch (NumberFormatException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error en la URI, verifiquen la dirección");
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado");
        } finally {
            System.out.println("Finalizo la ejecución de programa");
        }

    }
}
