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
        //the two points are (x1, y1) and (x2, y2), where:
        int x1 = 0, y1 = 19, x2 = 4, y2 = 42;
        
        //apply slope formula to determine the slope
        double m = (double)(y2 - y1) / (x2 - x1);
        
        //print result in expected format
        System.out.println("SLOPE FORMULA\n" +
                           "A line connecting the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") has a slope of " + m);
    }
}