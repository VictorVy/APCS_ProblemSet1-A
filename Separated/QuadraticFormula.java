/**
 * Problem Set 1-A: QuadraticFormula
 *
 * Victor Yao
 * 9/20/2021
 **/

public class QuadraticFormula
{
    public static void main(String args[])
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
}