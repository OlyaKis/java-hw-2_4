package ru.netology.stats;

public class StatService {

    public long calcSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAverage(long[] sales) {
        long sum = calcSum(sales);
        return sum / sales.length;
    }

    public long findMax(long[] sales) {
        long maxMonth = 0;
        long month = 0;
        for (long sale : sales) {
            if (sale >= sales[(int) maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long findMin(long[] sales) {
        long minMonth = 0;
        long month = 0;
        for (long sale : sales) {
            if (sale <= sales[(int) minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long findLessAverage(long[] sales) {
        long sumAverage = calculateAverage(sales);
        long month = 0;
        for (long sale : sales) {
            if (sale < sumAverage) {
                month = month + 1;
            }
        }
        return month;
    }

    public long findMoreAverage(long[] sales) {
        long sumAverage = calculateAverage(sales);
        long month = 0;
        for (long sale : sales) {
            if (sale > sumAverage) {
                month = month + 1;
            }
        }
        return month;
    }
}