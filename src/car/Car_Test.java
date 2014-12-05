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
		default_price = Vehicle.default_Price;
		default_Text = Vehicle.default_Text;
	}

	@Test
	public void test_create_normal_car(){
		Vehicle c = new Car(default_Text, default_price);
		
		assertEquals(default_Text, c.getDescription());
		assertEquals(default_price, c.getPrice());
	}
	
	@Test
	public void test_create_car_with_AC() {
		Vehicle c = new Aircondition(new Car(default_Text, default_price));
		int price = default_price + Aircondition.upcharge;
		
		assertEquals(default_Text + " with an Aircondition", c.getDescription());
		assertEquals(price, c.getPrice());
	}
	

	@Test
	public void test_create_car_with_Panorama() {
		Vehicle c = new Panorama(new Car(default_Text, default_price));
		int price = default_price + Panorama.upcharge;
		
		assertEquals(default_Text + " with Panorama", c.getDescription());
		assertEquals(price, c.getPrice());
	}
	
	@Test
	public void test_create_car_with_Seat_Heat() {
		Vehicle c = new Seat_Heat(new Car(default_Text, default_price));
		int price = default_price + Seat_Heat.upcharge;
		
		assertEquals(default_Text + " with Seat Heat", c.getDescription());
		assertEquals(price, c.getPrice());
	}
	
	@Test
	public void test_meth_AC() {
		Aircondition car = new Aircondition(new Car(default_Text, default_price));
		
		assertFalse(car.is_AC_on());
		car.turn_AC_on();
		assertTrue(car.is_AC_on());
	}
	
	@Test
	public void test_meth_Pano() {
		Panorama car = new Panorama(new Car(default_Text, default_price));
		
		assertFalse(car.is_panorama_open());
		car.open_panorama();
		assertTrue(car.is_panorama_open());
	}
	
	@Test
	public void test_meth_Seat() {
		Seat_Heat car = new Seat_Heat(new Car(default_Text, default_price));
		
		assertFalse(car.is_seat_heat_on());
		car.turn_seat_heat_on();
		assertTrue(car.is_seat_heat_on());
	}
	
	@Test
	public void test_create_car_with_AC_And_Panorma() {
		Vehicle c = Car_Simple_Factory.make_Car_with_AC_and_Panorama();
		int price = default_price + Aircondition.upcharge + Panorama.upcharge;

		assertEquals(default_Text + " with Panorama with an Aircondition", c.getDescription());
		assertEquals(price, c.getPrice());
	}
	
	@Test
	public void test_create_car_with_AC_And_Panorma_And_Seat_Heat() {
		Vehicle c = Car_Simple_Factory.make_Car_with_AC_and_Panorama_and_Seat_Heat();
		int price = default_price + Aircondition.upcharge + Panorama.upcharge + Seat_Heat.upcharge;
		
		assertEquals(default_Text + " with Seat Heat with Panorama with an Aircondition", c.getDescription());
		assertEquals(price, c.getPrice());
	}
	
	@Test
	public void test_create_car_with_AC_And_Seat_Heat() {
		Vehicle c = Car_Simple_Factory.make_Car_with_AC_and_Seat_Heat();
		int price = default_price + Aircondition.upcharge + Seat_Heat.upcharge;
		
		assertEquals(default_Text + " with Seat Heat with an Aircondition", c.getDescription());
		assertEquals(price, c.getPrice());
	}
	
	@Test
	public void test_create_car_with_Seat_Heat_And_Panorama() {
		Vehicle c = Car_Simple_Factory.make_Car_with_Seat_Heat_and_Panorama();
		int price = default_price + Seat_Heat.upcharge + Panorama.upcharge;
		
		assertEquals(default_Text + " with Panorama with Seat Heat", c.getDescription());
		assertEquals(price, c.getPrice());
	}
}
