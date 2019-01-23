package it.nextre.accademy.esercizi.es5_2;

public class CifraturaDiCesare implements Cryptable{
  
  private static final int NUM_LETTERE = 26;
  
  private final int shift;
  private final static char[] alphabet = new char[NUM_LETTERE];
  private final static char[] alphabetShifted = new char[NUM_LETTERE];
  
  
  public CifraturaDiCesare(int shift){
    this.shift = (shift - 1) % NUM_LETTERE;
    init();
  }
  
  private void init(){
    char lettera = 'A';
    for (int i = 0; i < NUM_LETTERE; i++) {
      alphabet[i] = lettera;
      lettera++;
    }
    lettera = 'A';
    for (int i = 0; i < NUM_LETTERE; i++) {
      alphabetShifted[i] = (char)(lettera + this.shift);
      lettera++;
      if((lettera + this.shift) == (char)('Z' + 1))
        lettera = (char)('A' - this.shift);
    }
  }
  
  @Override
  public String crypt(String plain) {
    
    String cipher = "";
    
    for(int i = 0; i < plain.length(); i++) {
      boolean simbolo = true;
      for(int j = 0; j < alphabet.length; j++) {
        if (plain.charAt(i) == ' ') {
          cipher += " ";
          simbolo = false;
          break;
          }

        if (plain.charAt(i) == alphabet[j]) {
            cipher += alphabetShifted[j];
            simbolo = false;
            break;
          }
      }
      if(simbolo)
        cipher += plain.charAt(i);
    }
    
    return cipher;
  }
  
  @Override
  public String decrypt(String cipher) {
    String plain = "";
  
    for(int i = 0; i < cipher.length(); i++) {
      boolean simbolo = true;
      for(int j = 0; j < alphabet.length; j++) {
        if (cipher.charAt(i) == ' ') {
          plain += " ";
          simbolo = false;
          break;
        }
      
        if (cipher.charAt(i) == alphabetShifted[j]) {
          plain += alphabet[j];
          simbolo = false;
          break;
        }
      }
      if(simbolo)
        plain += cipher.charAt(i);
    }
  
    return plain;
  }
}
