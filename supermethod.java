/* Program for super class */
import java.util.*;

class Speed 
{
	int max_speed = 100;
}
class vehicle extends Speed
{
	int max_speed = 200;
	void display()
	{
		System.out.println("Speed: "+super.max_speed);
		System.out.println("Speed: "+max_speed);
	}
}
class Super1
{
	public static void main(String args[])
	{
		vehicle tm = new vehicle();
		tm.display();
		
	}
}
