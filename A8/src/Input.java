import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        double doubleOne, doubleTwo;

       
        System.out.print("Enter an integer : ");
        intOne = keyboard.nextInt();
        System.out.print("Enter second integer : ");
        intTwo = keyboard.nextInt();

        System.out.print("Enter a double : ");
        doubleOne = keyboard.nextDouble();
        System.out.print("Enter second double : ");
        doubleTwo = keyboard.nextDouble();

        System.out.println("integer one = " + intOne);
        System.out.println("integer two = " + intTwo);      
        System.out.println("double one = " + doubleOne);
        System.out.println("double two = " + doubleTwo);

        
        System.out.println("Sum of integers = " + (intOne + intTwo));
        System.out.println("Sum of double = " + (doubleOne + doubleTwo));

        keyboard.close();
    }
}
