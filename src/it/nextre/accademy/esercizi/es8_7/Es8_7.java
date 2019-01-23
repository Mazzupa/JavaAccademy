package it.nextre.accademy.esercizi.es8_7;

import it.nextre.accademy.esercizi.es8_7.gioco.FireShot;

public class Es8_7 {
    public static void main(String[] args) {
      
        FireShot fireShot = new FireShot();

        fireShot.gioca();

        System.out.println("Punteggio: " + fireShot.getPunteggio());

        String s = "-r";
        if(s.equalsIgnoreCase("-r")){
            System.out.println("Hai sparato " + fireShot.getColpiTotali() + " colpi");
            System.out.println("Hai colpito " + fireShot.getNumBarattoli() + " barattoli");
            System.out.println("Percentuale successo: " + fireShot.getNumBarattoli()*100d/ fireShot.getColpiTotali() + "%");

        }

    }
}
