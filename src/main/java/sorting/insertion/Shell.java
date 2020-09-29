package sorting.insertion;

import sorting.Basic;

import java.util.*;

public class Shell extends Basic {

    public static ArrayList<Double> shellSort(ArrayList<Double> a) {
        int N = a.size();
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a.get(j), a.get(j - h)); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }

        return a;
    }

    public static ArrayList<Double> shellSortWithArray(ArrayList<Double> a) {
        int N = a.size();
        int h = 1;
        List<Integer> steps = new ArrayList<>();
        while (h < N / 3) {
            h = 3 * h + 1;
            steps.add(h);
        }

        for (int step = steps.size(); step > 0; step--) {
            for (int i = step; i < N; i++) {
                for (int j = i; j >= step && less(a.get(j), a.get(j - step)); j -= step) {
                    exch(a, j, j - step);
                }
            }
        }

        return a;
    }

    public static boolean check(ArrayList<Double> arrayList) {
        ArrayList<Double> unsorted = new ArrayList();
        for (Double iterator : arrayList) {
            unsorted.add(iterator);
        }
        shellSort(arrayList);

        if (isSorted(arrayList)) {
            arrayList.removeAll(unsorted);
            if (arrayList.isEmpty()) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Double> doubles = generateArray();

        show(shellSortWithArray(doubles));
        System.out.println(check(doubles));
    }
}
