import java.util.Scanner;

public class vowelCounter {

  public static void main(String[] args) {
    
    Scanner userScanner = new Scanner(System.in);
    // Prompt the user to enter a sentence
    System.out.print("Enter a sentence: ");
    String input = userScanner.nextLine();

    // Remove whitespace from the input sentence using regular expression
    String inputTrimmed = input.replaceAll("\\s+","");

    // Declare variables to count occurrences of each vowel and non-vowels
    int aVowelCount = 0, eVowelCount = 0, iVowelCount = 0, oVowelCount = 0, uVowelCount = 0, nonVowelCount = 0;

    // Iterate through each character in the trimmed input string
    for (int i = 0; i < inputTrimmed.length(); ++i) {

    // Use a switch statement to check each character and update the corresponding vowel count
      char letter = inputTrimmed.charAt(i);

      switch (letter) {
        case 'a':
        case 'A':
          ++aVowelCount;
          break;
        case 'e':
        case 'E':
          ++eVowelCount;
          break;
        case 'i':
        case 'I':
          ++iVowelCount;
          break;
        case 'o':
        case 'O':
          ++oVowelCount;
          break;
        case 'u':
        case 'U':
          ++uVowelCount;
          break;
        default:
            // If the character is not a vowel, increment the non-vowel count
          ++nonVowelCount;
          break;
      }
    } 
     // Output the counts for each vowel and non-vowel
    System.out.println("# of 'a' vowels: " + aVowelCount); 
    System.out.println("# of 'e' vowels: " + eVowelCount); 
    System.out.println("# of 'i' vowels: " + iVowelCount); 
    System.out.println("# of 'o' vowels: " + oVowelCount); 
    System.out.println("# of 'u' vowels: " +uVowelCount); 
    System.out.println("# of non vowels: " + nonVowelCount); 
  }
}
