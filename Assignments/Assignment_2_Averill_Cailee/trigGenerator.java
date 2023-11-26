
import java.util.Scanner;

public class trigGenerator {

  public static void main(String[] args) {
    // Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter the first value (adjacent side length)
    System.out.print("Enter first value: ");
    // Read the user input and store it in the variable 'adj'
    double adj = scanner.nextDouble();

    // Prompt the user to enter the second value (opposite side length)
    System.out.print("Enter second value: ");
    // Read the user input and store it in the variable 'opp'
    double opp = scanner.nextDouble();

    // Calculate the squares of the adjacent and opposite sides
    double adjSquared = Math.pow(adj, 2);
    double oppSquared = Math.pow(opp, 2);

    // Calculate the hypotenuse using the Pythagorean theorem
    double hypo = Math.sqrt((adjSquared + oppSquared));

    // Calculate the sine, cosine, and tangent of the given sides
    double sin = (opp / hypo);
    double cos = (adj / hypo);
    double tan = (opp / adj);

    // Print the calculated sine, cosine, and tangent values
    System.out.println("Sin: " + sin);
    System.out.println("Cos: " + cos);
    System.out.println("Tan: " + tan);

    // Test cases
    // Define a 2D array 'doubleValues' containing test cases
    double[][] doubleValues = { { 3, 4 }, { 0.6, 0.8 }, { 1, 1 }, { 2, 3 } };

    // Loop through each test case
    for (int i = 0; i < doubleValues.length; i++) {
        // Extract the adjacent and opposite values for the current test case
        double testAdj = doubleValues[i][0];
        double testOpp = doubleValues[i][1];

        // Print the current test case values
        System.out.println(testAdj);
        System.out.println(testOpp);

        // Calculate the squares of the adjacent and opposite sides for the test case
        double testAdjSquared = Math.pow(testAdj, 2);
        double testOppSquared = Math.pow(testOpp, 2);

        // Calculate the hypotenuse for the test case
        double testHypo = Math.sqrt((testAdjSquared + testOppSquared));

        // Calculate the sine, cosine, and tangent for the test case
        double testSin = (testOpp / testHypo);
        double testCos = (testAdj / testHypo);
        double testTan = (testOpp / testAdj);

        // Print the calculated sine, cosine, and tangent values for the test case
        System.out.println("Sin: " + testSin);
        System.out.println("Cos: " + testCos);
        System.out.println("Tan: " + testTan);
      }
    
  }
}