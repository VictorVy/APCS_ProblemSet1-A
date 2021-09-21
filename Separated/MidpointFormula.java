/**
 * Problem Set 1-A: Midpoint Formula
 *
 * Victor Yao
 * 9/20/2021
 **/

public class MidpointFormula
{
    public static void main(String[] args)
    {
        //the two points are (x1, y1) and (x2, y2), where:
        int x1 = 0, y1 = 19, x2 = 4, y2 = 42;
        
        //apply midpoint formula to determine the midpoint (x, y)
        double x = (x1 + x2) / 2.0, y = (y1 + y2) / 2.0;
        
        //print result in expected format
        System.out.println("MIDPOINT FORMULA\n" +
                           "The midpoint between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is (" + x + ", " + y + ")");
    }
}