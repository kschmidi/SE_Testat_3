package car.decorator.decorators;

import car.Vehicle;
import car.decorator.Car_Decorator;


public class Seat_Heat extends Car_Decorator{
	
	private Vehicle car;
	
	public Seat_Heat(Vehicle c){
		car = c;
	}

	@Override
	public String getDescription(){
		return car.getDescription() + " with Seat Heat.";
	}

	@Override
	public int getPrice(){
		return car.getPrice() + 500;
	}

}
