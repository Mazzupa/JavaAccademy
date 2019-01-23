package it.nextre.accademy.esercizi.es4_17;

import java.util.Random;

public class ArrayRandomGenerator {


    public static int[] getRandomArray(int size){
        int[] r = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            r[i] = random.nextInt(Utility.BOUND);
        }

        return r;
    }
}
