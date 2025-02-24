package function;

public class parameter {
    public static double calculateTotalPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double totalPrice = listedMealPrice + tip + tax;
        // System.out.println("TotalPrice: " + totalPrice);
        return totalPrice; // return the total price to caller method for further processing or usage.
    }

    public static void main(String[] args) {
        double totalPrice = calculateTotalPrice(14, 2, 9);
        System.out.println(totalPrice);
    }
}
