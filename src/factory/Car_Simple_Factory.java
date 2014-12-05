package factory;

import car.Car;
import car.Vehicle;
import car.decorator.decorators.*;

public class Car_Simple_Factory{
	public static Vehicle make_Car_with_AC_and_Panorama() {
		return new Aircondition(new Panorama(new Car(Vehicle.default_Text, Vehicle.default_Price)));
	}
	
	public static Vehicle make_Car_with_AC_and_Panorama_and_Seat_Heat() {
		return new Aircondition(new Panorama(new Seat_Heat(new Car (Vehicle.default_Text, Vehicle.default_Price))));
	}
	
	public static Vehicle make_Car_with_AC_and_Seat_Heat() {
		return new Aircondition(new Seat_Heat(new Car(Vehicle.default_Text, Vehicle.default_Price)));
	}
	
	public static Vehicle make_Car_with_Seat_Heat_and_Panorama() {
		return new Seat_Heat(new Panorama(new Car(Vehicle.default_Text, Vehicle.default_Price)));
	}
}
