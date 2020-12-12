package sorting.insertion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Task4 {

    public static class VisitorInfo {
        public Date inputTime;
        public Date outputTime;
        public long inclusion;

        public VisitorInfo(Date inputTime, Date outputTime) {
            this.inputTime = inputTime;
            this.outputTime = outputTime;
            this.inclusion = 0;
        }

        public VisitorInfo() {
        }

        @Override
        public String toString() {
            return "VisitorInfo{" +
                    "inputTime='" + inputTime + '\'' +
                    ", outputTime='" + outputTime + '\'' +
                    ", inclusion=" + inclusion +
                    '}';
        }

        public Date getInputTime() {
            return inputTime;
        }

        public Date getOutputTime() {
            return outputTime;
        }
    }

    private static ArrayList<VisitorInfo> createData(String fileName) throws IOException, ParseException {
        ArrayList<VisitorInfo> visitorInfo = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = null;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        while ((line = reader.readLine()) != null) {
            String[] visitTime = line.split(" ");
            visitorInfo.add(new VisitorInfo(sdf.parse(visitTime[0]), sdf.parse(visitTime[1])));
        }

        return visitorInfo;
    }

    public static VisitorInfo maxPeriod(ArrayList<VisitorInfo> info) {
        for(VisitorInfo visitorInfo : info) {
            for (VisitorInfo compareInfo : info) {
                if (visitorInfo.getInputTime().before(compareInfo.getInputTime()) &&
                    visitorInfo.getOutputTime().after(compareInfo.getOutputTime())) {
                    visitorInfo.inclusion++;
                }
            }
        }

        VisitorInfo result = new VisitorInfo();
        for (VisitorInfo visitorInfo : info) {
            if (visitorInfo.inclusion > result.inclusion) {
                result = visitorInfo;
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException, ParseException {
        ArrayList<VisitorInfo> data = createData("Data.txt");
        System.out.println(maxPeriod(data));
    }
}
