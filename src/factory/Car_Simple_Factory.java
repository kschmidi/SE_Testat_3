package factory;

import car.Car;
import car.Car_interface;
import car.decorator.decorators.*;

public class Car_Simple_Factory{
	public static Car_interface make_Car_with_AC_and_Panorama() {
		return new Car_Aircondition_Decorator(new Car_Panorama_Decorator(new Car(Car_interface.DEFAULT_TEXT, Car_interface.DEFAULT_PRICE)));
	}
	
	public static Car_interface make_Car_with_AC_and_Panorama_and_Seat_Heat() {
		return new Car_Aircondition_Decorator(new Car_Panorama_Decorator(new Car_Seat_Heat_Decorator(new Car (Car_interface.DEFAULT_TEXT, Car_interface.DEFAULT_PRICE))));
	}
	
	public static Car_interface make_Car_with_AC_and_Seat_Heat() {
		return new Car_Aircondition_Decorator(new Car_Seat_Heat_Decorator(new Car(Car_interface.DEFAULT_TEXT, Car_interface.DEFAULT_PRICE)));
	}
	
	public static Car_interface make_Car_with_Seat_Heat_and_Panorama() {
		return new Car_Seat_Heat_Decorator(new Car_Panorama_Decorator(new Car(Car_interface.DEFAULT_TEXT, Car_interface.DEFAULT_PRICE)));
	}
}
