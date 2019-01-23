package it.nextre.accademy.esercizi.es4_17;

public class Utility {

    public static final int BOUND = 10000;

    public static int getMax(int[] array){

        int max = Integer.MIN_VALUE;

        for(int i : array){
            if(i > max)
                max = i;
        }
        return max;
    }

    public static int getPos(int[] array, int elem){
        for(int i = 0; i < array.length; i++){
            if(array[i] == elem)
                return i;
        }
        return -1;
    }
}
