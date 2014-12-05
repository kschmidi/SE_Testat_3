package car;

import static org.junit.Assert.*;

import org.junit.Test;

import car.decorator.decorators.Aircondition;
import car.decorator.decorators.Panorama;
import car.decorator.decorators.Seat_Heat;

public class Car_Test{

	@Test
	public void test_create_normal_car(){
		String text = "A nice blue Car";
		int price = 15000;
		Vehicle c = new Car(text, price);
		assertEquals(text, c.getDescription());
		assertEquals(price, c.getPrice());
	}
	
	@Test
	public void test_create_car_with_AC() {
		String text = "A nice red Car";
		int price = 17000;
		Vehicle c = new Aircondition(new Car(text, price));
		assertEquals(text + " with an Aircondition.", c.getDescription());
		assertEquals(price + 300, c.getPrice());
	}
	

	@Test
	public void test_create_car_with_Panorama() {
		String text = "A nice green Car";
		int price = 22000;
		Vehicle c = new Panorama(new Car(text, price));
		assertEquals(text + " with Panorama.", c.getDescription());
		assertEquals(price + 1000, c.getPrice());
	}
	
	@Test
	public void test_create_car_with_Seat_Heat() {
		String text = "A nice violet Car";
		int price = 25000;
		Vehicle c = new Seat_Heat(new Car(text, price));
		assertEquals(text + " with Seat Heat.", c.getDescription());
		assertEquals(price + 500, c.getPrice());
	}
}
