package it.nextre.accademy.esercizi.es8_7.gioco;

import it.nextre.accademy.esercizi.es8_7.exception.CaricatoreVuotoException;
import it.nextre.accademy.esercizi.es8_7.exception.CaricatoriFinitiException;
import it.nextre.accademy.esercizi.es8_7.exception.FucileInceppatoException;

import java.util.ArrayList;
import java.util.Random;

public class FireShot {

    private Fucile fucile;

    private int colpiTotali = 0;
    private int numBarattoli = 0;
    private int punteggio = 0;

    ArrayList<Barattolo> barattoli = new ArrayList<>();

    public FireShot(){

        Caricatore[] caricatori = new Caricatore[Config.NUM_CARICATORI];

        for (int i = 0; i < Config.NUM_CARICATORI ; i++) {
            caricatori[i] = new Caricatore(Config.NUM_COLPI_PER_CARICATORE);
        }

        Random random = new Random();
        for(int i = 0; i < Config.NUM_COLPI_PER_CARICATORE*Config.NUM_CARICATORI; i++){
            barattoli.add(new Barattolo(5*(1 + random.nextInt(5))));
        }

        fucile = new Fucile(caricatori);

    }

    public void gioca(){

        Random random = new Random();
        while(true){
            this.colpiTotali++;
            try {
                System.out.println("Spara un colpo");
                fucile.spara();
            }catch (CaricatoreVuotoException e0){
                try {
                    System.out.println("Ricarica");
                    fucile.ricarica();
                }catch (CaricatoriFinitiException e1){
                    System.out.println("Hai finito i colpi");
                    return;
                }
            }catch (FucileInceppatoException e2){
                System.out.println("Fucile inceppato");
                continue;
            }
            boolean colpito = random.nextInt(100) < 25;
            if(colpito) {
                System.out.println("Hai colpito il barattolo");
                numBarattoli++;
                punteggio += Config.PUNTEGGI[random.nextInt(Config.PUNTEGGI.length)];
            }else System.out.println("Non colpito");
        }
    }

    public String getPunteggio(){
        if(punteggio < 20){
            return punteggio + ": scarso";
        }else if(punteggio < 50){
            return punteggio + ": Accettabile";
        }else if(punteggio < 75){
            return punteggio + ": buono";
        }else if (punteggio < 100) {
            return punteggio + ": ottimo";
        }else
            return punteggio + ": Cecchino";
    }

    public int getColpiTotali() {
        return colpiTotali;
    }

    public int getNumBarattoli() {
        return numBarattoli;
    }
}
