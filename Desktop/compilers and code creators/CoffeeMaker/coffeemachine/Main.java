package coffeemachine;

public class Main {
	public static void main(String[] args) {
		CoffeeTouchScreenAdapter adapter = new CoffeeTouchScreenAdapter(new OldCoffeeMachine());
		adapter.chooseFirstSelection();
		adapter.chooseSecondSelection();
		
	}
}