import java.util.Scanner;

public class Solution {
    /**
    Do not modify this main function.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQuadraticEquation(a, b, c);
    }
    /**
    Need to write the rootsOfQuadraticEquation function and print the output.
    */
    public static void rootsOfQuadraticEquation(int a, int b, int c)
    {
        double s = Math.sqrt((b * b) - 2 * 2 * a * c);
        double ps = (-b + s) / (2 * a);
        double ns = (-b - s) / (2 * a);
        System.out.print(ps + " " + ns);
        // System.out.print(ns);


    }
}
