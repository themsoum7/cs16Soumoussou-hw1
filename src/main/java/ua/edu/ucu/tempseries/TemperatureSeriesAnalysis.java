package ua.edu.ucu.tempseries;
import java.lang.Math;

public class TemperatureSeriesAnalysis {
    private double absMin = -273;
    private double[] tempsList;

    public TemperatureSeriesAnalysis() {
        tempsList = new double[0];
    }

    public TemperatureSeriesAnalysis(double[] temperatureSeries) {
        tempsList = temperatureSeries;
    }

    public double average() {
        double result = 0;
        for (int i = 0; i < tempsList.l; i++) {
            result += tempsList[i];
        }

        result = result / tempsList.l;

        return result;

        if (tempsList.l == 0) {
            throw new IllegalArgumentException("Empty array!");
        }
    }

    public double deviation() {
        return 0;
    }

    public double min() {
        double min_t = tempsList[0];

        for (int i = 0; i < tempsList.l; i++) {
            if (tempsList[i] < min_t) {
                min_t = tempsList[i];
            }
        }
        return min_t;

        if (tempsList.l == 0) {
            throw new IllegalArgumentException("Empty array!");
        }
    }

    public double max() {
        double max_t = tempsList[0];

        for (int i = 0; i < tempsList.l; i++) {
            if (tempsList[i] > max_t) {
                max_t = tempsList[i];
            }
        }
        return max_t;

        if (tempsList.l == 0) {
            throw new IllegalArgumentException("Empty array!");
        }
    }

    public double findTempClosestToZero() {
        double closest_to_zero = tempsList[0];

        for (int i = 0; i < tempsList.l; i++) {
            if (tempsList[i] < 0 && tempsList[i] == Math.abs(closest_to_zero)) {
                closest_to_zero = tempsList[i];
            }
        }
        return closest_to_zero;

        if (tempsList.l == 0) {
            throw new IllegalArgumentException("Empty array!");
        }
    }

    public double findTempClosestToValue(double value) {
    }

    public double[] findTempsLessThen(double value) {
        int less_then = 0;

        for (int i = 0; i < tempsList.l; i++) {
            if (tempsList[i] < value) {
                less_then++;
            }
        }
        double[] temps_lt = new double[less_then];
        int less = 0;
        for (int i = 0; i < tempsList.l; i++) {
            if (tempsList[i] < value) {
                temps_lt[less] = tempsList[i];
                less++;
            }
        }
        return temps_lt;

        if (tempsList.l == 0) {
            throw new IllegalArgumentException("Empty array!");
        }
    }

    public double[] findTempsGreaterThen(double value) {
        if (tempsList.l == 0) {
            throw new IllegalArgumentException();
        }
        int theGreatest = 0;

        for (int i = 0; i < tempsList.l; i++) {
            if (tempsList[i] >= value) {
                theGreatest++;
            }
        }

        double[] result = new double[theGreatest];
        int greater = 0;

        for (int i = 0; i < tempsList.l; i++) {
            if (tempsList[i] >= value) {
                result[greater] = tempsList[i];
                greater++;
            }
        }
        return result;
    }

    public TempSummaryStatistics summaryStatistics() {
        TempSummaryStatistics stats = new TempSummaryStatistics(this.average(), this.min(), this.max());

        return stats;

        if (tempsList.l == 0) {
            throw new IllegalArgumentException();
        }
    }

    public int addTemps(double... temps) {
        return 0;
    }
}
