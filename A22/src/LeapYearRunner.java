import static java.lang.System.*;
import java.util.Scanner; 

public class LeapYearRunner { 

public static void main(String args[]) {
     Scanner keyboard = new Scanner(System.in); 
     out.print("Enter a year: ");
     int year = keyboard.nextInt();
     if (LeapYear.isLeapYear(year)) { 
        out.println(year + " is a leap year.");
     } else { 
        out.println(year + " is not a leap year.");   
     }   
     keyboard.close();
     }
    }
