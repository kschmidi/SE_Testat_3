package car.decorator.decorators;

import car.Vehicle;
import car.decorator.Car_Decorator;


public class Seat_Heat extends Car_Decorator{
	public static int upcharge = 500;
	
	private Vehicle car;
	private boolean is_seat_heat_on;
	
	public Seat_Heat(Vehicle c){
		car = c;
		is_seat_heat_on = false;
	}

	@Override
	public String getDescription(){
		return car.getDescription() + " with Seat Heat";
	}

	@Override
	public int getPrice(){
		return car.getPrice() + 500;
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
