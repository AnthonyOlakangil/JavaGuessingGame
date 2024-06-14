// Anthony Olakangil
import java.util.Scanner;

/**
   Tester class for NumberGuesser game
   @author Anthony Olakangil
 */
public class GuessingGame_Olakangil {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("enter your max possible value: ");
      int max = input.nextInt();
      
      NumberGuesser guesser = new NumberGuesser(max);
      System.out.print("enter your guess: ");
      int userGuess = input.nextInt();
      
      while (!guesser.play(userGuess)) {
         System.out.print("enter your guess: ");
         userGuess = input.nextInt();
      }      
   }
}

class NumberGuesser {

   int NumberToGuess;
   
   public NumberGuesser() {
      NumberToGuess = (int) (Math.random() * 10 + 1);
   }
   
   // overload the constructor - allow user to dictate the max value
   public NumberGuesser(int max) {
      NumberToGuess = (int) (Math.random() * max + 1);
   }
   
   public boolean play(int guess) {
      if (guess == NumberToGuess) {
         System.out.println("you guessed it!!");
         return true;
      }
      else if (guess > NumberToGuess) {
         System.out.println("Lower");
         return false;
      }
      else {
         System.out.println("Higher");
         return false;
      }
   }
}