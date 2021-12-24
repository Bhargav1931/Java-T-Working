/* Using Static Final Keyword */
class StaticTest 
{
	static final int value; // Not yet initialized and can only be done in static block
	static final String name;
	static {
		value = 30;  // Value initialization in the static block;
	    // name = "Thrinadh";
	}      
	static {
		// value = 500;
		name  = "Thrinadh";
	}
	public static void main(String args[])
	{
		System.out.println("Value: "+value);
		System.out.println("Name: "+name);
		System.out.println("Value got initialized in the static block ");
	}
}
/* With static we can assign only once.
 *After assigning the value in one static block we cannot change it in another static block */
 