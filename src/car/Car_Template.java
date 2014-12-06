package car;

public interface Car_Template{
	public static final String DEFAULT_TEXT = "A nice Car";
	public static final int DEFAULT_PRICE = 20000;
	
	public abstract String getDescription();
	public abstract int getPrice();
}
