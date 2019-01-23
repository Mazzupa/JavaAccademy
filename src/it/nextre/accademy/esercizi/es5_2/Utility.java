package it.nextre.accademy.esercizi.es5_2;

import java.util.Scanner;

public class Utility {
  
  public static int leggiInt(String prompt) {
    Scanner input = new Scanner(System.in);

    System.out.println(prompt);
    return Integer.parseInt(input.nextLine());
  }
  
  public static String leggiString(String prompt) {
    Scanner input = new Scanner(System.in);
    
    System.out.println(prompt);
    return input.nextLine();
  }
}
