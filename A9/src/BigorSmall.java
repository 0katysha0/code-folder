// Big or Small
// Kate Lozova
// October 9, 2024
// Write a program to check 2 parameters. If a is
// >b, output "yes". If b is . a, output "mo". 
//If a is equal to b, return "equals"


public class BigorSmall {
    public String compare(int a, int b) {
        if (a > b) {
            return "yes";
        } else if (b > a) {
            return "no";
        } else {
            return "equals";
        }   
            
    }
    
}