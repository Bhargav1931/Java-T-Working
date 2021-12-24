class student {
	final void study()
	{
		System.out.println("Leave me alone: \n");
		System.out.println("Final methods can be inherited but cannot be overriden: \n");
	}
}
class teacher extends student {
	public static void main(String args[])
	{
		new teacher().study();
	}
}
/* We need to create another class object inside the main method even though we have inherited with "extend" keyword */
