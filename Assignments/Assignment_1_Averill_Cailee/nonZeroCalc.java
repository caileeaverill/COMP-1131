// This code is intended to take 2 numbers and divide them by each other 

// Line 12-14: take users input
// Line 17-20: convert the whole numbers into doubles
// Line 23-24: Do the calculations


import java.util.Scanner;

public class nonZeroCalc {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter two non zero numbers using space as a delimiter: ");
    int firstNum = scanner.nextInt();
    int secondNum = scanner.nextInt();

    int wholeOne = firstNum;
    double one = wholeOne;
    int wholeTwo = secondNum;
    double two = wholeTwo;

    double oneDivTwo = one / two;
    double twoDivOne = two / one;

    System.out.println(oneDivTwo);
    System.out.println(twoDivOne);

    // Test cases
    // {1, 1}, {1, 4}, {3, 8}, {2, 3}, {25, 7}

    int a = 1;
    double A = a;
    int b = 2;
    double B = b;
    int c = 3;
    double C = c;
    int d = 4;
    double D = d;
    int e = 7;
    double E = e;
    int f = 8;
    double F = f;
    int g = 25;
    double G = g;

    double aDiv = A / A;
    System.out.println(aDiv);
    double divA = A / A;
    System.out.println(divA);

    double bDiv = A / D;
    System.out.println(bDiv);
    double divB = D / A;
    System.out.println(divB);

    double cDiv = C / F;
    System.out.println(cDiv);
    double divC = F / C;
    System.out.println(divC);

    double dDiv = B / C;
    System.out.println(dDiv);
    double divD = C / B;
    System.out.println(divD);

    double eDiv = G / E;
    System.out.println(eDiv);
    double divE = E / G;
    System.out.println(divE);
  }
}
