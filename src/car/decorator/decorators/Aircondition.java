package car.decorator.decorators;

import car.Car_Template;
import car.decorator.Car_Decorator;


public class Aircondition extends Car_Decorator{
	private Car_Template car;
	
	public Aircondition(Car_Template c){
		car = c;
	}
	@Override
	public String getDescrition(){
		return car.getDescrition() + " with an Aircondition.";
	}

	@Override
	public int getPrice(){
		return car.getPrice() + 300;
	}

}
