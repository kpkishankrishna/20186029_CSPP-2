
import java.util.*;
public class Solution
{/*
	Fill this main function to print maximum of given array
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int a[] = new int[n];
		for(int i =0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		// System.out.println("//////");
		
		Arrays.sort(a);
		// System.out.println(Arrays.toString(a));
		// System.out.println("............");
		System.out.println(a[a.length-1]);
		

	}
}
