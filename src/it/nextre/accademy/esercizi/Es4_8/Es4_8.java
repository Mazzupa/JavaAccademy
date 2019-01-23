package it.nextre.accademy.esercizi.Es4_8;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Es4_8 {

  public static final int MAX_SCELTE = 8;

  public static void main(String[] args) {

    String[] scelte = new String[MAX_SCELTE];

    for (int i = 0; i < MAX_SCELTE; i++) {
      scelte[i] = "scelta " + (i + 1);
    }

    while (menu(scelte) != 9) {}
  }

  public static int menu(String[] scelte) {

    if (!(scelte != null && scelte.length == MAX_SCELTE)) {
      throw new IllegalArgumentException(
          "Il numero massimo di scelte possibile deve essere inferiore a " + MAX_SCELTE);
    }

    for (int i = 0; i < scelte.length; i++) {
      System.out.println(i + 1 + ") " + scelte[i]);
    }
    System.out.println("9) esci");

    Scanner input = new Scanner(System.in);
    int scelta = 0;
    try {
      scelta = Integer.parseInt(input.nextLine());
    } catch (NumberFormatException e) {
      System.err.println("Inserire solo un numero compreso tra 1 e 8 (9 per uscire)");
      return -1;
    }

    switch (scelta) {
      case 1:
        {
          System.out.println("Hai scelto l'opzione numero: 1");
          return 1;
        }
      case 2:
        {
          System.out.println("Hai scelto l'opzione numero: 2");
          return 2;
        }
      case 3:
        {
          System.out.println("Hai scelto l'opzione numero: 3");
          return 3;
        }
      case 4:
        {
          System.out.println("Hai scelto l'opzione numero: 4");
          return 4;
        }
      case 5:
        {
          System.out.println("Hai scelto l'opzione numero: 5");
          return 5;
        }
      case 6:
        {
          System.out.println("Hai scelto l'opzione numero: 6");
          return 6;
        }
      case 7:
        {
          System.out.println("Hai scelto l'opzione numero: 7");
          return 7;
        }
      case 8:
        {
          System.out.println("Hai scelto l'opzione numero: 8");
          return 8;
        }
      case 9:
        {
          System.out.println("Hai scelto l'opzione numero: 9");
          return 9;
        }
      default:
        {
          System.err.println("Inserire solo un numero compreso tra 1 e 8 (9 per uscire)");
          return -1;
        }
    }
  }
}
