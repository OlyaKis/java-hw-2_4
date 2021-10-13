package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {

    @Test
    void shouldCalcSum() {
        StatService service = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calcSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        StatService service = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.calculateAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMax() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.findMax(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMin() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.findMin(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindLessAverage() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.findLessAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMoreAverage() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.findMoreAverage(sales);

        assertEquals(expected, actual);
    }
}
