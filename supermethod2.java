/* Using Super Keyword */
import java.util.*;

class function
{
	String name = "Thrinadh";
	int salary = 200000;
}
class database extends function
{
	String name = "Thrinadhreddy Manubothu";
	void display()
	{
		System.out.println("Name: "+ name);
		System.out.println("Salray: "+salary);
	}
}
class data
{
	public static void main(String args[])
	{
		database tm = new database();
		tm.display();
	}
}

		