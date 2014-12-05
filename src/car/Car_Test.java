package car;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import car.decorator.decorators.*;
import factory.Car_Simple_Factory;

public class Car_Test{
	private int default_price;
	private String default_Text;
	
	@Before
	public void setup() {
		default_price = Car_interface.DEFAULT_PRICE;
		default_Text = Car_interface.DEFAULT_TEXT;
	}

	@Test
	public void test_create_normal_car(){
		Car_interface c = new Car(default_Text, default_price);
		
		assertEquals(default_Text, c.getDescription());
		assertEquals(default_price, c.getPrice());
	}
	
	@Test
	public void test_create_car_with_AC() {
		Car_interface c = new Car_Aircondition_Decorator(new Car(default_Text, default_price));
		int price = default_price + Car_Aircondition_Decorator.DEFAULT_UPCHARGE;
		
		assertEquals(default_Text + Car_Aircondition_Decorator.DEFAULT_TEXT, c.getDescription());
		assertEquals(price, c.getPrice());
	}
	

	@Test
	public void test_create_car_with_Panorama() {
		Car_interface c = new Car_Panorama_Decorator(new Car(default_Text, default_price));
		int price = default_price + Car_Panorama_Decorator.DEFAULT_UPCHARGE;
		
		assertEquals(default_Text + Car_Panorama_Decorator.DEFAULT_TEXT, c.getDescription());
		assertEquals(price, c.getPrice());
	}
	
	@Test
	public void test_create_car_with_Seat_Heat() {
		Car_interface c = new Car_Seat_Heat_Decorator(new Car(default_Text, default_price));
		int price = default_price + Car_Seat_Heat_Decorator.DEFAULT_UPCHARGE;
		
		assertEquals(default_Text + Car_Seat_Heat_Decorator.DEFAULT_TEXT, c.getDescription());
		assertEquals(price, c.getPrice());
	}
	
	@Test
	public void test_meth_AC() {
		Car_Aircondition_Decorator car = new Car_Aircondition_Decorator(new Car(default_Text, default_price));
		
		assertFalse(car.is_AC_on());
		car.turn_AC_on();
		assertTrue(car.is_AC_on());
	}
	
	@Test
	public void test_meth_Pano() {
		Car_Panorama_Decorator car = new Car_Panorama_Decorator(new Car(default_Text, default_price));
		
		assertFalse(car.is_panorama_open());
		car.open_panorama();
		assertTrue(car.is_panorama_open());
	}
	
	@Test
	public void test_meth_Seat() {
		Car_Seat_Heat_Decorator car = new Car_Seat_Heat_Decorator(new Car(default_Text, default_price));
		
		assertFalse(car.is_seat_heat_on());
		car.turn_seat_heat_on();
		assertTrue(car.is_seat_heat_on());
	}
	
	@Test
	public void test_create_car_with_AC_And_Panorma() {
		Car_interface c = Car_Simple_Factory.make_Car_with_AC_and_Panorama();
		int price = default_price + Car_Aircondition_Decorator.DEFAULT_UPCHARGE + Car_Panorama_Decorator.DEFAULT_UPCHARGE;
		String text = default_Text + Car_Panorama_Decorator.DEFAULT_TEXT + Car_Aircondition_Decorator.DEFAULT_TEXT;

		assertEquals(text, c.getDescription());
		assertEquals(price, c.getPrice());
	}
	
	@Test
	public void test_create_car_with_AC_And_Panorma_And_Seat_Heat() {
		Car_interface c = Car_Simple_Factory.make_Car_with_AC_and_Panorama_and_Seat_Heat();
		int price = default_price + Car_Aircondition_Decorator.DEFAULT_UPCHARGE + Car_Panorama_Decorator.DEFAULT_UPCHARGE + Car_Seat_Heat_Decorator.DEFAULT_UPCHARGE;
		String text = default_Text + Car_Seat_Heat_Decorator.DEFAULT_TEXT + Car_Panorama_Decorator.DEFAULT_TEXT + Car_Aircondition_Decorator.DEFAULT_TEXT;
		
		assertEquals(text, c.getDescription());
		assertEquals(price, c.getPrice());
	}
	
	@Test
	public void test_create_car_with_AC_And_Seat_Heat() {
		Car_interface c = Car_Simple_Factory.make_Car_with_AC_and_Seat_Heat();
		int price = default_price + Car_Aircondition_Decorator.DEFAULT_UPCHARGE + Car_Seat_Heat_Decorator.DEFAULT_UPCHARGE;
		String text = default_Text + Car_Seat_Heat_Decorator.DEFAULT_TEXT + Car_Aircondition_Decorator.DEFAULT_TEXT;
		
		assertEquals(text, c.getDescription());
		assertEquals(price, c.getPrice());
	}
	
	@Test
	public void test_create_car_with_Seat_Heat_And_Panorama() {
		Car_interface c = Car_Simple_Factory.make_Car_with_Seat_Heat_and_Panorama();
		int price = default_price + Car_Seat_Heat_Decorator.DEFAULT_UPCHARGE + Car_Panorama_Decorator.DEFAULT_UPCHARGE;
		String text = default_Text + Car_Panorama_Decorator.DEFAULT_TEXT + Car_Seat_Heat_Decorator.DEFAULT_TEXT;
		
		assertEquals(text, c.getDescription());
		assertEquals(price, c.getPrice());
	}
}
