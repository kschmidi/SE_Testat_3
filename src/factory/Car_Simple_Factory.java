package factory;

import car.Car;
import car.Vehicle;
import car.decorator.decorators.Aircondition;
import car.decorator.decorators.Panorama;
import car.decorator.decorators.Seat_Heat;

public class Car_Simple_Factory{
	
	public static String default_Text = "A nice Car";
	public static int default_Price = 20000;
	
	public static Vehicle make_Car_with_AC_and_Panorama() {
		return new Aircondition(new Panorama(new Car(default_Text, default_Price)));
	}
	
	public static Vehicle make_Car_with_AC_and_Panorama_and_Seat_Heat() {
		return new Aircondition(new Panorama(new Seat_Heat(new Car (default_Text, default_Price))));
	}
	
	public static Vehicle make_Car_with_AC_and_Seat_Heat() {
		return new Aircondition(new Seat_Heat(new Car(default_Text, default_Price)));
	}
	
	public static Vehicle make_Car_with_Seat_Heat_and_Panorama() {
		return new Seat_Heat(new Panorama(new Car(default_Text, default_Price)));
	}
}
