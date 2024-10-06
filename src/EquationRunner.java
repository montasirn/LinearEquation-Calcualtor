import java.util.Scanner;

public class EquationRunner {
    public static void main(String[] args) {
        // set up scanner for user input
        Scanner s = new Scanner(System.in);

        //Welcoming user and prompt them for their coordinate pairs
        System.out.println("Welcome to the best Linear Equation Calculator of 2024");
        System.out.println("To begin, enter your first pair of points (in (x,y) format): ");
        String pair1 = s.nextLine();
        System.out.println("Now enter the second pair of points (in (x,y) format*): ");
        String pair2 = s.nextLine();

        //get out the numbers from the string inputs
        String xPair1 = pair1.substring(1, pair1.indexOf(",")); // Extract x from pair1
        String yPair1 = pair1.substring(pair1.indexOf(" ") + 1, pair1.indexOf(")")); // Extract y from pair1
        String xPair2 = pair2.substring(1, pair2.indexOf(",")); // Extract x from pair2
        String yPair2 = pair2.substring(pair2.indexOf(" ") + 1, pair2.indexOf(")")); // Extract y from pair2


        //convert the numbers from Strings to integers
        int xPair1conv = Integer.parseInt(xPair1); //get the first x coordinate
        int xPair2conv = Integer.parseInt(xPair2); //get the second x coordinate
        int yPair1conv = Integer.parseInt(yPair1); //get the first y coordinate
        int yPair2conv = Integer.parseInt(yPair2); //get the second y coordinate

        LinearEquation test = new LinearEquation(xPair1conv,yPair1conv,xPair2conv,yPair2conv);
        System.out.println(test.toString());

        //prompt user for a third point
        System.out.println("Enter a x value to see the y value at that point");
        int thirdPoint = s.nextInt();
        LinearEquation thirdPointY = new LinearEquation(xPair1conv,yPair1conv,xPair2conv,yPair2conv);
        thirdPointY.thirdPointLQ(thirdPoint);
    }
}
