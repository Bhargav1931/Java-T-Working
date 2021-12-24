/* Even odd number with functions */
import java.util.*;
class EvenOdd1
{
	public static void main(String args[])
	{
		Scanner tm = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = tm.nextInt();
		Test1 mt = new Test1();
		int n;
		n=mt.number(num);
		if (n==1)
			System.out.println("It is an Even Number: ");
		else
			System.out.println("It is an Odd Number : ");
	}
}
class Test1
{
	int number(int a)
	{	
		if (a%2==0)
			return 1;
		else 
			return 0;
	}
}		