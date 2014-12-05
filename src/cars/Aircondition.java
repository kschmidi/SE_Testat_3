package cars;

public class Aircondition extends Car_Decorator{
	private Car car;
	
	public Aircondition(Car c){
		car = c;
	}
	@Override
	public String getDescrition(){
		return car.getDescrition() + " with an Aircondition.";
	}

	@Override
	public int getPrice(){
		return car.getPrice() + 300;
	}

}
