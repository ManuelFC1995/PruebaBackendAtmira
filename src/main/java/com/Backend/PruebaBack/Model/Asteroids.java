package com.Backend.PruebaBack.Model;

public class Asteroids implements Comparable<Asteroids> {
    private String nombre;
    private double diametro;
    private String velocidad;
    private String fecha;
    private String planeta;

    public Asteroids(String nombre, double diametro, String velocidad, String fecha, String planeta) {
        this.nombre = nombre;
        this.diametro = diametro;
        this.velocidad = velocidad;
        this.fecha = fecha;
        this.planeta = planeta;
    }

    public Asteroids() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return "Asteroide{" + "nombre=" + nombre + ", diametro=" + diametro + ", velocidad=" + velocidad + ", fecha=" + fecha + ", planeta=" + planeta + '}';
    }

    @Override
    public int compareTo(Asteroids o) {
        int result=0;
        if(this.diametro-o.getDiametro()==0){
            result= 0;
        }
       else if(this.diametro-o.getDiametro()<0){
            result= 1;
        }
        else if(this.diametro-o.getDiametro()>0){
            result= -1;
        }

        return result;
    }
}

