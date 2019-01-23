package it.nextre.accademy.esercizi.es5_2;

public class Es5_2 {
  public static void main(String[] args) {
    
    CifraturaDiCesare cc = new CifraturaDiCesare(Utility.leggiInt("Inserisci lo shifting: "));

    System.out.println(cc.crypt(Utility.leggiString("Inserisci la stringa da cifrare: ")));
    System.out.println(cc.decrypt(Utility.leggiString("Inserisci la stringa da decifrare: ")));
  
  }
  
  
}

