package it.nextre.accademy.esercizi.es8_7.gioco;

import it.nextre.accademy.esercizi.es8_7.exception.CaricatoreVuotoException;
import it.nextre.accademy.esercizi.es8_7.exception.CaricatoriFinitiException;
import it.nextre.accademy.esercizi.es8_7.exception.FucileInceppatoException;

import java.util.Random;

public class Fucile {

    private Caricatore[] caricatori;
    private int caricatore = 0;

    public Fucile(Caricatore[] caricatori){
        this.caricatori = caricatori;
    }

    public void spara() throws CaricatoreVuotoException, FucileInceppatoException {
        if (caricatori[caricatore].getNumColpi() == 0) {
            throw new CaricatoreVuotoException();
        }

        caricatori[caricatore].setNumColpi(caricatori[caricatore].getNumColpi() - 1);

        Random random = new Random();
        if(random.nextInt(100) < Config.NUM_COLPI_PER_CARICATORE) throw new FucileInceppatoException();
    }

    public void ricarica() throws CaricatoriFinitiException {
        if(caricatore == Config.NUM_CARICATORI - 1){
            throw new CaricatoriFinitiException();
        }
        caricatore++;
    }
}
