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
  
  /**
   * Simulazione della gara.
   * @return Un arrayList contenete i nuotatori con i rispettivi tempi
   */
  public ArrayList<NuotatoreGara> startSimulation() {

    ArrayList<NuotatoreGara> partecipanti = new ArrayList<>();
    for (Nuotatore n : nuotatori) {
      partecipanti.add(new NuotatoreGara(n.getNome(), n.getNumero()));
    }

    for (int i = 0; i < lunghezza / LUNGHEZZA_VASCA; i++) {
      for (int j = 0; j < nuotatori.size(); j++) {
        partecipanti.get(j).add(getRandomDuration());
      }
    }
    return partecipanti;
  }

  public Duration getRandomDuration() {
    Random random = new Random();
    return Duration.ofSeconds(random.nextInt(50) + 25);
  }
}
