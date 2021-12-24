/* To know the test Exception Propagation */
/* This works only for the unchecked Exceptation but for Checked Exceptions we need to use "throw keyword" to Throw exceptions*/

class TestExceptionPropagation1 {
	void m ()
	{
		int data  = 50/0;
	}
	void n()
	{
		m();
	}
	void p()
	{
		try 
		{
			n();
		}
		catch (Exception e)
		{
			System.out.println("Exception is about to sort: ");
		}
	}
	public static void main(String args[])
	{
		TestExceptionPropagation1 mt = new TestExceptionPropagation1();
		mt.p();
	}
}
/* https://www.geeksforgeeks.org/exception-propagation-java/ */