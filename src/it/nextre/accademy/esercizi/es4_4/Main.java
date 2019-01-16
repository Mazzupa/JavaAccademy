package it.nextre.accademy.esercizi.es4_4;

import it.nextre.accademy.esercizi.es4_3.Lista;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Classe c = new Classe();

        c.run();

        Lista[] l = c.getM();

        for(Lista i : l)
            System.out.println(i);

        System.out.println("Media tenativi: " + (double)c.getNumTentativi()/Classe.NUM_PERSONE);

        System.out.println(Arrays.toString(c.getNumTentativiPP()));
    }
}
