package it.nextre.academy.nuoto.nuotatore;

import java.time.Duration;
import java.util.ArrayList;

public class NuotatoreGara extends Nuotatore implements Comparable<NuotatoreGara>{
  
  ArrayList<Duration> tempi = new ArrayList<>();
  
  public NuotatoreGara(String nome){
    super(nome);
  }
  public NuotatoreGara(String nome, int numero) {
    super(nome, numero);
  }
  
  public void add(Duration d){
    tempi.add(d);
  }
  
  public ArrayList<Duration> getTempi(){
    return this.tempi;
  }
  
  public Duration getTempoTot() {
    Duration r = Duration.ZERO;
    for(Duration d : tempi) {
      r = r.plus(d);
    }
    return r;
  }
  
  @Override
  public int compareTo(NuotatoreGara o) {
    return this.getTempoTot().compareTo(o.getTempoTot());
  }
}
