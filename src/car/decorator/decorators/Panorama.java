package car.decorator.decorators;

import car.Car_Template;
import car.decorator.Car_Decorator;


public class Panorama extends Car_Decorator{
	
	private Car_Template car;
	
	public Panorama(Car_Template c){
		car = c;
	}

	@Override
	public String getDescrition(){
		return car.getDescrition() + " with Panorama.";
	}

	@Override
	public int getPrice(){
		return car.getPrice() + 1000;
	}

}
