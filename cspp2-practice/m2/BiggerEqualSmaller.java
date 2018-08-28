import java.util.Scanner;
public class BiggerEqualSmaller
{
	
	public static void main(String[] args)
	{
		Scanner sa = new Scanner(System.in);
		int a = sa.nextInt();
		int b = sa.nextInt();
		System.out.println(biggerequalsmall(a,b));
	}
	public static String biggerequalsmall(int a, int b)
	{
		if (a>b)
			return ("Bigger");
		else if (a==b)
			return ("Equal");
		else if (a<b)
			return ("Smaller");
		else;
			return ("Invalid Input");
	}
}