package it.nextre.accademy.esercizi.es4_5;

public class Es4_5 {
    public static void main(String[] args) {

        int[][] matrice = new int[13][10];

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 10; j++) {
                matrice[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
