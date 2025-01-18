import java.util.Scanner;

public class NumToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single digit number: ");
        int number = scanner.nextInt();

        String[] words = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

        if (number >= 0 && number <= 9) {
            System.out.println("The number in words is: " + words[number]);
        } else {
            System.out.println("Please enter a single digit number.");
        }

        scanner.close();
    }
}