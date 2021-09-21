/**
 * Problem Set 1-A: Sum of a Finite Geometric Series
 *
 * Victor Yao
 * 9/20/2021
 **/
  
public class GeometricSeries
{
    public static void main(String[] args)
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