package com.Backend.PruebaBack.Services;

import com.Backend.PruebaBack.ApiConecction.Apiservice;
import com.Backend.PruebaBack.Model.*;

import org.springframework.stereotype.Service;
import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.stream.Collectors;


@Service
public class AsteroidsService implements IAsteroidsService {

    Apiservice Conection;
    public List<Asteroids> getAsteroides(String Planet) throws IOException, InterruptedException {
Conection = new Apiservice();
        HttpResponse<String> response = Conection.getConection();
        String responseBody = response.body().toString();
        List<Asteroids> asteroides = new ArrayList<>();
        List<Asteroids> TOP3asteroides = new ArrayList<>();
        if(response!=null) {
            RootData asteroids = ReadJSON.fromJsonString(response.body());
            List< RootData> asteroidsList = Collections.singletonList(asteroids);
            Map<String, List<NearEarthObjects>> nearEarthObjects = asteroidsList.get(0).getNearEarthObjects();

            Collection<List<NearEarthObjects>> list = nearEarthObjects.values();
            List<NearEarthObjects> nearEarthObjectList = new ArrayList<>();
            list.forEach(nearEarthObjectList::addAll);

            //Peligrosos

            List<NearEarthObjects> nearEarthObjectDangerous = nearEarthObjectList.stream().filter(NearEarthObjects::getIsPotentiallyHazardousAsteroid).collect(Collectors.toList());


      for(NearEarthObjects o: nearEarthObjectDangerous){
        Asteroids a = new Asteroids();
         a.setNombre(o.getName());
         CloseApproachDatum d = o.getCloseApproachData().get(0);
         EstimatedDiameter e = o.getEstimatedDiameter();
         Kilometers k = e.getKilometers();
         double Medida = k.getEstimatedDiameter();
         RelativeVelocity velocity = d.getRelativeVelocity();
         String velocidad = velocity.getKilometersPerHour();
         a.setDiametro(Medida);
         a.setFecha(d.getCloseApproachDate());
         a.setVelocidad(velocidad);
         a.setPlaneta(d.getOrbitingBody());
         asteroides.add(a);

      }
      //Ordenarlos por tamaño
            asteroides.sort(Asteroids::compareTo);
//los tres mas grandes

            TOP3asteroides.add(asteroides.get(0));
            TOP3asteroides.add(asteroides.get(1));
            TOP3asteroides.add(asteroides.get(2));
        }
        return TOP3asteroides;
    }
}
