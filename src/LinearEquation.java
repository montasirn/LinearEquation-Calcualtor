public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double slope;
    private double yIntercept;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double slope(){
        slope = (double) (x2 - x1) / (y2 - y1);
        return slope;
    }
    public double yIntercept(){
        yIntercept = y1 - (x1 * slope);
        return yIntercept;
    }
    public int gcd(){
        int numerator = (x2 - x1);
        int denominator = (y2 - y1);
        return numerator % denominator;

    }
    public String slopeString(){
        int numerator = (x2 - x1);
        int denominator = (y2 - y1);
        if(numerator == denominator){
            return slope() + "";
        } else {
            return numerator/gcd() + "/" + denominator/gcd();
        }
    }
    public String equation(){
        return "y" + "= " + slopeString() + "x" + " + " + yIntercept();
    }
    public String thirdPoint(int x){
        return ("(" + x + ", " + x * slope + yIntercept + ")");
    }
    public double disatnce(){
        return Math.sqrt((Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2)));
    }
    public String toString(){
        return "First pair: (" + x1 + ", " + y1 + ") \n" +
                "Second pair: (" + x2 + ", " + y2 + ") \n" +
                "Equation: " + equation() + "\n" +
                "Slope: " + slope() + "\n" +
                "Y-Intercept: " + yIntercept() + "\n" +
                "Distance between points: " + disatnce() + "\n";
    }
}
