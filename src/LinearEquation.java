public class LinearEquation {
    private int x;
    private int y;
    private double slope;

    public LinearEquation(int x1, int y1) {
        int x = x1;
        int y = y1;
    }
    public double slope(int x1, int x2, int y1, int y2){
        return ((double) x2 - x1) / ((double) y2 - y1);
    }
}
