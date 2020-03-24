package coffeemachine;

import static org.junit.Assert.*;


import org.junit.Test;

public class CoffeeTouchScreenAdapterTest {

	@Test
	public void testCoffeeTouchScreenAdapter() {
		OldCoffeeMachine  machine = new OldCoffeeMachine();
		CoffeeTouchScreenAdapter adapter = new CoffeeTouchScreenAdapter(machine);
		
		 assertNotNull(adapter);
	}

	@Test
	public void testChooseFirstSelection() {
		OldCoffeeMachine  machine = new OldCoffeeMachine();
		CoffeeTouchScreenAdapter adapter = new CoffeeTouchScreenAdapter(machine);
		assertEquals("You've selected option A.", adapter.chooseFirstSelection());
	}

	@Test
	public void testChooseSecondSelection() {
		OldCoffeeMachine  machine = new OldCoffeeMachine();
		CoffeeTouchScreenAdapter adapter = new CoffeeTouchScreenAdapter(machine);
		assertEquals("You've selected option B.", adapter.chooseSecondSelection());	
	}

}
