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
        int k = 4, a = 5, d = 15;
        
        double sum = k / 2.0 * (2 * a + (k - 1) * d);
        
        System.out.println("SUM OF AN ARITHMETIC SERIES\n" + 
                           "The sum of the first " + k + " terms of an arithmetic series that starts with " + a + "\n" +
                           "and increases by " + d + " is " + sum);
    }
}