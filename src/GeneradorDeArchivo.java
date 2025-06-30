import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GeneradorDeArchivo {
    public GeneradorDeArchivo() throws IOException, InterruptedException {
        String key = "754f4fbe4b877eb6fc6dfc40";
        URI direccion = URI.create( "https://v6.exchangerate-api.com/v6/"+key+"/latest/USD");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> respuesta = client.send(request, HttpResponse.BodyHandlers.ofString());
    }

}
