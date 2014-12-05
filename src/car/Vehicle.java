package car;

public abstract class Vehicle{
	public static String default_Text = "A nice Car";
	public static int default_Price = 20000;
	
	public abstract String getDescription();
	public abstract int getPrice();
}
