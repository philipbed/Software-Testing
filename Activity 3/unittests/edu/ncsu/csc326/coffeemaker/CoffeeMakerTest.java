package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import junit.framework.TestCase;

/**
 * 
 * @author Sarah Heckman
 *
 * Unit tests for CoffeeMaker class.
 */
public class CoffeeMakerTest extends TestCase {
	
	private CoffeeMaker cm;
	private Recipe r1;
	private Recipe r2;
	private Recipe r3;
	private Recipe r4;

	protected void setUp() throws Exception {
		cm = new CoffeeMaker();
		
		//Set up for r1
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setAmtChocolate("0");
		r1.setAmtCoffee("3");
		r1.setAmtMilk("1");
		r1.setAmtSugar("1");
		r1.setPrice("50");
		
		//Set up for r2
		r2 = new Recipe();
		r2.setName("Mocha");
		r2.setAmtChocolate("20");
		r2.setAmtCoffee("3");
		r2.setAmtMilk("1");
		r2.setAmtSugar("1");
		r2.setPrice("75");
		
		//Set up for r3
		r3 = new Recipe();
		r3.setName("Latte");
		r3.setAmtChocolate("0");
		r3.setAmtCoffee("3");
		r3.setAmtMilk("3");
		r3.setAmtSugar("1");
		r3.setPrice("100");
		
		//Set up for r4
		r4 = new Recipe();
		r4.setName("Hot Chocolate");
		r4.setAmtChocolate("4");
		r4.setAmtCoffee("0");
		r4.setAmtMilk("1");
		r4.setAmtSugar("1");
		r4.setPrice("65");
		
		super.setUp();
	}
	
	public void testAddInventory() {
		try {
			String coffee = "4";
			String milk = "7";
			String sugar = "3";
			String chocolate = "9";

			cm.addInventory(coffee,milk,sugar,chocolate);
			// check that the inventory actually contains what was just added
			// return from toString:
//			StringBuffer buf = new StringBuffer();
//			buf.append("Coffee: ");
//			buf.append(getCoffee());
//			buf.append("\n");
//			buf.append("Milk: ");
//			buf.append(getMilk());
//			buf.append("\n");
//			buf.append("Sugar: ");
//			buf.append(getSugar());
//			buf.append("\n");
//			buf.append("Chocolate: ");
//			buf.append(getChocolate());
//			buf.append("\n");

			String ret = cm.checkInventory();
			String newLine[]= ret.split("\n");

			// Inventory initially has 15 in all slots. assert against 15 + whatever is added
			assertEquals("19", newLine[0].split(": ")[1]);
			assertEquals("22", newLine[1].split(": ")[1]);
			assertEquals("18", newLine[2].split(": ")[1]);
			assertEquals("24", newLine[3].split(": ")[1]);

	} catch (InventoryException e) {
			fail("InventoryException should not be thrown");
		}
	}
	
	public void testAddInventoryException() {
		try {
			cm.addInventory("4", "-1", "asdf", "3");
			fail("InventoryException should be thrown");
		} catch (InventoryException e) {
			//success if thrown
		}
	}
	
	public void testMakeCoffee() {
		boolean result = cm.addRecipe(r1);
		assertTrue(result);
		assertEquals(0, cm.makeCoffee(0, 50));
	}

}
