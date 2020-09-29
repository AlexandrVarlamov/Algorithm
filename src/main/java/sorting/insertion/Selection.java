package sorting.insertion;

import sorting.Basic;

import java.util.ArrayList;
import java.util.Collections;

public class Selection extends Basic {
    public static void sort(ArrayList<Double> a) {
        int N = a.size();
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a.get(j), a.get(min))) {
                    min = j;
                }
            }
            exch(a, i, min);
            System.out.print("\033[H\033[2J");
            System.out.flush();
            showIt(a);
        }
    }

    public static void showIt(ArrayList<Double> a) {
        int N = a.size();
        double maxElement = Collections.max(a);
        for (int j = 0; j < N; j++) {
            StringBuilder string = new StringBuilder("");
            for (Double item : a) {
                if (item < maxElement - j) {
                    string.append(" ");
                } else {
                    string.append("*");
                }
            }
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        sort(generateArray());
    }
}
