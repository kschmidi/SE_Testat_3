package car;

public class Car implements Car_interface{
	private String	description;
	private int		price;

	public Car(String description, int price){
		this.description = description;
		this.price = price;
	}

	public String getDescription(){
		return description;
	}

	public int getPrice(){
		return price;
	}
}