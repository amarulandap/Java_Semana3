package com.andres_marulanda.Reto2_Variante1;
// @author Andres Marulanda
 
public class Enemigo extends Personaje{
    
    private int evolucionesAplicadas;
    private int resistencia = 1;

    public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }
    
    public void evolucionar(){
        if (this.getVida() <= 30 && this.evolucionesAplicadas == 0){
            this.setDamage(this.getDamage() + 20);
            this.setEvolucionesAplicadas(this.getEvolucionesAplicadas() + 1);
        }
        
        if (this.getVida() <= 10 && this.evolucionesAplicadas == 1){
            this.resistencia++;
            this.evolucionesAplicadas++;
        }
    }
    
    public void recibirImpacto(double d) {
        if (this.getVida() - d / this.resistencia < 0) {
            this.setVida(0);
        } else {
            this.setVida(this.getVida() - d / this.resistencia);
        }
    }
   
    public int getEvolucionesAplicadas() {
        return evolucionesAplicadas;
    }

    public void setEvolucionesAplicadas(int evolucionesAplicadas) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    
     
}
