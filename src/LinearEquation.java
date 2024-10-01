public class LinearEquation {
    private int x;
    private int y;
    private double slope;
    private double yIntercept;

    public LinearEquation(int x1, int y1) {
        x = x1;
        y = y1;
    }
    public double slope(int x2, int y2){
        slope = ((double) x2 - x) / ((double) y2 - x);
        return slope;
    }
    public double yIntercept(){
        yIntercept = y - (x * slope);
        return yIntercept;
    }
    public String equation(){
        return "" + y + "= " + slope + "x" + " + " + yIntercept;
    }
    public String thirdPoint(){
        return "hi";
    }
}
