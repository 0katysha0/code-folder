//Fahrenheit to Celsius
//Kate Lozova
//October 16 2024
//Project Description: Convert Celsius to Fahrenheit.   


public class Fahrenheit {
    private double fahrenheit;

    public void setFahrenheit(double fahren) {
        this.fahrenheit = fahren;
    }

    public double getCelsius() {
        double celsius = (fahrenheit - 32) * (5.0 / 9.0);
        return celsius;
    }

    public void print() {
        System.out.println("Celsius: " + getCelsius());
    }
}
