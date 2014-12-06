package car.decorator;

import car.Car_Template;

public class Car_Decorator implements Car_Template{
	protected String description;
	protected int price;
	
	private Car_Template car;
	
	public Car_Decorator(Car_Template c, String description, int price){
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
