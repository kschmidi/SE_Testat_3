package car.decorator;

import car.Car_interface;

public class Car_Decorator implements Car_interface{
	protected String description;
	protected int price;
	
	private Car_interface car;
	
	public Car_Decorator(Car_interface c, String description, int price){
		car = c;
		this.description = description;
		this.price = price;
	}

	@Override
	public String getDescription(){
		return car.getDescription();
	}

	@Override
	public int getPrice(){
		return car.getPrice();
	}
}
