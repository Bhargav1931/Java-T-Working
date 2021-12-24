/* Sorting list in Java */
import java.util.*;

class Sorting
{
	public static void main(String args[]){
		Scanner tm = new Scanner(System.in);
		int i;
		System.out.println("Enter the size of array: ");
		i = tm.nextInt();
		int[] a;
		a = new int[i];
		int j;
		int k;
		int m;
		for (j=0;j<i;j++)
		{
			System.out.println("Enter the value in the Array: ");
			a[j] = tm.nextInt();
		}
		System.out.println("The values of Array are: ");
		for (j=0;j<i;j++)
		{
			System.out.println(a[j]);
		}
		// Sorting in Ascending order
		Arrays.sort(a);
		/*for (j=0;j<i-1;j++)
		{
			if (a[j]>a[j+1])
			{
				k=a[j];
				a[j]=a[j+1];
				a[j+1]=k;
			}
		}*/
		System.out.println("After Ascending Sorting: ");
		for (j=0;j<i;j++)
		{
			System.out.println(a[j]);
		}
	}
}
