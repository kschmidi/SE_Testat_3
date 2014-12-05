package car.decorator.decorators;

import car.Vehicle;
import car.decorator.Car_Decorator;


public class Panorama extends Car_Decorator{
	public static int upcharge = 1000;
	
	private Vehicle car;
	private boolean is_panorama_open;
	
	public Panorama(Vehicle c){
		car = c;
		is_panorama_open = false;
	}

	@Override
	public String getDescription(){
		return car.getDescription() + " with Panorama";
	}

	@Override
	public int getPrice(){
		return car.getPrice() + upcharge;
	}
	
	public boolean is_panorama_open() {
		return is_panorama_open;
	}
	
	public void open_panorama() {
		is_panorama_open = true;
	}
	
	public void close_panorama() {
		is_panorama_open = false;
	}

}
