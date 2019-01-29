package it.nextre.academy.nuoto;

import it.nextre.academy.nuoto.nuotatore.Nuotatore;
import it.nextre.academy.nuoto.nuotatore.NuotatoreGara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nuoto {
  
  /**
   * Main method.
   * @param args non richiesti
   */
  public static void main(String[] args) {
    
    ArrayList<Nuotatore> partecipanti = new ArrayList<>();
    
    int n = input("Inserisci il numero di nuotatori: ");
    for (int i = 0; i < n; i++) {
      partecipanti.add(new Nuotatore("nome" + (i + 1)));
    }
  
    Piscina piscina = new Piscina(partecipanti, 1000);
    ArrayList<NuotatoreGara> nuotatori = piscina.startSimulation();
    
    System.out.println();
    Collections.sort(nuotatori);
    System.out.println("\t#########################################");
    System.out.println("\t###############CLASSIFICA################");
    System.out.println("\t#########################################");
    for (int i = 0; i < nuotatori.size(); i++) {
      System.out.print("\tPosizione numero " + (i + 1) + ":");
      System.out.print("\t" + nuotatori.get(i).getNome() + " \t ");
      System.out.printf("\t%.2f", nuotatori.get(i).getTempoTot().getSeconds() / 60d);
      System.out.println(" minuti");
    }
  }
  
  /**
   * Legge dalla tastiera un intero.
   * @param prompt Richiesta da stampare
   * @return Il numero intero letto
   */
  public static int input(String prompt) {
    Scanner input = new Scanner(System.in);
    System.out.println(prompt);
    return Integer.parseInt(input.nextLine());
  }
}
