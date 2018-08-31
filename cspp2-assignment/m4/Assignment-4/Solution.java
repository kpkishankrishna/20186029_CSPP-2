/**
*Do not modify this main function.
*/
import java.util.Scanner;
/**
*Do not modify this main function.
*/
public class Solution {
    /**
    *Do not modify this main function.
    */
    protected Solution() {
    /**
    *Do not modify this main function.
    */
    }
    /**
    *Do not modify this main function.
    *@param args is argument.
    */
    /**
    Do not modify the main function
    */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);

    }
    //Write reverseString function
    /**
    *Do not modify this main function.
    *@param s is an argument
    *@return is an argumanet
    */

    static String reverseString(final String s) {
        String reverse = "";
        for (int i = 0; i < s.length(); i++) {
            reverse = s.charAt(i) + reverse;
        }
        return reverse;

    }

}
