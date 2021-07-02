package com.Backend.PruebaBack.ApiConecction;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;


public class Apiservice {
    public  HttpResponse<String>  getConection() throws IOException, InterruptedException {

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = date1.plusDays(7);

        String URL = "https://api.nasa.gov/neo/rest/v1/feed?start_date="+date1+"&end_date="+date2+"&api_key=zdUP8ElJv1cehFM0rsZVSQN7uBVxlDnu4diHlLSb";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .uri(URI.create(URL))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response;

    }
}
