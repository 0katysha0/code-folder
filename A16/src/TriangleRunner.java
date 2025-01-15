import java.util.Scanner;


public class TriangleRunner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        Triangle test = new Triangle();

        // First 
        System.out.print("Enter side A ::  ");
        int a = keyboard.nextInt();

        System.out.print("Enter side B ::  ");
        int b = keyboard.nextInt();

        System.out.print("Enter side C ::  ");
        int c = keyboard.nextInt();

        test.setSides(a, b, c);
        test.print();

        // Second 
        System.out.print("Enter side A :  ");
        a = keyboard.nextInt();

        System.out.print("Enter side B :  ");
        b = keyboard.nextInt();

        System.out.print("Enter side C :  ");
        c = keyboard.nextInt();

        test.setSides(a, b, c);
        test.print();

        // Third 
        System.out.print("Enter side A :  ");
        a = keyboard.nextInt();

        System.out.print("Enter side B :  ");
        b = keyboard.nextInt();

        System.out.print("Enter side C :  ");
        c = keyboard.nextInt();

        test.setSides(a, b, c);
        test.print();

        keyboard.close();
    }
}