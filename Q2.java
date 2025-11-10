import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerr = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scannerr.nextInt(); 
        int factorssum = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorssum += i;
            }
        }

        System.out.println("Sum of factors = " + factorssum);
    }
}
