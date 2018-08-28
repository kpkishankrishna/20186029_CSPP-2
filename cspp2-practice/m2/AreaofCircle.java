import java.util.Scanner;
public class AreaofCircle
{
	Scanner a = new Scanner(System.in);
	int r = a.nextInt();
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		int r = a.nextInt();
		System.out.println(areaofcircle(r));
	}
	public static double pi()
	{
		return 3.14f;
	}
	public static double areaofcircle(int r)
	{
		double area = pi()*r*r;
		return area;
	}

}