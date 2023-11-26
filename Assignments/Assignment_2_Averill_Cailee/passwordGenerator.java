import java.util.Random;
import java.util.Scanner;

public class passwordGenerator {

  public static void main(String[] args) {

    // Initialize Scanner to take input from the user
    Scanner scanner = new Scanner(System.in);

    // Prompt user to enter their first name
    System.out.print("Enter your first name: ");

    // Read the first name from the user input
    String firstName = scanner.nextLine();
    // Extract the first character of the first name
    char firstNameChar = firstName.charAt(0);

    // Prompt user to enter their last name
    System.out.print("Enter your last name: ");
    // Read the last name from the user input
    String lastName = scanner.nextLine();
    // Extract the first character of the last name
    char lastNameChar = lastName.charAt(0);

    // Initialize arrays to store random digits for the password
    int[] first2digits = new int[2];
    int[] next3digits = new int[3];

    // Generate two random digits for the first two digits of the password
    for (int i = 0; i < 2; i++) {
      Random generator = new Random();
      int randomNum = generator.nextInt(10);
      first2digits[i] = randomNum;
    }

    // Generate three random digits for the next three digits of the password
    for (int i = 0; i < 3; i++) {
      Random generator = new Random();
      int randomNum = generator.nextInt(10);
      next3digits[i] = randomNum;
    }

    // Print the generated password
    System.out.println("Your password is: " + firstNameChar + first2digits[0] + first2digits[1] + lastNameChar + next3digits[0] + next3digits[1] + next3digits[2]);

    // Test cases

    // Array of full names for testing
    String[] names = {"Cailee Averill", "Johnny Cash", "Brad Pitt", "John Doe", "Jane Doe"};

    // Loop through each test case
    for (int i = 0; i < names.length; i++) {
        // Split the full name into first and last names
        String[] splitNames = names[i].split(" ");
        String firstNameTest = splitNames[0];
        String lastNameTest = splitNames[1];
        // Extract the first character of each name
        char firstNameCharTest = firstNameTest.charAt(0);
        char lastNameCharTest = lastNameTest.charAt(0);
    
        // Initialize arrays to store random digits for the test password
        int[] first2digitsTest = new int[2];
        int[] next3digitsTest = new int[3];
    
        // Generate two random digits for the first two digits of the test password
        for (int j = 0; j < 2; j++) {
            Random generator = new Random();
            int randomNum = generator.nextInt(10);
            first2digitsTest[j] = randomNum;
        }
    
        // Generate three random digits for the next three digits of the test password
        for (int j = 0; j < 3; j++) {
            Random generator = new Random();
            int randomNum = generator.nextInt(10);
            next3digitsTest[j] = randomNum;
        }
    
        // Print the generated test password
        System.out.println("Test password for " + names[i] + ": " + firstNameCharTest + first2digitsTest[0] + first2digitsTest[1] + lastNameCharTest + next3digitsTest[0] + next3digitsTest[1] + next3digitsTest[2]);
    }

  }
}