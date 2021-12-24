/* Program to print the tables */
import java.util.Scanner;
class Tables
{
	void table(int a , int b)
	{
		int num =1;
		int result;
		while (num<b+1)
		{
			result=a*num;
			/*System.out.println(a+"*"+num+"="+result );*/
		    System.out.print(result+"\n");
			num=num+1;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Tables thrinadh = new Tables();
		System.out.println("Enter the Tables you want to know: ");
		int a = sc.nextInt();
		System.out.println("How many tables do you need: ");
		int b = sc.nextInt();
		thrinadh.table(a , b);
	}
}