/**
 * Problem Set 1-A: Slope Formula
 *
 * Victor Yao
 * 9/20/2021
 **/
 
public class SlopeFormula
{
    public static void main(String[] args)
    {
        int x1 = 0, y1 = 17, x2 = 12, y2 = 24;
        
        double slope = (double)(y2 - y1) / (x2 - x1);
        
        System.out.println("SLOPE FORMULA\n" +
                           "A line connecting the points " +
                           "(" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") " + 
                           "has a slope of " + slope);
    }
}