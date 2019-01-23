package it.nextre.accademy.esercizi.es4_7;

import java.util.Random;

public class Es4_7 {
  public static void main(String[] args) {
    
    int[] array = new int[50];
    array = getRandomArray(array, 0, 100);
    for (int i: array) {
      System.out.print(i + " ");
    }
    System.out.println();
    
    bubbleSort(array);
    for (int i: array) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
  
  public static int[] getRandomArray(int[] array, int min, int max){
    for (int i = 0; i < array.length; i++) {
      array[i] = getRandomValore(min, max);
    }
    return array;
  }
  
  public static int getRandomValore(int min, int max){
    Random random = new Random();
    return random.nextInt((min < 0 ? 1 + max : max) - min) + min;
  }
  
  public static void bubbleSort(int[] array){
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length -1; j++) {
        if(array[j] > array[j+1]){
          int tmp = array[j];
          array[j] = array[j+1];
          array[j +1] = tmp;
        }
      }
    }
  }
}
