package function;

public class parameter {
    public static void calculateTotalPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double totalPrice = listedMealPrice + tip + tax;
        System.out.println("TotalPrice: " + totalPrice);
    }

    public static void main(String[] args) {
        calculateTotalPrice(14, 2, 9);
    }
}
