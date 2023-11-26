import java.text.DecimalFormat;

public class volumeSurfaceGenerator {

  public static void main(String[] args) {
    // Define a 2D array 'testCases' containing height and radius values for test cases
    double[][] testCases = { { 3, 3 }, { 63, 87 }, { 23, 93 }, { 64, 23 }, {82, 97} };

    // Loop through each test case
    for (int i = 0; i < testCases.length; i++) {
      // Extract height and radius values for the current test case
      double height = testCases[i][0];
      double radius = testCases[i][1];

      // Calculate the volume and surface area for a cylinder using the given height and radius
      double volume = Math.PI * Math.pow(radius, 2) * height;
      double surface = 2 * Math.PI * radius * (height + radius);

      // Create a DecimalFormat object to format decimal numbers
      DecimalFormat fmt = new DecimalFormat("0.####");

      // Print the calculated volume and surface area for the current test case
      System.out.println("Volume: " + fmt.format(volume));
      System.out.println("Surface: " + fmt.format(surface));
    }
  }
}
