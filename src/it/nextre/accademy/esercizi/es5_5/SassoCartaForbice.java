package it.nextre.accademy.esercizi.es5_5;

import it.nextre.accademy.esercizi.es5_5.enumeration.Esito;
import it.nextre.accademy.esercizi.es5_5.enumeration.Giocata;

import java.util.Random;

public class SassoCartaForbice {
  
  public static Giocata gioca() {
  
    Random random = new Random();
    int r = random.nextInt(3);
    
    Giocata g = null;
    if(r == 0) g = Giocata.SASSO;
    if(r == 1) g = Giocata.CARTA;
    if(r == 2) g = Giocata.FORBICE;
    System.out.println(g);
    return g;
  }
  
  public static Esito esito(Giocata computer, Giocata giocatore){
    if(computer.equals(giocatore)) return Esito.PAREGGIO;
    
    if(computer.equals(Giocata.CARTA) && giocatore.equals(Giocata.SASSO)) return Esito.SCONFITTA;
    if(computer.equals(Giocata.SASSO) && giocatore.equals(Giocata.FORBICE)) return Esito.SCONFITTA;
    if(computer.equals(Giocata.FORBICE) && giocatore.equals(Giocata.CARTA)) return Esito.SCONFITTA;
    
    return Esito.VITTORIA;
  }
}
