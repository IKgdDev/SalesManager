public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = Integer.MIN_VALUE;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int trimAverage() {
        int sum = 0;
        for (int sale : sales) {
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
