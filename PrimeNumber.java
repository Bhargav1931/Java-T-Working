/* Test Whether given number is Prime or not */
import java.util.Scanner;
class PrimeNumber
{
	void primeNumber(int num)
	{
		int n =2;
		int test=1;
		while (n<num)
		{
			if (num%n==0)
			{
				test=0;
				break;
			}
			n=n+1;
		}
		if (test==0)
			System.out.println("Not A Prime Number");
		else
			System.out.println("Prime Number");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		PrimeNumber object = new PrimeNumber();
		System.out.println("Enter a number to test");
		int number = sc.nextInt();
		object.primeNumber(number);
	}
}