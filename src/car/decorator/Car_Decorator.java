package car.decorator;

import car.Vehicle;


public abstract class Car_Decorator extends Vehicle{
	public abstract String getDescription();
	public abstract int getPrice();
}
