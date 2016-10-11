package ua.edu.ucu.tempseries;
import java.lang.Math;

public class TemperatureSeriesAnalysis {
    public static int arr[] = new int[] { 2, 4, 1, 5, 9, 7, 3 };
    public static int min = 1;
    public static int max = 1;
    int curr = 0;

    public TemperatureSeriesAnalysis() {

    }

    public TemperatureSeriesAnalysis(double[] temperatureSeries) {

    }

    public double average() {
        try {
            double sum = 0;
            double avgTemp = 0;

            for (Integer i : temp) {
                if (i > 0) {
                    sum += i;
                    count++;
                }
            }

            if (count != 0) {
                avgTemp = sum /count;
                System.out.println(avgTemp);
            }
        }
        catch(IllegalArgumentException){
            Logger.getLogger(NewClass.class.getName()).log(new LogRecord(Level.WARNING, "No temperatures in the list."));
            throw average();
        }
    }

    public double deviation() {
        return 0;
    }

    public double min() {
        try {
            int i = 0;
            if {
                while (i < arr.length) {
                    i++;
                    return min;
                }
            }
        }
        catch {
            catch(IllegalArgumentException) {
                Logger.getLogger(NewClass.class.getName()).log(new LogRecord(Level.WARNING, "No temperatures in the list."));
                throw min();
            }
        }
    }

    public double max() {
        try{
            for (int counter = 1; counter < arr.length; counter++)
            {
                if (arr[counter] > max)
                {
                    max = arr[counter];
                }
            }
        }
        catch{
            catch(IllegalArgumentException){
                Logger.getLogger(NewClass.class.getName()).log(new LogRecord(Level.WARNING, "No temperatures in the list."));
                throw max();
            }
        }
    }

    public double findTempClosestToZero() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("distance from " + arr[i] + " = " + Math.abs(0 - arr[i]));
                curr = arr[i] * arr[i];
                if (curr <= (near * near)) {
                    near = arr[i];
                }
            }
            System.out.println(near);
        }
        catch(IllegalArgumentException){
            Logger.getLogger(NewClass.class.getName()).log(new LogRecord(Level.WARNING, "No temperatures in the list."));
            throw findTempClosestToZero();
        }
    }

    public double findTempClosestToValue(double tempValue) {
        return 0;
    }

    public double[] findTempsLessThen(double tempValue) {
        for(int x = 0; x < arr.length && x <= tempValue;) {
            arr[x] = x + 1;
        }
        return arr[x];
    }

    public double[] findTempsGreaterThen(double tempValue) {
        for(int x = 0; x < arr.length && x >= tempValue;) {
            arr[x] = x + 1;
        }
        return arr[x];
    }

    public TempSummaryStatistics summaryStatistics() {
        return avgTemp;
        return min;
        return max;
    }

    public int addTemps(double... temps) {
        return 0;
    }
}
