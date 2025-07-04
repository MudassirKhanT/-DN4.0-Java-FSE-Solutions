package Exercise7_Financial;

public class MainFinancial {
    public static void main(String[] args) {
        double result = predictValue(1000, 0.10, 5);
        System.out.println("Future value after 5 years: $" + result);
    }

    public static double predictValue(double currentValue, double growthRate, int years) {
        if (years == 0) return currentValue;
        return predictValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }
}
