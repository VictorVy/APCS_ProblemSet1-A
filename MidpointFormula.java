/**
 * Problem Set 1-A: Midpoint Formula
 *
 * Victor Yao
 * 9/20/2021
 **/

public class MidpointFormula
{
    public static void main()
    {
        int x1 = 0, y1 = 17, x2 = 12, y2 = 24;
        
        double x = (x1 + x2) / 2.0, y = (y1 + y2) / 2.0;
        
        System.out.println("MIDPOINT FORMULA\n" +
                           "The midpoint between " + 
                           "(" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") " + 
                           "is (" + x + ", " + y + ")");
    }
}