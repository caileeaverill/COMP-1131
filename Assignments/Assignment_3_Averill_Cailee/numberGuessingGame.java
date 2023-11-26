import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {

  public static void main(String[] args) {
    Scanner yesOrNo = new Scanner(System.in);
    String answer = "";

    do {
      askForGuess();
      System.out.print("Do you want to play again?(y/n)");
      answer = yesOrNo.nextLine();
      System.out.println(answer);
    } while (answer.equals("y"));

    if (answer.equals("n")) {
      System.out.println("Thanks for playing!");
    }
  }

  public static void askForGuess() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a character: ");
    String guess = scanner.nextLine();

    Random r = new Random();
    char randomLetter = (char) (r.nextInt(26) + 'a');

    System.out.println("Random letter: " + randomLetter);

    runGame(guess, randomLetter);
  }

  public static void Congratulations() {
    System.out.println("Congratulations! You guessed the letter!");
  }

  public static void wrongGuess(char randomLetter) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a character: ");
    String guess = scanner.nextLine();
    runGame(guess, randomLetter);
  }

  public static void Loser(char randomLetter) {
    System.out.println("You lose! The letter was " + randomLetter);
  }

  public static void runGame(String guess, char randomLetter) {
    if (guess.matches("[a-zA-Z]+\\.?")) {
      Character guessChar = guess.charAt(0);
      int numOfGuesses = 25;

      System.out.println("Guess character: " + guessChar);
      System.out.println("Random letter: " + randomLetter);

      for (int i = 0; i < numOfGuesses; numOfGuesses--) {
        if (guessChar == randomLetter) {
          Congratulations();
          break;
        } else if (guessChar.equals(randomLetter)) {
          wrongGuess(randomLetter);
          System.out.println("running!");
        } else if (guessChar != randomLetter || numOfGuesses >= 0) {
          Loser(randomLetter);
        }
      }
    } else {
      System.out.println("Error: invalid character");
      askForGuess();
    }
  }
}
