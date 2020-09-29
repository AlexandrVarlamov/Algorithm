package sorting;

import java.util.ArrayList;
import java.util.Random;

public class Basic {

    public static boolean less(Double v, Double w) {
        if (v < w) {
            return true;
        } else {
            return false;
        }
    }

    public static void exch(ArrayList a, int i, int j) {
        Object t = a.get(i);
        a.set(i, a.get(j));
        a.set(j, t);
    }

    public static boolean isSorted(ArrayList<Double> a) {
        for (int i = 1; i < a.size(); i++) {
            if (less(a.get(i), a.get(i - 1))) {
                return false;
            }
        }
        return true;
    }

    public static void show(ArrayList a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
    }

    public static ArrayList<Double> generateArray() {
        ArrayList<Double> doubles = new ArrayList<>();
        while (doubles.size() < 10) {
            Random rand = new Random();
            doubles.add(1 + rand.nextDouble() * 9);
        }
        return doubles;
    }
}
