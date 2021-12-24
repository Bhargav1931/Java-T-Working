/* To catch the arthimetic exception */
class Expect
{
	public static void main(String args[])
	{
		try 
		{
			int data=100/0;
		}
		catch (ArithmeticException thrinadh)
		{
			System.out.println(thrinadh);
		}
		System.out.println("Testing the Try and catch exceptions: ");
	}
}