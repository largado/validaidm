package avena;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.sql.Timestamp;
import java.util.Collections;


/**
 * @author Alexandro Avena
 * @version 0.1
 * Data 20/05/2022
 * Descrição valida tempo e retorno http client
 */

public class TesteComHttpClient {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest requisicao = HttpRequest.newBuilder(new URI("https://google.com"))
                .GET().build();

        Timestamp agora = new Timestamp(System.currentTimeMillis());
        String pegadata = agora.toString();
        System.out.println(pegadata);




        HttpResponse<String> resposta = cliente.send(requisicao, BodyHandlers.ofString());





        System.out.println(resposta.statusCode());
        System.out.println(resposta.headers());

        System.out.println(resposta.version());


        Timestamp depois = new Timestamp(System.currentTimeMillis());
        String pegadepois = depois.toString();
        System.out.println(pegadepois);
    }
}
