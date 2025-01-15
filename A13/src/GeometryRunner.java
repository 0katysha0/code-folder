import java.util.Scanner;

public class GeometryRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Geometry geometry = new Geometry();

        System.out.println("Choose a calculation:");
        System.out.println("1: Perimeter of a Rectangle");
        System.out.println("2: Surface Area of a Cube");
        System.out.println("3: Area of a Circle");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: // Perimeter of a rectangle
                System.out.print("Enter the length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width: ");
                double width = scanner.nextDouble();
                geometry.perimeter(length, width);
                break;

            case 2: // Surface area of a cube
                System.out.print("Enter the side length of the cube: ");
                double side = scanner.nextDouble();
                geometry.surfaceArea(side);
                break;

            case 3: // Area of a circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                geometry.circleArea(radius);
                break;

            default:
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                break;
        }

        scanner.close();
    }
}
