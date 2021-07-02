package com.Backend.PruebaBack.Services;


import com.Backend.PruebaBack.Model.Asteroids;

import java.io.IOException;
import java.util.List;

public interface IAsteroidsService {
    List<Asteroids> getAsteroides(String Planet) throws IOException, InterruptedException;
}
