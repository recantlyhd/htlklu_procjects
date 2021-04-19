package at.htlklu;

public abstract class CoffeeMachine {

	private String brand;
	private int cupAmount;
	private int maxWater;
	private int maxCoffee;
	private boolean isFilled;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCupAmount() {
		return cupAmount;
	}

	public void setCupAmount(int cupAmount) {
		this.cupAmount = cupAmount;
	}

	public int getMaxWater() {
		return maxWater;
	}

	public void setMaxWater(int maxWater) {
		this.maxWater = maxWater;
	}

	public int getMaxCoffee() {
		return maxCoffee;
	}

	public void setMaxCoffee(int maxCoffee) {
		this.maxCoffee = maxCoffee;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	public CoffeeMachine(String brand, int cupAmount, int maxWater, int maxCoffee, boolean isFilled) {
		this.brand = brand;
		this.cupAmount = cupAmount;
		this.maxWater = maxWater;
		this.maxCoffee = maxCoffee;
		this.isFilled = isFilled;
	}
	public CoffeeMachine(String brand, int cupAmount) {
		this.cupAmount = cupAmount;
		this.brand = brand;
	}
	public void fill() {
		isFilled = true;
	}

	public void cook() {
		if (isFilled == true) {
			System.out.println("Die " + getClass().getSimpleName() + getBrand() + " bereitet" + getCupAmount() + "Tassen zu.");
			isFilled = false;
			maxWater = 0;
			maxCoffee = 0;
		} else {
			System.out.println("Die " + getClass().getSimpleName() + getBrand() + " ist nicht befüllt");
		}
	}

}
