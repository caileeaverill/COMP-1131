import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {

  public static void main(String[] args) {
    Scanner yesOrNo = new Scanner(System.in);
    String answer = "";

    do {
      runGame();
      System.out.print("Do you want to play again?(y/n)");
      answer = yesOrNo.nextLine();
      // System.out.println(answer);
    } while (answer.equals("y"));

    if (answer.equals("n")) {
      System.out.println("Thanks for playing!");
    }
  }

  public static void Congratulations() {
    System.out.println("Congratulations! You guessed the letter!");
  }

  public static void Loser(char randomLetter) {
    System.out.println("You lose! The letter was " + randomLetter);
  }

  public static void runGame() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a character: ");
    String guess = scanner.nextLine();
    char guessChar = guess.charAt(0);

    if (guess.matches("[a-zA-Z]+\\.?")) {
      int numOfGuesses = 25;

      Random r = new Random();
      char randomLetter = (char) (r.nextInt(26) + 'a');

      System.out.println("Random letter: " + randomLetter);

      int tries = 0;

      for (int i = 0; i < numOfGuesses; numOfGuesses--) {
        if (guessChar == randomLetter) {
          Congratulations();
          break;
        } else if (guessChar != randomLetter) {

          do {
            System.out.println("Wrong! Please try again!");
            System.out.print("Enter a character: ");
            guess = scanner.nextLine();
            guessChar = guess.charAt(0);
            tries++;
            System.out.println(tries);
          } while (tries < 3);

          if (tries > 3) {
            System.out.println("Keep playing?");
          }
        } else if (guessChar != randomLetter || numOfGuesses >= 0) {
          Loser(randomLetter);
        }
      }
    } else {
      System.out.println("Error: invalid character");
      runGame();
    }
  }
}
