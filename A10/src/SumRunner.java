import java.util.Scanner;

public class SumRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Sum sumCalculator = new Sum();

        System.out.print("Enter the first number (one): ");
        int one = scanner.nextInt();

        System.out.print("Enter the second number (two): ");
        int two = scanner.nextInt();

        sumCalculator.setNums(one, two);
        sumCalculator.printSum();

        scanner.close();
    }






    }

