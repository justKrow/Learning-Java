package control_flow;

import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        System.out.println("Pick a number between 0 and 10: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number < 5) {
            System.out.println("Enjoy ur good luck");
        } else {
            System.out.println("U are dead");
        }
    }
}
