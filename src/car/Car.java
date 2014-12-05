package car;

public class Car{
	private String	description;
	private int		price;

	public Car(String description, int price){
		this.description = description;
		this.price = price;
	}

	public String getDescrition(){
		return description;
	}

	public int getPrice(){
		return price;
	}
}