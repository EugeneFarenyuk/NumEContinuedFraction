// Task: Compute Euler's number (number e) using its "continued fraction" representation.
// Recursion is used.
import java.lang.*;
public class NumEContinuedFraction {
     public static int recursiveMethod(int i, double value) {        
        if(i == 0) {  
            value = value+2.0;
            System.out.printf("e = %.9f (limited to ten s.f.)\n", value);
        }
        else {
            value= i==1? i - 1.0 + i/value : i - 1.0 + (i-1.0)/value;
            recursiveMethod(--i, value);
        }
        return 0;
    }
    public static void main(String args[]) {         
       int a = recursiveMethod(100, 1.0);
    }
}