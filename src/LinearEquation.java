public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double slope;
    private double yIntercept;
    private String slopeFraction;

    // Constructor for the class
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        calculateSlopeAndYIntercept();
    }

    public void thirdPointLQ(int a) {
        // Calculate the y value using the formula y = mx + b
        double y = slope * a + yIntercept;

        // Print the coordinate pair
        String s = "(" + a + ", " + y + ")";
        System.out.println(s);
    }

    // Method to calculate slope
    private void calculateSlopeAndYIntercept() {
        slope = (double) (y2 - y1) / (x2 - x1);  // Fixing the slope calculation
        yIntercept = y1 - slope * x1;
    }


    // Method to calculate the greatest common divisor (GCD)
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Method to return slope as a simplified fraction
    public String slopeString() {
        int numerator = (y2 - y1);
        int denominator = (x2 - x1);

        // If slope is 0, return "0"
        if (numerator == 0) {
            slopeFraction = "0";
            return slopeFraction;
        }

        // Find the greatest common divisor to reduce the fraction
        int gcdValue = gcd(numerator, denominator);
        numerator /= gcdValue;
        denominator /= gcdValue;

        // If both numerator and denominator are negative -> make them positive
        if (numerator < 0 && denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        // If the denominator is negative, move the negative sign to the numerator
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        // Handle cases where denominator is 1 or -1
        if (denominator == 1) {
            slopeFraction = numerator == 1 ? "" : String.valueOf(numerator); // No need for '1x'
        } else if (denominator == -1) {
            slopeFraction = numerator == -1 ? "-" : String.valueOf(-numerator); // No need for '-1x'
        } else {
            slopeFraction = numerator + "/" + denominator; // Normal fraction
        }

        return slopeFraction;
    }

    // Method to return the equation of the line
    public String equation() {
        // Special case when slope is zero
        if (slope == 0) {
            return "y = " + yIntercept; // Just return y = b
        }

        // General case when slope is non-zero
        String slopeStr = slopeString();
        String yInterceptStr = yIntercept == 0 ? "" : (yIntercept > 0 ? " + " + yIntercept : " - " + Math.abs(yIntercept)); // Makes sure the right symbol is used when the y-int is negative; so it doesn't return as + -

        return "y = " + slopeStr + "x" + yInterceptStr;
    }

    // Method to calculate the distance between two points
    public double distance(){

        return Math.sqrt((Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2)));
    }


    public String toString(){
        return "First pair: (" + x1 + ", " + y1 + ") \n" +
                "Second pair: (" + x2 + ", " + y2 + ") \n" +
                "Equation: " + equation() + "\n" +
                "Slope: " + slopeString() + "\n" +
                "Y-Intercept: " + yIntercept + "\n" +
                "Distance between points: " + distance() + "\n";
    }
}
