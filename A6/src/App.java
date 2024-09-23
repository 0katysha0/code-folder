public class App {
    public static void main(String[] args) throws Exception {
        // chicken wings
        // Kate Lozova
        // September 19 2024
        // Project Description: Write the code to print the number of chicken wings you can buy 
        // if you have $4.75 and they cost $0.75 each. Remember that you can’t buy part of a wing.
        
    double totalMoney = 4.75; 
    double wingCoast = 0.75;

    int numberOfwings = (int)(totalMoney/wingCoast);
    System.out.println("You can buy " + numberOfwings + " chicken wings.");
    }
}
