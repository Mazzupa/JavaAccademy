package it.nextre.accademy.esercizi.es4_3;

public class Main {
    public static void main(String[] args) {

        Lista l = new Lista();

        l.add(5);
        l.add(3);
        l.add(4);
        l.add(8);

        System.out.println(l);

        while(l.size()>0){
            l.remove(0);
            System.out.println(l);
        }

    }
}
