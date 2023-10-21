import java.util.Random;
import java.util.Scanner;
public class Numbergame{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the Number Game!");
        boolean playAgain = true;
        int score = 0;
        while(playAgain){
            int guess = random.nextInt(100)+1;
            int currAttem = 0;
            int guessLimit = 4;
            System.out.println("I've selected a number between 1 and 100. Try to guess the number?");
            while(currAttem<guessLimit){
                System.out.println("Enter your guess:");
                int userGuess=scan.nextInt();
                scan.nextLine();
                currAttem++;
                if(userGuess==guess){
                    System.out.println("Congrats, You guessed the right number "+guess+" in "+currAttem+" attempts.");
                    score++;
                    continue;
                }
                else if(userGuess>guess){
                    System.out.println("Too high! Try again");
                }
                else{
                    System.out.println("Too Low! Try again");  
                }
            }
            if(currAttem>=guessLimit){
                    System.out.println("Sorry, your've run out of attempts. The correct number was "+guess+" .");
            }
            System.out.println("Do you want to play again? (yes/no): ");
            String s = scan.nextLine();
            playAgain = s.equalsIgnoreCase("yes");
        }
        System.out.println("Game over! Your score: "+score);
        scan.close();
    }
}