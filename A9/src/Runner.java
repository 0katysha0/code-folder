import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number (a): ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number (b): ");
        int b = scanner.nextInt();

        BigorSmall bigorSmall = new BigorSmall();

        String result = bigorSmall.compare(a, b);
        System.out.println(result);

        scanner.close();
    }
}
