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
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQuadraticEquation(a, b, c);
    }
    /**
    *Need to write the rootsOfQuadraticEquation function and print the output.
    *@param a is an argument
    *@param b is an argument
    *@param c is an argument
    *@param s is an argument
    *@param ps is an argument
    *@param ns is an argument
    */
    public static void rootsOfQuadraticEquation(final int a,
        final int b, final int c) {
        double s = Math.sqrt((b * b) - 2 * 2 * a * c);
        double ps = (-b + s) / (2 * a);
        double ns = (-b - s) / (2 * a);
        System.out.print(ps + " " + ns);
        // System.out.print(ns);


    }
}
