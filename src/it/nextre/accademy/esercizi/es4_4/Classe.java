package it.nextre.accademy.esercizi.es4_4;

import it.nextre.accademy.esercizi.es4_3.Lista;

import java.util.Random;

public class Classe {

    public static final int NUM_PERSONE = 10;
    public static final int NUM_SUCCESSI = 5;
    public static final int SUCCESSO = 1;
    public static final int NON_SUCCESSO = -1;

    private Lista[] M = new Lista[NUM_PERSONE];

    private int numTentativi = 0;

    private int[] numTentativiPP = new int[NUM_PERSONE];

    public Classe() {

        for (int i = 0; i < M.length; i++) {
            M[i] = new Lista();
        }
    }

    public void run() {

        Random random = new Random();

        boolean successo;
        int s;
        int numSuccessi = 0;

        for (int i = 0; i < M.length; i++) {
            numSuccessi = 0;
            while (true) {
                s = random.nextInt(100);
                successo = (s < 10) ? true : false;

                if (numSuccessi == NUM_SUCCESSI) break;

                numTentativi++;
                numTentativiPP[i]++;

                if (successo) {
                    numSuccessi++;
                    M[i].add(SUCCESSO);
                } else {

                    M[i].add(NON_SUCCESSO);
                }
            }
        }
    }

    public Lista[] getM() {
        return this.M;
    }

    public int getNumTentativi(){
        return numTentativi;
    }

    public int[] getNumTentativiPP(){
        return this.numTentativiPP;
    }

}
