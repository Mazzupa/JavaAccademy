package it.nextre.accademy.esercizi.es8_7.gioco;

public class Barattolo {

    private int punteggio;
    private boolean valido;

    public Barattolo(int punteggio) {
        this.punteggio = punteggio;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public boolean isValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }
}
