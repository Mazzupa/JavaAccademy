package it.nextre.academy.nuoto;

import it.nextre.academy.nuoto.nuotatore.Nuotatore;
import it.nextre.academy.nuoto.nuotatore.NuotatoreGara;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Nuoto {
  public static void main(String[] args) {
  
  
    ArrayList<Nuotatore> partecipanti = new ArrayList<>();
    
    int n = input("Inserisci il numero di nuotatori: ");
    for (int i = 0; i < n; i++) {
      partecipanti.add(new Nuotatore("nome" + (i+1)));
    }
  
    Piscina piscina = new Piscina(partecipanti, 1000);
    ArrayList<NuotatoreGara> nuotatori = piscina.simula();

    System.out.println(nuotatori);
    
    
    for(NuotatoreGara ng : nuotatori) {
      System.out.println(ng.getTempoTot().getSeconds() / 60d);
    }
  }
  
  public static int input(String prompt) {
    Scanner input = new Scanner(System.in);
    System.out.println(prompt);
    return Integer.parseInt(input.nextLine());
  }
}
