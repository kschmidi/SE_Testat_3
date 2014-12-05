package factory;

import car.Car;
import car.Car_Template;
import car.decorator.decorators.Aircondition;
import car.decorator.decorators.Seat_Heat;

public class Car_Simple_Factory{
	
	public static Car_Template make_Car_With_AC_And_Panorama() {
		return new Seat_Heat(new Aircondition(new Car("A nice blue Car", 20000)));
	}
	
	public static Car make_Car_With_AC_And_Panorama_And_Seat_Heat() {
		return null;
	}
	
	public static Car make_Car_With_AC_And_Seat_Heat() {
		return null;
	}
	
	public static Car make_Car_With_Seat_Heat_And_Panorama() {
		return null;
	}
}
