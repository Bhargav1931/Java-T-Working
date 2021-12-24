/* Program to find the largest Number of the 3*/
import java.util.Scanner;
class Largest
{
	int largest(int a, int b, int c)
	{
		if (a>b)
		{
			if (a>c)
				return a;
			else 
				return c;
		}
		else
		{
			if (b>c)
				return b;
			else
				return c;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Largest thrinadh= new Largest();
		System.out.println("Enter Number: ");
		int a = sc.nextInt();
		System.out.println("Enter Number: ");
		int b = sc.nextInt();
		System.out.println("Enter Number: ");
		int c = sc.nextInt();
		int result = thrinadh.largest(a,b,c);
		System.out.println("Largest Number: "+result);
	}
}