package com.Backend.PruebaBack.Controller;

import com.Backend.PruebaBack.ApiConecction.Apiservice;


import com.Backend.PruebaBack.Model.Asteroids;
import com.Backend.PruebaBack.Services.AsteroidsService;
import com.Backend.PruebaBack.exceptions.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/asteroids")
public class AsteroidsController {
    @Autowired
    private AsteroidsService asteroidsService;
    @GetMapping()
    public ResponseEntity<List<Asteroids>> getAsteroides(@RequestParam(name = "planeta", defaultValue ="Earth") String planeta) throws IOException, InterruptedException{
        System.out.println(planeta);
        if(planeta.equals("")){
            throw new RecordNotFoundException("El campo Planeta no puede ser nulo");
        }

        List<Asteroids> asteroidList=new ArrayList();

        asteroidList.addAll(this.asteroidsService.getAsteroides(planeta));

        return new ResponseEntity<List<Asteroids>>(asteroidList,new HttpHeaders(),HttpStatus.OK);
    }




}
