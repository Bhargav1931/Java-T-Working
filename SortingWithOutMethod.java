/* Sorting without using Method */
import java.util.Scanner;

class SortingWithOutMethod
{
	public static void main(String args[])
	{
		Scanner mt = new Scanner(System.in);
		int i;
		System.out.println("Enter the size of Array: ");
		i = mt.nextInt();
		int[] a;
		a = new int [i];
		int j;
		int k;
		int temp;
		// For values are input to the Array;
		for (j=0;j<i;j++)
		{
			System.out.println("Enter the value: ");
			a[j]=mt.nextInt();
		}
		System.out.println("The values are: ");
		for (j=0;j<i;j++)
			System.out.println(a[j]);
		for (j=0;j<i;j++)
		{
			for (k=j+1;k<i;k++)
			{
				if (a[j]>a[k])
				{
					temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
			}
		}
		System.out.println("Ascending order: ");
		for (j=0;j<i;j++)
		{
			System.out.println(a[j]);
		}
	}
}

			