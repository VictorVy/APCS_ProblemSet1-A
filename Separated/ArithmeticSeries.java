/**
 * Problem Set 1-A: Sum of an Arithmetic Series
 *
 * Victor Yao
 * 9/20/2021
 **/
 
public class ArithmeticSeries
{
    public static void main(String[] args)
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
}