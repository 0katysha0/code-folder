//Kate Lozova
// CFD practice problem
// January 22, 2025


import java.util.Scanner;
public class BowlingScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        int eliteCount = 0;
        int averageCount = 0;
        int totalCount = 0;
        System.out.print("Please enter your bowling score (-1 to quit): ");
        score = scanner.nextInt();

        while (score != -1) {
            if (score >= 0 && score <= 300) {
                if (score >= 200) {
                    eliteCount++;
                } else {
                    averageCount++;
                }
                totalCount++;
                } else {
                    System.out.println("Invalid score. Please enter a value between 0 and 300.");
                }
                System.out.print("Please enter your bowling score (-1 to quit): ");
                score = scanner.nextInt();
            }
            if (totalCount > 0){
                double elitePercentage = (eliteCount * 100.0);
                double averagePercentage = (averageCount * 100.0);

                System.out.printf("Elite Bowlers: %.1f%%\n", elitePercentage);
                System.out.printf("Average Bowlers: %.1f%%\n", averagePercentage);
            } else {
                System.out.println("No score entered.");
            }
            scanner.close();
            }
        } 
    
