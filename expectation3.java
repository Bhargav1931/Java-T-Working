/* To know the NumberFormatException */
class Except 
{
	public static void main(String args[])
	{
		String name= "Thrinadh";
		try 
		{
			int i = Integer.parseInt(name);
		}
		catch (NumberFormatException thrinadh) 
		{
			System.out.println(thrinadh);
			System.out.println("This occurs when when an attempt is made to convert a string with improper format into a numeric value. : ");
	        System.out.println("Unchecked one. It's runtime error: ");	
		}
	}
}