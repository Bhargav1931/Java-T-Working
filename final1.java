class Fin {
	final int speed=100;
	void run(){
	    speed = 200;
		System.out.println("The Running speed: ");
		System.out.println(speed);
	}
}
class Hell {
	public static void main(String args[])
	{
		Fin tm = new Fin();
		tm.run();
	}
}