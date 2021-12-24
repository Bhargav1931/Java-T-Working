/* Program to Fibonnaci Numbers */
import java.util.Scanner;
class Fibonnaci
{
	void fibo(int total)
	{
		int res;
		int a =0;
		int b= 1;
		int count =2;
		System.out.println("The FIbonnaci Numbers are: \n");
		System.out.println(a+"\n");
		System.out.println(b+"\n");
		for (count=2;count<total;count++)
		{
			res=a+b;
			System.out.println(res+"\n");
			a=b;
			b=res;
		}		
	}
	public static void main (String args[])
	{
		Scanner num = new Scanner(System.in);
		Fibonnaci thrinadh = new Fibonnaci();
		System.out.println("How many Fibonnaci do you need: ");
		int number = num.nextInt();
		thrinadh.fibo(number);
	}
}