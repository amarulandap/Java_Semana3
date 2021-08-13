package com.andres_marulanda.Reto2_Variante1;
//@author Andres Marulanda
 
public class Jugador extends Personaje {
    
    private int numeroBotiquines;
    
    public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }
    
    public void moverDerecha(double d){
       this.setPosicionX(this.getPosicionX() + d);
    }
    
    public void moverIzquierda(double d) {
        this.setPosicionX(this.getPosicionX() - d);
    }
    
    public void moverArriba(double d){
        this.setPosicionY(this.getPosicionY() + d);    
    }
    
    public void moverAbajo(double d){
       this.setPosicionY(this.getPosicionY() - d);
    }
    
    public void recogerBotiquin(){
        this.setNumeroBotiquines(this.getNumeroBotiquines() + 1);
    }
    
    public void usarBotiquin(){
        if (this.getNumeroBotiquines() > 0){
            this.setNumeroBotiquines(this.getNumeroBotiquines() - 1);
            if (this.getVida() + 5 > 100) {
                this.setVida(100);

            } else {
                this.setVida(this.getVida() + 5);
            }
        }
    }

    public void golpear(Enemigo p) {
        super.golpear(p);
        p.evolucionar();
    }
   
    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }
    
    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }
    
    
}
