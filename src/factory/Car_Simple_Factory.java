package factory;

import car.Car;
import car.Vehicle;
import car.decorator.decorators.Aircondition;
import car.decorator.decorators.Panorama;
import car.decorator.decorators.Seat_Heat;

public class Car_Simple_Factory{
	
	private static String default_Text = "A nice Car";
	private static int default_Price = 20000;
	
	public static Vehicle make_Car_With_AC_And_Panorama() {
		return new Aircondition(new Panorama(new Car(default_Text, default_Price)));
	}
	
	public static Vehicle make_Car_With_AC_And_Panorama_And_Seat_Heat() {
		return new Aircondition(new Seat_Heat(new Panorama(new Car (default_Text, default_Price))));
	}
	
	public static Vehicle make_Car_With_AC_And_Seat_Heat() {
		return new Aircondition(new Seat_Heat(new Car(default_Text, default_Price)));
	}
	
	public static Vehicle make_Car_With_Seat_Heat_And_Panorama() {
		return new Seat_Heat(new Panorama(new Car(default_Text, default_Price)));
	}
}
