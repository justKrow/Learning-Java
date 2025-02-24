package control_flow;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat) {
            System.out.println("Playing current song...");
            System.out.println("Enter 'yes' to remove the current song: ");
            String input = scanner.next();

            if (input.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing the next song...");
    }
}
