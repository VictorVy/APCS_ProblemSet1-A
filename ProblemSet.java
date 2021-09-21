/**
 * APCS Problem Set 1-A
 *
 * Victor Yao
 * 9/20/2021
 **/

public class ProblemSet
{
    public static void main(String args[])
    {
        //print out all results in expected format
        
        quadratic();
        System.out.println();
        
        slope();
        System.out.println();
        
        midpoint();
        System.out.println();
        
        arithmeticSeries();
        System.out.println();
        
        geometricSeries();
    }
    
    private static void quadratic()
    {
        //the polynomial is ax^2 + bx + c, where:
        int a = 2, b = 8, c = 4;
        
        //apply the quadratic formula to determine both roots
        double sol1 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a),
               sol2 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
               
        //print result in expected format
        System.out.println("QUADRATIC FORMULA\n" +
                           "The solutions for " + a + "x^2 + " + b + "x + " + c + " are " + sol1 + " and " + sol2 + ".");
    }
    
    private static void slope()
    {
        //the two points are (x1, y1) and (x2, y2), where:
        int x1 = 0, y1 = 19, x2 = 4, y2 = 42;
        
        //apply slope formula to determine the slope
        double m = (double)(y2 - y1) / (x2 - x1);
        
        //print result in expected format
        System.out.println("SLOPE FORMULA\n" +
                           "A line connecting the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") has a slope of " + m);
    }
    
    private static void midpoint()
    {
        //the two points are (x1, y1) and (x2, y2), where:
        int x1 = 0, y1 = 19, x2 = 4, y2 = 42;
        
        //apply midpoint formula to determine the midpoint (x, y)
        double x = (x1 + x2) / 2.0, y = (y1 + y2) / 2.0;
        
        //print result in expected format
        System.out.println("MIDPOINT FORMULA\n" +
                           "The midpoint between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is (" + x + ", " + y + ")");
    }
    
    private static void arithmeticSeries()
    {
        //                         k
        //the arithmetic series is Σ(a + d * (n - 1)), where:
        //                        n=1
        int k = 5, a = 19, d = 4;
        
        //apply the arithmetic series formula to determine the sum
        double sum = k / 2.0 * (2 * a + (k - 1) * d);
        
        //print result in expected format
        System.out.println("SUM OF AN ARITHMETIC SERIES\n" + 
                           "The sum of the first " + k + " terms of an arithmetic series that starts with " + a + "\n" +
                           "and increases by " + d + " is " + sum);
    }
    
    private static void geometricSeries()
    {
        //                        k
        //the geometric series is Σ(g * r^(n - 1)), where:
        //                       n=1
        int k = 3, g = 19, r = 4;
        
        //apply the geometric series formula to determine the sum
        double sum = g * (Math.pow(r, k) - 1) / (r - 1);
        
        //print the expected results
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES\n" + 
                           "The sum of the first " + k + " terms of a finite geometric series that starts with " + g + "\n" +
                           "and increases by a rate of " + r + " is " + sum);
    }
}