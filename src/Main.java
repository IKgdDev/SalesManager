public class Main {
    public static void main (String[] args){
        long[] sales = {2, 4, 3, 7};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Среднее количество продаж составляет: " + salesManager.trimAverage());
    }
}
