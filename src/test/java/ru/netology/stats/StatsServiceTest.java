package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void CalcSum() {
        StatsService service = new StatsService();
        long excepted = 180;
        long actual = service.calcSum(sales);
        assertEquals(excepted, actual);
    }

    @Test
    void middleSales() {
        StatsService service = new StatsService();
        long excepted = 15;
        long actual = service.middleSales(sales);
        assertEquals(excepted, actual);

    }

    @Test
    void monthMaxSales() {
        StatsService service = new StatsService();
        long excepted = 8;
        long actual = service.monthMaxSales(sales);
        assertEquals(excepted, actual);
    }

    @Test
    void monthMinSales() {
        StatsService service = new StatsService();
        long excepted = 9;
        long actual = service.monthMinSales(sales);
        assertEquals(excepted, actual);
    }

    @Test
    void monthMinMiddle() {
        StatsService service = new StatsService();
        long excepted = 5;
        long actual = service.monthMinMiddle(sales);
        assertEquals(excepted, actual);
    }

    @Test
    void monthMaxMiddle() {
        StatsService service = new StatsService();
        long excepted = 5;
        long actual = service.monthMaxMiddle(sales);
        assertEquals(excepted, actual);
    }
}
