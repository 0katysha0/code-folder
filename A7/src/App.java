// Public class assignment 7
// Kate Lozova
// 9/24/2024
//Code discription: Your code for part one should remove the word “very ” (and following space) from message1 and print the new message.
// You must use .indexOf() to find the start position of a the part of the string you want to remove.
// You need to use .length() to find the end point of the string you want to remove.
// You can then use .substring() to create a new string removing the word.
// Part two: Your code for part two should replace lol in the message with laugh out loud 
//and print the new message. You WILL NOT just change message 2 and replace lol with laugh out loud.
public class App {
    public static void main(String[] args) throws Exception {
        
        String message1 = "I am very happy!";
        String target1 = "very";

        String message2 = "That was great - lol.";
        String target2 = "lol";

        int startIndex = message1.indexOf(target1);
        int endIndex = startIndex + target1.length();
        String newMessage1 = message1.substring(0, startIndex) + message1.substring(endIndex);
        System.out.println(newMessage1);
        
        String newMessage2 = message2.replace(target2, "laugh out loud");
        System.out.println(newMessage2);
    }
}
