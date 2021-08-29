package ru.netology.stats;

public class StatsService {

    //   Сумма всех продаж
    public long calcSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //  Средняя сумма продаж в месяц
    public long middleSales(long[] sales) {
        long sum = calcSum(sales);
        return sum / sales.length;
    }

    //    Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
    public int monthMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    //   Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    public int monthMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //  Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    public long monthMinMiddle(long[] sales) {
        int sumMonth = 0;
        long middle = middleSales(sales);
        for (long sale : sales) {
            if (sale < middle) {
                sumMonth++;
            }
        }
        return sumMonth;
    }

    //   Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    public long monthMaxMiddle(long[] sales) {
        int sumMonth = 0;
        long middle = middleSales(sales);
        for (long sale : sales) {
            if (sale > middle) {
                sumMonth++;
            }
        }
        return sumMonth;
    }
}

