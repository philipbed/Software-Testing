package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import junit.framework.TestCase;

public class InventoryTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testStaticSingletonDoesNotRevertValues() {

		Inventory inventory = new Inventory();

		inventory.setChocolate(30);
		inventory.setCoffee(30);
		inventory.setMilk(30);
		inventory.setSugar(30);

		Inventory newInventory = new Inventory();

		assertEquals(30, inventory.getChocolate());
		assertEquals(30, inventory.getCoffee());
		assertEquals(30, inventory.getMilk());
		assertEquals(30, inventory.getSugar());

	}

	public void testStaticSingletonIsSameObject() {

		Inventory oldInventory = new Inventory();

		Inventory newInventory = new Inventory();

		assertEquals(oldInventory, newInventory);
	}

	public void testAddChocolate() {

		Inventory inventory = new Inventory();

		try {
			inventory.addChocolate("-1");
			fail("Add Chocolate should throw InventoryException");
		} catch (InventoryException exception) {
			
		}
	}



}
