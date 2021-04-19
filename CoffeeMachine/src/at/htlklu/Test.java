package at.htlklu;

public class Test {
	public static void main(String[] args) {
		CoffeeMachine a = new FilterMachine("Melitta");
		CoffeeMachine b = new EspressoMachine("Bialetti");
		
		a.fill();
		a.cook();
		a.setCupAmount(0);
		a.setFilled(false);
		a.cook();
		
		b.fill();
		b.cook();
		
		CoffeeMachine em = new EspressoMachine("HP", 2, 250, 80, true);
		em.cook();
		em.setFilled(false);
		em.cook();
		
		CoffeeMachine fm = new FilterMachine("Lenovo", 10, 1000, 150, true);
		fm.cook();
		fm.setFilled(false);
		fm.cook();
		
	}
}
