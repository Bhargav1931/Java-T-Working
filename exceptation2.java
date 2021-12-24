/* To understand the Null Pointer Exception */
/* To catch the arthimetic exception */
class Expect
{
	public static void main(String args[])
	{
		String data=null;
		try 
		{
			System.out.println(data.length());
		}
		catch (NullPointerException thrinadh)
		{
			System.out.println(thrinadh);
		}
		System.out.println("Testing the Try and catch exceptions for NullPointerException: ");
	}
}