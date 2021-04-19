package at.htlklu;

public class FilterMachine extends CoffeeMachine{

	public FilterMachine(String brand, int cupAmount, int maxWater, int maxCoffee, boolean isFilled) {
		super(brand, 10, maxWater, maxCoffee, isFilled);
		// TODO Auto-generated constructor stub
	}
	public FilterMachine(String brand) {
		super(brand, 10);
	}
	@Override
	public void fill() {
		// TODO Auto-generated method stub
		super.fill();
		super.setMaxWater(250);
		super.setMaxCoffee(80);
	}

}
