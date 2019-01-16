package it.nextre.accademy.esercizi.es4_3;

import java.util.Arrays;

public class Lista {

    private int[] buffer = new int[0];

    private void buildNew() {
        int[] newArrayN = new int[buffer.length + 1];

        for (int i = 0; i < buffer.length; i++) {
            newArrayN[i] = buffer[i];
        }
        this.buffer = newArrayN;
    }

    public void add(int n) {
        buildNew();
        buffer[buffer.length - 1] = n;
    }

    public int get(int pos) {
        if (pos > 0 && pos < buffer.length)
            return buffer[pos];

        throw new RuntimeException("Index out of bound");
    }

    public int[] getAll(){
        return this.buffer;
    }

    public void remove(int pos) {
        if (!(pos >= 0 && pos < buffer.length))
            throw new RuntimeException("Index out of bound");
        int[] swap = new int[this.buffer.length - 1];

        for (int i = 0; i < this.buffer.length; i++) {
            if (i < pos) {
                swap[i] = this.buffer[i];
            } else if (i == pos) continue;
            else {
                swap[i - 1] = this.buffer[i];
            }
        }
        this.buffer = swap;
    }

    public int size() {
        return this.buffer.length;
    }

    @Override
    public String toString() {
        return "Lista{"+ Arrays.toString(buffer) +
                '}';
    }
}
