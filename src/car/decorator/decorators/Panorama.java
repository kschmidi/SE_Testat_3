package car.decorator.decorators;

import car.Car_interface;
import car.decorator.Car_Decorator;

public class Panorama extends Car_Decorator{
	public static final int DEFAULT_UPCHARGE = 1000;
	public static final String DEFAULT_TEXT = " with Panorama";
	
	private boolean	is_panorama_open;

	public Panorama(Car_interface c){
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

	public boolean is_panorama_open(){
		return is_panorama_open;
	}

	public void open_panorama(){
		is_panorama_open = true;
	}

	public void close_panorama(){
		is_panorama_open = false;
	}
}
