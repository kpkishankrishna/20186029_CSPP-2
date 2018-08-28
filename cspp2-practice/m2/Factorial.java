import java.util.Scanner;
public class Factorial
{
	
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		System.out.println(factorial(b));
	}
	public static int factorial(int a)
	{
		if (a == 1)
			return 1;
		int factorial = a*factorial(a-1);
		return factorial;
	}
}