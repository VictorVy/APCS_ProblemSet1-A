/**
 * Problem Set 1-A: QuadraticFormula
 *
 * Victor Yao
 * 9/20/2021
 **/

import java.lang.Math; 
 
public class QuadraticFormula
{
    public static void main(String args[])
    {
        int a = 2, b = 100, c = 4;
        
        double sol1 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a),
               sol2 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        
        System.out.println("QUADRATIC FORMULA\n" +
                           "The solutions for " +
                           a + "x^2 + " + b + "x + " + c +
                           " are " + sol1 + " and " + sol2 + ".");
    }
}