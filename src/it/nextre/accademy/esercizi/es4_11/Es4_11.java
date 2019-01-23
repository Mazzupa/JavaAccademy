package it.nextre.accademy.esercizi.es4_11;

import java.util.StringTokenizer;

public class Es4_11 {
  public static void main(String[] args) {
    String s = "prova di una stringa con più parole";
    System.out.println(s);
    System.out.println(toCamelCase(s));
  }
  
  private static String toCamelCase(String str) {
    if(str == null && str.length() > 0) throw new IllegalArgumentException();
    StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
  
    String string = "";
    while (stringTokenizer.hasMoreTokens()) {
      String tmp = stringTokenizer.nextToken();
      string += tmp.toUpperCase().charAt(0);
      string += tmp.substring(1);
    }
    return string;
  }
}
