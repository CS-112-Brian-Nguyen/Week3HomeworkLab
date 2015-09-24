import java.util.Scanner;

public class Week3LabHW
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double a, b;
		
		System.out.print("Please enter the first number: ");
		a = input.nextDouble();
		System.out.print("Please enter the second number: ");
		b = input.nextDouble();
		System.out.println("Adding the first value and second value: \n" + ( a + b) );
		System.out.println("Subtracting the first value and second value: \n" + ( a - b));
		System.out.println("Multiplying the first value and second value: \n" + ( a * b));
		System.out.println("Diving the first value and the second value: \n" + ( a / b));
	}

}
