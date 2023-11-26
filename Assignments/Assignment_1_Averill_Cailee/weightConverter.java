// This code is intended to convert pounds to kilograms.

// Line 13: set up the calculations of lbs to kgs
// Line 15-17: take user input and convert to decimal
// Line 19: declared a variaable that contains the users input multiplied by LB_PER_KG variable

import java.util.Scanner;

public class weightConverter {

  public static void main(String[] args) {
    
    final double LB_PER_KG = 0.45359237;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number in lbs: ");
    double lbs = input.nextDouble();

    double kgs = lbs * LB_PER_KG;

    System.out.println(lbs + " pounds is " + kgs + " kilograms");

    
    // Test cases

    double[] testCases = {0, 1, 100, 0.5, 25, 10, 1000};
    for (int i = 0; i < testCases.length; i++) {
        double kilograms = testCases[i] * LB_PER_KG;
        System.out.println(kilograms);
      }
  }
}
