package coffeemachine;

public class CoffeeTouchScreenAdapter implements CoffeeMachineInterface{

	OldCoffeeMachine OldVendingMachine;
	
	CoffeeTouchScreenAdapter(OldCoffeeMachine oldCoffee){
		OldVendingMachine = oldCoffee;
	}
	
	@Override
	public String chooseFirstSelection() {
		return OldVendingMachine.selectA();	
	}

	@Override
	public String chooseSecondSelection() {
		return OldVendingMachine.selectB();
	}

}