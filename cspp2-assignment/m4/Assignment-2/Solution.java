import java.util.*;
public class Solution {
    /* Fill the main function to print resultant of addition of matrices*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        if ((m != p) || (n != q))
            System.out.println("not possible");                 
        int a[][] = new int[m][n];
        for (int i = 0; i<m; i++)
            for (int j = 0; j<n; j++)
                a[i][j] = sc.nextInt();
        int b[][] = new int[p][q];
        for (int i = 0; i<m; i++)
            for (int j = 0; j<n; j++)
                b[i][j] = sc.nextInt();
        int c[][] = new int[m][n];
        for (int i = 0; i<m; i++)
            for (int j = 0; j<n; j++)
                c[i][j] = a[i][j] + b[i][j];
        for (int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println( );
        }



        
    }
}