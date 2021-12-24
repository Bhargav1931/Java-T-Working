class student {
	final void study()
	{
		System.out.println("Please leave me");
	}
}
class teacher extends student 
{
	void study()   /* On executing this we get compilation error as methods declared with final variable cannot be changed */
	{
		// System.out.println("You need to Study Hard: ");
		System.out.println("Please leave me");
	}
}
class Heaven 
{
	public static void main(String args[])
	{
		teacher tm = new teacher();
		tm.study();
	}
}