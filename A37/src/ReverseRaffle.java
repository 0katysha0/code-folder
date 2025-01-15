//Raffle
// Kate Lozova
// 12/17/2024
// A reverse raffle is a raffle draw where the name drawn from a hat they DOES NOT win. 
//The last name drawn is the actual winner.
//Create a reverse raffle draw using an array or ArrayList 

import java.util.ArrayList;
import java.util.Collections;

public class ReverseRaffle {
    public static void main(String[] args) {
        System.out.println("Welcome to the Reverse Raffle Draw!");
        System.out.println("The rules are simple: if your name is drawn, you are OUT.");
        System.out.println("The last name remaining wins the raffle!\n");

        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "Isa", "Mickle", "Charlie", "Diana", "George", 
                                   "Anna", "Paul", "Hannah", "Cole", "Justin");

        System.out.println("Participants in the draw:");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("\nLet the raffle begin!\n");

        try {
            while (names.size() > 1) {
                Thread.sleep(1000); 

                int index = (int) (Math.random() * names.size());
                String removedName = names.remove(index);

                System.out.println("Name removed: " + removedName);
            }
        } catch (InterruptedException e) {
            System.out.println("An error occurred during the draw.");
        }

        System.out.println("\nCongratulations to the winner: " + names.get(0) + "!");
    }
}
