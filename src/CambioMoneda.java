import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CambioMoneda {
    public ConversionResponse guardarMoneda() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese su apiKey");
        String apikey = scn.next();

        URI direccion = URI.create( "https://v6.exchangerate-api.com/v6/"+apikey+"/latest/USD");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> respuesta = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            return gson.fromJson(respuesta.body(), ConversionResponse.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
