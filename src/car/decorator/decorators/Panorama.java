package car.decorator.decorators;

import car.Vehicle;
import car.decorator.Car_Decorator;


public class Panorama extends Car_Decorator{
	
	private Vehicle car;
	
	public Panorama(Vehicle c){
		car = c;
	}

	@Override
	public String getDescription(){
		return car.getDescription() + " with Panorama.";
	}

	@Override
	public int getPrice(){
		return car.getPrice() + 1000;
	}

}
