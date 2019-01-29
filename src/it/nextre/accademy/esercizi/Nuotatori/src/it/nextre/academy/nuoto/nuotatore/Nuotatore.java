package it.nextre.academy.nuoto.nuotatore;

import java.util.Random;

public class Nuotatore {
  
  private String nome;
  private int numero;
  
  public Nuotatore(String nome, int numero) {
    this.nome = nome;
    this.numero = numero;
  }
  
  /**
   * Costruttore pubblico con generazione random del numero.
   * @param nome Nome del nuotatore
   */
  public Nuotatore(String nome) {
    this.nome = nome;
    Random random = new Random();
    this.numero = random.nextInt(100);
  }

  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public int getNumero() {
    return numero;
  }
  
  public void setNumero(int numero) {
    this.numero = numero;
  }
  
  @Override
  public String toString() {
    return "Nuotatore{"
            + "nome='" + nome + '\''
            + ", numero=" + numero
            + '}';
  }
}
