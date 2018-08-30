import java.util.*;
class FirstLast6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i<n; i++)
            a[i] = sc.nextInt();
        // for (int i = 0; i<n; i++)
        //  System.out.println(a[i]);
        if (a[0] == 6) {
            System.out.println("True");
        }
        else if (a[a.length-1] == 6){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
