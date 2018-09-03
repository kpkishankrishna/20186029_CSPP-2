import java.util.*;
public class StudentDetails {
		String name, rollNumber;
		float average[];
		float finalaverage;
	StudentDetails (String name, String rollNumber, float[] average) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.average = average;
	}
	float average() {
		float sum = 0;
		for (float i : average) {
			sum = sum + i;
		}
		finalaverage = sum/average.length;
		return finalaverage;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String rollNumber = sc.nextLine();
		System.out.println("Enter the number of subjects");
		int n = sc.nextInt();
		System.out.println("enter marks");
		float a[] = new float[n];
		for (int i = 0; i<n; i++)
		{
			a[i] = sc.nextFloat();
		}
		StudentDetails s1 = new StudentDetails(name, rollNumber, a);
		s1.average();
		s1.displaydetails();

	}
	void displaydetails() {
		System.out.println(name);
		System.out.println(rollNumber);
		System.out.println(finalaverage);
	}



}
