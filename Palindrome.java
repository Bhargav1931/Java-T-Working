/*Program to test Palindrome */
class Palindrome
{
	void palindrome (int number)
	{
		int result =0;
		int backup  = number;
		int digit;
		while (backup>0)
		{
			digit = number/10;
			result=(result*10)+digit;
			backup=backup%10;
		}
		if (number==result)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
	public static void main
}