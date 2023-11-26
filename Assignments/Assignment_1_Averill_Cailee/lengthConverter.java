// This code is intended to convert a whole number of millimetres into other measures of length

// Line 12-14: take users input
// Line 16-19: convert the input into different measurements by dividing the input into corresponding measurements


import java.util.Scanner;

public class lengthConverter {

  public static void main(String[] args) {
    Scanner wholeNumberInput = new Scanner(System.in);
    System.out.print("Enter a whole number of millimeters: ");

    int wholeMillimetres = wholeNumberInput.nextInt();
    int m = wholeMillimetres / 1000;
    int cm = (wholeMillimetres % 1000) / 10;
    int mm = wholeMillimetres % 10;

    System.out.println(
      wholeMillimetres + " is " + m + "m " + cm + "cm " + mm + "mm"
    );

    // Test cases

    int[] testCases = { 0, 1, 10, 1000, 1011, 6789 };
    for (int i = 0; i < testCases.length; i++) {
      int millimetre = testCases[i];
      int metre = millimetre / 1000;
      int centimetre = (millimetre % 1000) / 10;
      int millimetres = millimetre % 10;

       System.out.println(millimetre + " is " + metre + "m " + centimetre + "cm " + millimetres + "mm");
    }
  }
}
