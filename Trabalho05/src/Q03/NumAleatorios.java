package Q03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class NumAleatorios {
    public static void main(String[] args){
        ArrayList<Integer> arrayDeCinquenta = new ArrayList<Integer>();

        Random ramdom = new Random();
        int i = 1;
        for (i = 0; i < 50; i++) {
            int alaatorios = ramdom.nextInt(99);
            arrayDeCinquenta.add(alaatorios);
        }

        for (i = 0; i < 50; i++) {
            System.out.print(arrayDeCinquenta.get(i) + ",");
        }

        if(true){
            System.out.println("\nMenor numero: " + Collections.min(arrayDeCinquenta) +
                    "\nMaior numero: " +  Collections.max(arrayDeCinquenta) +
                    "\nO menor numero apareceu:  " + Collections.frequency(arrayDeCinquenta, Collections.min(arrayDeCinquenta))
            );
            Collections.sort(arrayDeCinquenta);
            System.out.println("Ordem organizada dos numeros: " + arrayDeCinquenta);
        }



    }
}
