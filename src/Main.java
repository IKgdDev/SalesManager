public class Main {
    public static void main (String[] args){
        int[] sales = {10, 4, 3, 7, 10, 2, 6};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Среднее количество продаж составляет: " + salesManager.trimAverage());
    }
}
