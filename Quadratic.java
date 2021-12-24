// Quadratic application in java 
import java.util.*;
import java.lang.Math;

class Quadratic 
{
	public static void main(String args[])
	{
		Scanner tm = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the co-efficient of x^2 and x and constant: \n");
		a=tm.nextInt();
		b=tm.nextInt();
		c=tm.nextInt();
		Findme mt = new Findme();
		mt.knowme(a,b,c);
	}
}
class Findme 
{
	void knowme (int a, int b, int c)
	{
		float result;
		float result1,result2;
		float disc;
		disc = (b*b)-(4*a*c);
		if (disc >0)
		{
			result1=(-b + (Math.sqrt(disc)))/2*a;
			result2=(-b - (Math.sqrt(disc)))/2*a;
			System.out.println("Root: " + result1 );
			System.out.println("Root: " +  result2);
		}
		else if (disc==0)
		{
			result1= (-b)/(2*a);
			result2= (-b)/(2*a);
			System.out.println("Root: " + result1);
			System.out.println("Root: " + result2);
		}
		else
		{
			disc = disc * (-1);
			result1= Math.sqrt(disc)/(2*a);
			result2 = (-b)/(2*a);
			System.out.println("Root: " + result1 + "+" + result2);
			System.out.println("Root: " + result1 + "-" + result2);
		}
	}
}