import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            int num1 = random.nextInt(1000); 
            int num2 = random.nextInt(1000);

            System.out.println("Here are two random numbers:");
            System.out.println(num1 + " and " + num2);
            System.out.println();

            int smallest = Math.min(num1, num2);
            int largest = Math.max(num1, num2);

            System.out.println("The smallest is " + smallest);
            System.out.println("The biggest is " + largest);
            System.out.println();
        }
    }
}
