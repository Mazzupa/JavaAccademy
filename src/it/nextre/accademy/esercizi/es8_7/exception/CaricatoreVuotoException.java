package it.nextre.accademy.esercizi.es8_7.exception;

public class CaricatoreVuotoException extends  Exception{
    public CaricatoreVuotoException(String msg){
        super(msg);
    }
    public CaricatoreVuotoException(){super("CaricatoreVuotoException");}
}
