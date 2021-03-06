package car.decorator.decorators;

import car.Car_Template;
import car.decorator.Car_Decorator;

public class Car_Panorama_Decorator extends Car_Decorator{
	public static final int DEFAULT_UPCHARGE = 1000;
	public static final String DEFAULT_TEXT = " with Panorama";
	
	private boolean	is_panorama_open;

	public Car_Panorama_Decorator(Car_Template car){
		this(car, DEFAULT_TEXT, DEFAULT_UPCHARGE);
	}
	
	public Car_Panorama_Decorator(Car_Template car, String description, int upcharge){
		super(car, description, upcharge);
	}

	@Override
	public String getDescription(){
		return super.getDescription() + description;
	}

	@Override
	public int getPrice(){
		return super.getPrice() + price;
	}

	public boolean is_panorama_open(){
		return is_panorama_open;
	}

	public void open_panorama(){
		is_panorama_open = true;
	}

	public void close_panorama(){
		is_panorama_open = false;
	}
}
