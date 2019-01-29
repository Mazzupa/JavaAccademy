package it.nextre.academy.nuoto;

import it.nextre.academy.nuoto.nuotatore.Nuotatore;
import it.nextre.academy.nuoto.nuotatore.NuotatoreGara;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Random;

public class Piscina {

  private static final int LUNGHEZZA_VASCA = 50;

  private final ArrayList<Nuotatore> nuotatori;
  private final int lunghezza;

  public Piscina(ArrayList<Nuotatore> nuotatori, int lunghezza) {
    this.nuotatori = nuotatori;
    this.lunghezza = lunghezza;
  }

  public ArrayList<NuotatoreGara> simula() {

    ArrayList<NuotatoreGara> partecipanti = new ArrayList<>();
    for(Nuotatore n : nuotatori) {
      partecipanti.add(new NuotatoreGara(n.getNome(), n.getNumero()));
    }

    for (int i = 0; i < lunghezza/LUNGHEZZA_VASCA; i++) {
      for (int j = 0; j < nuotatori.size(); j++) {
        Duration d = getRandomDuration();

        System.out.println("Il " + nuotatori.get(j) + "Ha fatto la vasca numero " + i + "in " + d.getSeconds() + " Secondi");

        partecipanti.get(j).add(d);
      }
      System.out.println("_______________________");
    }
    
    return partecipanti;
  }

  public Duration getRandomDuration() {
    Duration duration = Duration.ZERO;
    Random random = new Random();
    return duration.plus(Duration.ofSeconds(random.nextInt(10)+15));
  }
}
