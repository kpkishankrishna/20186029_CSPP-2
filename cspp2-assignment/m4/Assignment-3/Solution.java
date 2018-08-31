import java.util.Scanner;
public final class Solution {
    /**
    *Do not modify this main function.
    */
    public static void main(final String[] args) {
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
