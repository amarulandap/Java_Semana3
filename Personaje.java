package com.andres_marulanda.Reto2_Variante1;
//@author Andres Marulanda

public class Personaje {

    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    private double damage;
    private double vida = 100;

    public Personaje(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.damage = damage;
    }

    public void golpear(Personaje p) {
        p.recibirImpacto(this.damage / p.calcularDistanciaRespectoPersonaje(this));
    }
  
    public void recibirImpacto(double d) {
        if (this.getVida() - d < 0) {
            this.setVida(0);
        } else {
            this.setVida(this.getVida() - d);
        }
    }

    public double calcularDistanciaRespectoPersonaje(Personaje p) {
        double x = p.getPosicionX() - this.posicionX;
        double y = p.getPosicionY() - this.posicionY;
        double distancia = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));   
        return distancia;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

 
}
