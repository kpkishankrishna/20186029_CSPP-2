import java.util.*;
public class Solution {
    /* Fill the main function to print resultant of addition of matrices*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        for (int i = 0; i<m; i++)
            for (int j = 0; j<n; j++)
                a[i][j] = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int b[][] = new int[p][q];
        for (int i = 0; i<p; i++)
            for (int j = 0; j<q; j++)
                b[i][j] = sc.nextInt();
        if (m==p && n == q) {
            int c[][] = new int[m][n];
            for (int i=0; i<m; i++) {
                for (int j =0; j<n-1; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                    System.out.println(c[i][j] + " ");
                }
                c[i][n-1] = a[i][n-1] + b[i][n-1];
                System.out.println(c[i][n-1]);
        }
    }    else{
            System.out.println("not possible");
        }
    }
}



        
