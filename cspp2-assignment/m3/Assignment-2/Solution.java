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
        int n = s.nextInt();
        int count = 0, temp;
        for (int i = 1; i <= n; i++) {
            temp = i;
            while(temp > 0) {
                if (temp % 10 == 7) {
                    count += 1;
                }
                temp /= 10;
            }

            }
        System.out.println(count);
        }
}

