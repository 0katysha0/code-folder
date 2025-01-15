// CoolNumbers
// Kate Lozova
// November 5, 2024
// Complete methods isCoolNum( n ) && countCoolNumbers( n ).  
// isCoolNum( n) will determine if a number is a cool number.  
// A cool number is any number that has a remainder of 1 when divided by 3,4,5, and 6.  countCoolNumbers will count the number
// of cool numbers between 6 and the parameter passed in.



import static java.lang.System.*;

public class CoolNumbers {
    public static boolean isCoolNumber(int num) {
        return (num % 3 == 1) && (num % 4 == 1) && (num % 5 == 1) && (num % 6 == 1);
    }

    public static int countCoolNumbers(int stop) {
        int count = 0;
        for (int i = 7; i <= stop; i++) { // start at 7 since we want numbers between 6 and stop
            if (isCoolNumber(i)) {
                count++;
            }
        }
        return count;
    }
}