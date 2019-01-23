package it.nextre.accademy.esercizi.es4_6;

import java.util.Comparator;
import java.util.Random;

public class Es4_6 {
  public static void main(String[] args) {
    
    int[][] matrice1 = GeneratoreaMatrici.getRandomMatrice(3, 3, 0, 10);
    int[][] matrice2 = GeneratoreaMatrici.getRandomMatrice(3, 3, 0, 10);
    
    GeneratoreaMatrici.stampa(matrice1);
    System.out.println("##################################");
    GeneratoreaMatrici.stampa(matrice2);
    
    int[][] risultato = GeneratoreaMatrici.compara(matrice1, matrice2);
    
    System.out.println("##################################");
    GeneratoreaMatrici.stampa(risultato);
    
  }
}

class GeneratoreaMatrici implements Comparator<Integer> {
  public static int[][] getRandomMatrice(int righe, int colonne, int valMin, int valMax) {
    int[][] matrice = new int[righe][colonne];
    Random random = new Random();
    
    for (int i = 0; i < colonne; i++) {
      for (int j = 0; j < righe; j++) {
        matrice[i][j] = getNumRandom(valMin, valMax);
      }
    }
    return matrice;
  }
  
  public static int getNumRandom(int min, int max){
    Random random = new Random();
    return random.nextInt((min < 0 ? 1 + max : max) - min) + min;
  }
  
  public static void stampa(int[][] matrice){
    for (int i = 0; i < matrice.length; i++) {
      for (int j = 0; j < matrice[i].length; j++) {
        System.out.print(matrice[i][j] + "\t");
      }
      System.out.println();
    }
  }
  
  public static int[][] compara(int[][] matrice1, int[][] matrice2){
    int[][] r = new int[matrice1.length][matrice1[0].length];
    for (int i = 0; i < matrice1.length; i++) {
      for (int j = 0; j < matrice1[i].length; j++) {
        r[i][j] = (matrice1[i][j] < matrice2[i][j]) ? -1 : ((matrice1[i][j] > matrice2[i][j]) ? 1 : 0);
      }
    }
    return r;
  }
  
  @Override
  public int compare(final Integer o1, final Integer o2) {
    return o1 - o2;
  }
}



