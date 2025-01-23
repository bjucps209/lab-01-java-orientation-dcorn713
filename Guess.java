import java.util.Random;
import java.util.Scanner;

class Guess {
    public static void main(String[] args) {
        Random r = new Random();
        int rand = r.nextInt(10) + 1;
        int numGuesses = 0;
        int guess = 0;
    
        while (guess != rand) {
            Scanner scan = new Scanner(System.in);
            guess = Integer.parseInt(scan.nextLine());
            numGuesses += 1;

            if (guess < rand) {
                System.out.println("Your guess is too low.");
            }
            if (guess > rand) {
                System.out.println("Your guess is too high.");
            }
            if (guess == rand) {
                System.out.println("You got it!!");
            }
        
        }
    System.out.println("It took you " + numGuesses + " guesses.");
    }
}