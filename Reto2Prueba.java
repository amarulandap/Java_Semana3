package com.andres_marulanda.Reto2_Variante1;
//@author Andres Marulanda 

public class Reto2Prueba {

    public static void main(String[] args) {        
//1
        Jugador j = new Jugador ("Explorador", 'm', 0, 5, 100);
        Enemigo e = new Enemigo ("Virico", 'f', 0, 0, 80);
//2        
        j.golpear(e);
        j.golpear(e);
        j.moverDerecha(10);
        j.moverAbajo(5);
//3        
        e.golpear(j);
        e.golpear(j);
        j.recogerBotiquin();
//4        
        j.usarBotiquin();
        j.usarBotiquin();
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
//5        
       e.golpear(j);
       e.golpear(j);
//6        
        j.golpear(e);
        j.golpear(e);
//7
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        
        System.out.println("Nombre jugador: "+ j.getNombre());
        System.out.println("Nombre enemigo: "+ e.getNombre());
        
        System.out.println("");
        System.out.println("Sexo jugador: "+ j.getSexo());
        System.out.println("Sexo enemigo: "+ e.getSexo());
        
        System.out.println("");
        System.out.println("Posición X jugador: "+ j.getPosicionX());
        System.out.println("Posicion X enemigo: "+ e.getPosicionX());
        
        System.out.println("");
        System.out.println("Posición Y jugador: "+ j.getPosicionY());
        System.out.println("Posicion Y enemigo: "+ e.getPosicionY());
        
        System.out.println("");
        System.out.println("Damage jugador: "+ j.getDamage());
        System.out.println("damage enemigo: "+ e.getDamage());
        
        System.out.println("");
        System.out.println("Vida jugador: "+ j.getVida());
        System.out.println("Vida enemigo: "+ e.getVida());
        
        System.out.println("");
        System.out.println("Botiquines jugador: "+ j.getNumeroBotiquines());
        System.out.println("Evoluciones aplicadas enemigo: "+ e.getEvolucionesAplicadas());
        
        System.out.println("");
        System.out.println("Resistencia enemigo: "+ e.getResistencia());
    }
 
}
