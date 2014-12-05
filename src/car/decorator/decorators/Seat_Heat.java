package car.decorator.decorators;

import car.Car_Template;
import car.decorator.Car_Decorator;


public class Seat_Heat extends Car_Decorator{
	
	private Car_Template car;
	
	public Seat_Heat(Car_Template c){
		car = c;
	}

	@Override
	public String getDescrition(){
		return car.getDescrition() + " with seat heat.";
	}

	@Override
	public int getPrice(){
		return car.getPrice() + 500;
	}

}
