package it.nextre.accademy.esercizi.es4_3;

/**
 * todo
 */

/*public class Utility {

    public void stampaStringhe() {
        for (String s : stringhe)
            System.out.print(s + " ");
        System.out.println();
    }

    public static boolean isVocale(char a) {
        char tmp = Character.toLowerCase(a);
        switch (a) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    public void stampaStringheSenzaVocali() {
        for (String s : stringhe) {
            for (int i = 0; i < s.length(); i++) {
                if (!isVocale(s.charAt(i)))
                    System.out.print(s.charAt(i));
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    public void stampaTuttoInvertito() {
        for (int i = size - 1; i >= 0; i--) {
            for (int j = stringhe[i].length() - 1; j >= 0; j--) {
                System.out.print(stringhe[i].charAt(j));
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    public String listaStringheCSV() {
        String r = "";

        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                r += this.stringhe[i];
            } else {
                r += this.stringhe[i] + ", ";
            }
        }
        return r + ".";
    }

    public void stampaNumeri() {
        for (int i : numeri)
            System.out.print(i + " ");
        System.out.println();
    }

    public void stampaNumeriReverse() {
        for (int i = size - 1; i >= 0; i--)
            System.out.print(numeri[i] + " ");
        System.out.println();
    }

    public void sequenzaFibonacci(int n) {
        for (int i = 0; i < n; i++) {
            aggiungi(fibonacci(i));
        }
    }

    public int fibonacci(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int sommaSerieFib(int n) {
        int somma = 0;

        for (int i = 0; i < n; i++) {
            somma += fibonacci(i);
        }
        return somma;
    }

    public double getMedia() {
        double somma = 0;

        for (int i : this.numeri) {
            somma += i;
        }

        return somma / size;
    }

    public int getSommaPari() {
        int somma = 0;

        for (int i : this.numeri) {
            if (i % 2 == 0)
                somma += i;
        }
        return somma;
    }

    public int getSommaDispari() {
        int somma = 0;

        for (int i : this.numeri) {
            if (i % 2 != 0)
                somma += i;
        }
        return somma;
    }

}*/
