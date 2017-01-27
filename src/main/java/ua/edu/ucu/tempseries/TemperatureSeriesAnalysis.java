public class TemperatureSeriesAnalysis {

    private double[] temperatureSeries;

    public double average() {
        if (temperatureSeries.length == 0) {
            throw new IllegalArgumentException();
        }
        else {
            double avg = 0;
            for (double tmp : temperatureSeries) {
                avg += tmp / temperatureSeries.length;
            }
            return avg;
        }
    }

    public double deviation() {
        if (temperatureSeries.length == 0) {
            throw new IllegalArgumentException();
        }
        else {
            double dev = 0;
            return dev;
        }
    }

    public double min() {
        double min = temperatureSeries[0];
        for (double tmp : temperatureSeries) {
            if (tmp < min) {
                min = tmp;
            }
        }
        return min;
    }

    public double max() {
        double max = temperatureSeries[0];
        for (double tmp : temperatureSeries) {
            if (tmp > max) {
                max = tmp;
            }
        }
        return max;
    }

    public double findTempClosestToZero() {
        if (temperatureSeries.length == 0) {
            throw new IllegalArgumentException();
        }
        else {
            double t = temperatureSeries[0];
            for (int i = 1; i < temperatureSeries.length; i++) {
                if (Math.abs(t) > Math.abs(temperatureSeries[i])) {
                    t = temperatureSeries[i];
                }
                else if( Math.abs(t) == Math.abs(temperatureSeries[i])) {
                    t = Math.abs(temperatureSeries[i]);
                }
            }
            return t;
        }
    }

    public double findTempClosestToValue(double tempValue) {
        if (temperatureSeries.length == 0){
            throw new IllegalArgumentException();
        }
        else {
            double t = temperatureSeries[0];
            for (int i = 1; i < temperatureSeries.length; i++) {
                if (Math.abs(tempValue - t) > Math.abs(tempValue - temperatureSeries[i])) {
                    t = temperatureSeries[i];
                }
            }
            return t;
        }
    }

    public double[] findTempsLessThen(double tempValue) {
        if (temperatureSeries.length == 0) {
            throw new IllegalArgumentException();
        }
        else {
            int count = 0;
            for (double tmp : temperatureSeries) {
                if (tempValue > tmp) {
                    count++;
                }
            }
            double[] resultArr = new double[count];
            int index = 0;
            for (double tmp : temperatureSeries) {
                if (tempValue > tmp) {
                    resultArr[index] = tmp;
                    index++;
                }
            }
            return resultArr;
        }
    }

    public double[] findTempsGreaterThen(double tempValue) {
        if (temperatureSeries.length == 0) {
            throw new IllegalArgumentException();
        }
        else {
            int count = 0;
            for (double tmp : temperatureSeries) {
                if (tmp > tempValue) {
                    count++;
                }
            }
            double[] resultArr = new double[count];
            int index = 0;
            for (double tmp : temperatureSeries) {
                if (tmp > tempValue) {
                    resultArr[index] = tmp;
                    index++;
                }
            }
            return resultArr;
        }
    }

    public TempSummaryStatistics summaryStatistics() {
        if (temperatureSeries.length == 0) {
            throw new IllegalArgumentException();
        }
        else {
            TempSummaryStatistics statistics = new TempSummaryStatistics(average(), deviation(), min(), max());
            return statistics;
        }
    }

    public int addTemps(double... temps) {
        double[] tempArray = temperatureSeries;
        while(temperatureSeries.length < (tempArray.length + temps.length)){
            temperatureSeries = new double[tempArray.length * 2];
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < tempArray.length; i++){
            temperatureSeries[i] = tempArray[i];
            count++;
            sum += tempArray[i];
        }
        for (int i = 0; i < temps.length; i++){
            temperatureSeries[count] = temps[i];
            count++;
            sum += temps[i];
        }
        return sum;
    }
}