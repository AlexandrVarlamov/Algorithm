package sorting.insertion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Task3 {
    private static ArrayList<String> readFile(String fileName) throws IOException {
        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String str = "";
        while ((str = reader.readLine()) != null) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }

        return list;
    }

    private static ArrayList<Double> convertList(ArrayList<String> list) {
        ArrayList<Double> newList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            newList.add(Double.parseDouble(list.get(i)));
        }

        return newList;
    }

    public static Double maxVisitors(ArrayList<Double> ... arrayLists) {
        Double temp = 0.0;
        Double maxVisitors = 0.0;

        for(ArrayList<Double> info : arrayLists) {
            for (int i = 0; i < info.size(); i++) {
                temp += info.get(i);
            }

            if (temp > maxVisitors) {
                maxVisitors = temp;
            }

            temp = 0.0;
        }

        System.out.println(maxVisitors);
        return maxVisitors;
    }

    public static void main(String[] args) throws IOException {

        ArrayList<Double> queue1 = convertList(readFile("Cash1.txt"));
        ArrayList<Double> queue2 = convertList(readFile("Cash2.txt"));
        ArrayList<Double> queue3 = convertList(readFile("Cash3.txt"));
        ArrayList<Double> queue4 = convertList(readFile("Cash4.txt"));
        ArrayList<Double> queue5 = convertList(readFile("Cash5.txt"));

        maxVisitors(queue1, queue2, queue3, queue4, queue5);
    }
}