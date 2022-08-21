public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = Long.MIN_VALUE;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = Long.MAX_VALUE;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long trimAverage() {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }

        if (sales.length > 2) {
            return ((sum - max() - min())) / (sales.length - 2);
        } else {
            System.out.println("Не достаточно данных для расчёта");
            return 0;
        }
    }

}
