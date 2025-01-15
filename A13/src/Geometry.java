public class Geometry {

    // rectangle
    public void perimeter(double len, double wid) {
        double P = 2 * (len + wid);
        System.out.println("The perimeter of the rectangle is: " + P);
    }

    // cube
    public void surfaceArea(double side) {
        double SA = 6 * Math.pow(side, 2);
        System.out.println("The surface area of the cube is: " + SA);
    }

    // circle
    public void circleArea(double radius) {
        double A = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + A);
    }
}
