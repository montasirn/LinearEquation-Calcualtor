import java.util.Scanner;

public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinearEquation test = new LinearEquation(2,4,4,8);
        System.out.println(test.toString());
    }
}
