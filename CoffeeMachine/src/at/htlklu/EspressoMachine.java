package at.htlklu;

public class EspressoMachine extends CoffeeMachine{
	
	public EspressoMachine(String brand, int cupAmount, int maxWater, int maxCoffee, boolean isFilled) {
		super(brand, 2, maxWater, maxCoffee, isFilled);
		// TODO Auto-generated constructor stub
	}
	public EspressoMachine(String brand) {
		super(brand, 2);
	}
	@Override
	public void fill() {
		// TODO Auto-generated method stub
		super.fill();
		super.setMaxWater(1000);
		super.setMaxCoffee(150);
	}
}
