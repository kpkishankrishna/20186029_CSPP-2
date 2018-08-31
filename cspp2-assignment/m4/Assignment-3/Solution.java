/**
*Do not modify this main function.
*/
import java.util.Scanner;
/**
*Do not modify this main function.
*/
public final class Solution {
    protected Solution() { 
        /**
        *Do not modify this main function.
        */}
    /**
    *Do not modify this main function.
    */
    public static void main(final String[] args) {
        /**
        *Fill the main function to print resultant of addition of matrices.
        */
        
        /**
        *Fill the main function to print resultant of addition of matrices.
        *@param args is argument.
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String res = binaryToDecimal(s);
            System.out.println(res);
        }
    }
    static String binaryToDecimal(final String s) {
        int binary = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                binary += (Math.pow(2, s.length() - i - 1));
            }
        }
        return  (binary + "");

        }
    }
