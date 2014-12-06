package car.decorator.decorators;

import car.Car_Template;
import car.decorator.Car_Decorator;


public class Car_Aircondition_Decorator extends Car_Decorator{
	public static final int DEFAULT_UPCHARGE = 700;
	public static final String DEFAULT_TEXT = " with an Aircondition";
	
	private boolean is_AC_on;
	
	public Car_Aircondition_Decorator(Car_Template car){
		this(car, DEFAULT_TEXT, DEFAULT_UPCHARGE);
	}
	
	public Car_Aircondition_Decorator(Car_Template car, String description, int upcharge){
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
	
	public boolean is_AC_on() {
		return is_AC_on;
	}
	
	public void turn_AC_on() {
		is_AC_on = true;
	}
	
	public void turn_AC_off() {
		is_AC_on = false;
	}
}
