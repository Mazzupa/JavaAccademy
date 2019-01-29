package it.nextre.academy.nuoto.nuotatore;

import java.time.Duration;
import java.util.ArrayList;

public class NuotatoreGara extends Nuotatore implements Comparable<NuotatoreGara> {
  
  ArrayList<Duration> tempi = new ArrayList<>();
  
  public NuotatoreGara(String nome, int numero) {
    super(nome, numero);
  }
  
  /**
   * Aggiunge un tempo parziale all'elemnco dei tempi per vasca.
   * @param d Il tempo parziale
   */
  public void add(Duration d) {
    tempi.add(d);
  }
  
  public ArrayList<Duration> getTempi() {
    return this.tempi;
  }
  
  /**
   * Restituisce il tempo totale che ha impegato per tereminare la competizione,
   * somma tutti i tempi parziali.
   * @return la somma di tutti i tempi parziali
   */
  public Duration getTempoTot() {
    Duration r = Duration.ZERO;
    for (Duration d : tempi) {
      r = r.plus(d);
    }
    return r;
  }
  
  @Override
  public int compareTo(NuotatoreGara o) {
    return this.getTempoTot().compareTo(o.getTempoTot());
  }
}
