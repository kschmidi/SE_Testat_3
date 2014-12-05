package car.decorator.decorators;

import car.Car;
import car.decorator.Car_Decorator;


public class Panorama extends Car_Decorator{
	
	private Car car;
	
	public Panorama(Car c){
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
