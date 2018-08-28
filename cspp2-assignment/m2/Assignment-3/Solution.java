import java.util.Scanner;
/**
*Do not modify this main function.
*/
public class Solution {
    /**
    *Do not modify this main function.
    */
    protected Solution() { }
    /**
    *Do not modify this main function.
    *@param args is an argument
    */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        long base = s.nextLong();
        long exponent = s.nextLong();
        long result = power(base, exponent);
        System.out.println(result);
    }
    /**
    *Need to write the power function and print the output.
    *@param a is an argument
    *@param b is an argument
    *@param result is an argument
    */
    public static long power(final long a, final long b) {
        if (b == 0) {
            return 1;
        }
        long result = a * power(a, b - 1);
        return result;

    }

}
