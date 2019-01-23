package it.nextre.accademy.esercizi.es4_17;

public class Es4_17 {
    public static void main(String[] args) {

        int[] array = ArrayRandomGenerator.getRandomArray(500);

        System.out.println("Il massimo è: " + Utility.getMax(array) + " che si trova in posizione: " + Utility.getPos(array, Utility.getMax(array)));

    }
}
