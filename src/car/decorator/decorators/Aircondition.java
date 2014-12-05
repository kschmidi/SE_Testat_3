package car.decorator.decorators;

import car.Vehicle;
import car.decorator.Car_Decorator;


public class Aircondition extends Car_Decorator{
	public static int upcharge = 300;
	
	private Vehicle car;
	private boolean is_AC_on;
	
	public Aircondition(Vehicle c){
		car = c;
		is_AC_on = false;
	}
	@Override
	public String getDescription(){
		return car.getDescription() + " with an Aircondition";
	}

	@Override
	public int getPrice(){
		return car.getPrice() + upcharge;
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
