import java.io.IOException;
import java.util.Scanner;

public class ThrowsDemo {

    // Method that declares it throws a checked exception
    public static void check(int n) throws IOException {
        if (n < 0) {
            // Explicitly throwing an IOException if n is negative
            throw new IOException();
        } else {
            // If n is non-negative, simply print it
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Format: An integer
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            try {
                // Calling the method that might throw an exception
                check(n);
            } catch (IOException e) {
                // Handling the specific checked exception
                System.out.println("Caught: IO Exception");
            }
        }
        
        scanner.close();
    }
}
