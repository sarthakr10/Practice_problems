import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[5];

        // Generate 5 random 3-digit numbers
        for (int i = 0; i < 5; i++) {
            numbers[i] = 100 + random.nextInt(900);
            System.out.println("Generated number: " + numbers[i]);
        }

        // Find the minimum and maximum values
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}