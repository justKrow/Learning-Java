package function;

import java.util.Scanner;

public class define {
    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for time to have some tea!");
        System.out.println("Type random word to start tea tim: ");
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        System.out.println("It is tea time");
    }

    public static void main(String[] args) {
        System.out.println("welcome to work");
        announceDeveloperTeaTime();
        System.out.println("write code");
        System.out.println("fool around");
        announceDeveloperTeaTime();
        System.out.println("wake up");
    }
}
