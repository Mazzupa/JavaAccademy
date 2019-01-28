package it.nextre.accademy.esercizi.es5_5;

import it.nextre.accademy.esercizi.es5_5.enumeration.Giocata;

import java.util.Scanner;

public class Es5_5 {
  public static void main(String[] args) {

    I i = (x)->x;
    System.out.println(i.f(42));
    System.out.println(i.getClass());
  }
}

@FunctionalInterface
interface I<E> {
  E f(E i);
}


class Main {
  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {
      System.out.println(SassoCartaForbice.esito(SassoCartaForbice.gioca(), leggiGiocata("Carta, Sasso o Forbice? (c/s/f)")));
    }
  }
  
  public static Giocata leggiGiocata(String prompt) {
    Scanner input = new Scanner(System.in);
    System.out.println(prompt);
    switch (input.nextLine()) {
      case "s": return Giocata.SASSO;
      case "c": return Giocata.CARTA;
      case "f": return Giocata.FORBICE;
    }
    return null;
  }
  
}