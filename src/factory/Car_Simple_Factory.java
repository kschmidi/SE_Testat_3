package factory;

import car.Car;
import car.Car_Template;
import car.decorator.decorators.*;

public class Car_Simple_Factory{
	public static Car_Template make_Car_with_AC_and_Panorama() {
		return new Car_Aircondition_Decorator(new Car_Panorama_Decorator(new Car(Car_Template.DEFAULT_TEXT, Car_Template.DEFAULT_PRICE)));
	}
	
	public static Car_Template make_Car_with_AC_and_Panorama_and_Seat_Heat() {
		return new Car_Aircondition_Decorator(new Car_Panorama_Decorator(new Car_Seat_Heat_Decorator(new Car (Car_Template.DEFAULT_TEXT, Car_Template.DEFAULT_PRICE))));
	}
	
	public static Car_Template make_Car_with_AC_and_Seat_Heat() {
		return new Car_Aircondition_Decorator(new Car_Seat_Heat_Decorator(new Car(Car_Template.DEFAULT_TEXT, Car_Template.DEFAULT_PRICE)));
	}
	
	public static Car_Template make_Car_with_Seat_Heat_and_Panorama() {
		return new Car_Seat_Heat_Decorator(new Car_Panorama_Decorator(new Car(Car_Template.DEFAULT_TEXT, Car_Template.DEFAULT_PRICE)));
	}
}
