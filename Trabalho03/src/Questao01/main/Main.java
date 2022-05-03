package Questao01.main;

import Questao01.animais.*;

public class Main {
    public static void main(String[] args) {
        Peixe peixe = new Peixe("Tilapia");
        peixe.setPeso(3.2);
        //Tilapia habita águas lênticas de lagoas e represas. É adaptável à água salgada.
        peixe.setTipoHabitat("Adaptavel a agua salgada");
        System.out.println(peixe.toString());

        Cachorro cachorro = new Cachorro("Nina");
        cachorro.setPeso(7.5);
        cachorro.setRaca("Poodle");
        System.out.println(cachorro.toString());
    }
}
