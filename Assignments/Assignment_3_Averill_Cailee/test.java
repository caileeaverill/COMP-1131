import java.util.Random;
import java.util.Scanner;

public class test {

  public static void runGame() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a character: ");
    String guess = scanner.nextLine();

    Scanner inputScanner = new Scanner(System.in);
    String userInput = "";

    int gameCount = 0;

    do {

    if (guess.matches("[a-zA-Z]+")) {
      Random r = new Random();
      // String alphabet = "abcdefghijklmnopqrstuvwxyz";
      char randomLetter = (char) (r.nextInt(26) + 'a');
      System.out.println("Random letter: " + randomLetter);

      char guessChar = guess.charAt(0);

      for (int i = 0; i < 25; i++) {
        if (guessChar == randomLetter) {
          Congratulations();
          break;
        } else if (guessChar != randomLetter) {
          System.out.println("Wrong! Please try again!");
          System.out.print("Enter a character: ");
          guess = scanner.nextLine();
          guessChar = guess.charAt(0);
        }
        if (numOfGuesses > 25) {
          Loser(randomLetter);
        }
      }
    } else {
      System.out.println("Please enter a valid character!");
    }
  } while (userInput != "y");

  }
  
//   public static void printGuessesLeft(int numOfGuesses) {
//     System.out.println("You have " + numOfGuesses + " guesses left!");
// }

  public static void Congratulations() {
    System.out.println("Congratulations! You guessed the letter!");
  }

  public static void Loser(char randomLetter) {
    System.out.println("You lose! The letter was " + randomLetter);
  }

  public static void main(String[] args) {
    runGame();
  }
}
