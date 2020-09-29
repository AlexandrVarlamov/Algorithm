package sorting.insertion;

import sorting.Basic;

import java.util.ArrayList;

public class Insertion extends Basic {

    public static void sort(ArrayList<Double> a) {
        int N = a.size();
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0 && less(a.get(j), a.get(j - 1)); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    public static void sortMark(ArrayList<Double> a) {
        int N = a.size();
        int exchanges = 0;

        for (int i = N -1; i > 0; i--) {
            if (less(a.get(i), a.get(i - 1))) {
                exch(a, i, i - 1);
                exchanges++;
            }
        }

        if (exchanges == 0) return;

        for (int i = 2; i < N; i++) {
            Double v = a.get(i);
            int j = i;
            while (less(v, a.get(j - 1))) {
                a.set(j, a.get(j - 1));
                j--;
            }
            a.set(j, v);
        }
    }

    public static void main(String[] args) {
        sortMark(generateArray());
    }
}
