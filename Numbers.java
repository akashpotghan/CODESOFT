import java.util.Random;
import java.util.Scanner;

public class  Numbers{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        
        int totalScore = 0;
        int totalRounds = 0;
    
        boolean startAgain = true;

        while (startAgain) {
            int randomNumber = rnd.nextInt(100) + 1;
            int usersAttempts = 0;
            int maxAttempts = 4;
            boolean guessed = false;

            System.out.println("The number has been generated. Now it's your turn to guess!");
            System.out.println("************************************");
            System.out.println("You have " + maxAttempts + " attempts.");
            System.out.println("Guess the number before the maximum limit is reached!");

            while (usersAttempts < maxAttempts && !guessed) {

                System.err.println("----------------------------------");
                System.out.print("Enter your Number that you wanat to match with randomly generated Number: ");
                int userGuess = sc.nextInt();
                usersAttempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Nicely done, you guessed the right number.");
                    System.out.println("You won in " + usersAttempts + " attempts!");
                    guessed = true;
                } else if (userGuess > randomNumber) {
                    System.out.println("The number you have enterd are to high please! Try a lower number.");
                } else {
                    System.out.println("the enterd Number are to low please! Try a higher number.");
                }
            }

            if (!guessed) {
                System.out.println("Oops, bad luck! The correct number was: " + randomNumber);
                System.out.println("Try again!");
            }

            if (guessed) {
                int roundScore = maxAttempts - usersAttempts + 1;
                totalScore =   totalScore + roundScore;
            }
            totalRounds++;

            System.out.print("Do you want to play another round? (yes/no): ");
            String response = sc.next().trim().toLowerCase();
            startAgain = response.equals("yes");
        }

        System.out.println("you finished with your game buddy! Your total score is: " + totalScore);
        System.out.println("Total numbers of  rounds you have  played: " + totalRounds);
        sc.close();
    }
}
