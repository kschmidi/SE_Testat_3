package car.decorator.decorators;

import car.Car_interface;
import car.decorator.Car_Decorator;


public class Car_Seat_Heat_Decorator extends Car_Decorator{
	public static final int DEFAULT_UPCHARGE = 700;
	public static final String DEFAULT_TEXT = " with Seat Heat";
	
	private boolean is_seat_heat_on;
	
	public Car_Seat_Heat_Decorator(Car_interface c){
		super(c, DEFAULT_TEXT, DEFAULT_UPCHARGE);
	}

	@Override
	public String getDescription(){
		return super.getDescription() + description;
	}

	@Override
	public int getPrice(){
		return super.getPrice() + price;
	}

	public boolean is_seat_heat_on(){
		return is_seat_heat_on;
	}
	
	public void turn_seat_heat_on() {
		is_seat_heat_on = true;
	}
	
	public void turn_seat_heat_off() {
		is_seat_heat_on = false;
	}
}
