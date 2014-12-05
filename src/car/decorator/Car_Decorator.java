package car.decorator;

import car.Car_Template;


public abstract class Car_Decorator extends Car_Template{
	public abstract String getDescrition();
	public abstract int getPrice();
}
