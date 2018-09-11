package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import junit.framework.TestCase;

public class InventoryTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testStaticSingletonDoesNotRevertValues() {

		Inventory inventory = Inventory.getInstance();
		inventory = resetInventory(inventory);

		inventory.setChocolate(30);
		inventory.setCoffee(30);
		inventory.setMilk(30);
		inventory.setSugar(30);

		Inventory newInventory = Inventory.getInstance();

		assertEquals(30, inventory.getChocolate());
		assertEquals(30, inventory.getCoffee());
		assertEquals(30, inventory.getMilk());
		assertEquals(30, inventory.getSugar());

	}

	public void testStaticSingletonIsSameObject() {

		Inventory oldInventory = Inventory.getInstance();

		Inventory newInventory = Inventory.getInstance();

		assertEquals(oldInventory, newInventory);
		assertEquals(oldInventory.hashCode(), newInventory.hashCode());
	}

	public void testAddNegativeChocolate() {

		Inventory inventory = Inventory.getInstance();
		inventory = resetInventory(inventory);

		try {
			inventory.addChocolate("-1");
			fail("Add Chocolate should throw InventoryException");
		} catch (InventoryException exception) {
			
		}
	}

	public void testAddPositiveChocolate() {

		Inventory inventory = Inventory.getInstance();
		inventory = resetInventory(inventory);

		try {
			inventory.addChocolate("1");
			assertEquals(16, inventory.getChocolate());
		} catch (InventoryException exception) {
			fail("Add Chocolate should not throw InventoryException with a positive integer passed in");
		}
	}

	public void testAddNonIntegerChocolate() {

		Inventory inventory = Inventory.getInstance();
		inventory = resetInventory(inventory);

		try {
			inventory.addChocolate("ee");
			fail("Add Chocolate should throw InventoryException due to bad input");
		} catch (InventoryException exception) {

		}
	}

	public void testAddNegativeCoffee() {

		Inventory inventory = Inventory.getInstance();
		inventory = resetInventory(inventory);

		try {
			inventory.addCoffee("-1");
			fail("Add Coffee should throw InventoryException");
		} catch (InventoryException exception) {

		}
	}

	public void testAddPositiveCoffee() {

		Inventory inventory = Inventory.getInstance();
		inventory = resetInventory(inventory);

		try {
			inventory.addCoffee("1");
			assertEquals(16, inventory.getCoffee());
		} catch (InventoryException exception) {
			fail("Add Coffee should not throw InventoryException with a positive integer passed in");
		}
	}

	public void testAddNonIntegerCoffee() {

		Inventory inventory = Inventory.getInstance();
		inventory = resetInventory(inventory);

		try {
			inventory.addCoffee("ee");
			fail("Add Coffee should throw InventoryException due to bad input");
		} catch (InventoryException exception) {

		}
	}

	public void testAddNegativeSugar() {

		Inventory inventory = Inventory.getInstance();
		inventory = resetInventory(inventory);

		try {
			inventory.addSugar("-1");
			fail("Add Sugar should throw InventoryException");
		} catch (InventoryException exception) {

		}
	}

	public void testAddPositiveSugar() {

		Inventory inventory = Inventory.getInstance();
		inventory = resetInventory(inventory);

		try {
			inventory.addSugar("1");
			assertEquals(16, inventory.getSugar());
		} catch (InventoryException exception) {
			fail("Add Sugar should not throw InventoryException with a positive integer passed in");
		}
	}

	public void testAddNonIntegerSugar() {

		Inventory inventory = Inventory.getInstance();
		inventory = resetInventory(inventory);

		try {
			inventory.addSugar("ee");
			fail("Add Sugar should throw InventoryException due to bad input");
		} catch (InventoryException exception) {

		}
	}

	public void testAddNegativeMilk() {

		Inventory inventory = Inventory.getInstance();
		inventory = resetInventory(inventory);

		try {
			inventory.addMilk("-1");
			fail("Add Milk should throw InventoryException");
		} catch (InventoryException exception) {
		}
	}

	public void testAddPositiveMilk() {

		Inventory inventory = Inventory.getInstance();
		inventory = resetInventory(inventory);

		try {
			inventory.addMilk("1");
			assertEquals(16, inventory.getMilk());
		} catch (InventoryException exeception) {
			fail("Add Milk should not throw InventoryException with a positive integer passed in");
		}
	}

	public void testAddNonIntegerMilk() {

		Inventory inventory = Inventory.getInstance();
		inventory = resetInventory(inventory);

		try {
			inventory.addMilk("ee");
			fail("Add Milk should throw InventoryException due to bad input");
		} catch (InventoryException exception) {

		}
	}

	public void testEnoughIngredientsMoreThanEnough() {

		Inventory inventory = Inventory.getInstance();
		inventory = resetInventory(inventory);

		Recipe recipe = new Recipe();
		try {
			recipe.setAmtChocolate("1");
			recipe.setAmtCoffee("1");
			recipe.setAmtMilk("1");
			recipe.setAmtSugar("1");
		} catch (RecipeException exception) {
			fail("Recipe did not work correctly - failing out!");
		}

		assertEquals(true, inventory.enoughIngredients(recipe));

	}

	public void testEnoughIngredientsNotEnough() {

		Inventory inventory = Inventory.getInstance();
		inventory = resetInventory(inventory);

		Recipe recipe = new Recipe();
		try {
			recipe.setAmtChocolate("100");
			recipe.setAmtCoffee("100");
			recipe.setAmtMilk("100");
			recipe.setAmtSugar("100");
		} catch (RecipeException exception) {
			fail("Recipe did not work correctly - failing out!");
		}

		assertEquals(false, inventory.enoughIngredients(recipe));

	}

	public void testEnoughIngredientsExactlyCorrectAmount() {

		Inventory inventory = Inventory.getInstance();
		inventory = resetInventory(inventory);

		Recipe recipe = new Recipe();
		try {
			recipe.setAmtChocolate("15");
			recipe.setAmtCoffee("15");
			recipe.setAmtMilk("15");
			recipe.setAmtSugar("15");
		} catch (RecipeException exception) {
			fail("Recipe did not work correctly - failing out!");
		}

		assertEquals(true, inventory.enoughIngredients(recipe));
	}

	public void testUseIngredientsNotEnough() {

		Inventory inventory = Inventory.getInstance();
		inventory = resetInventory(inventory);

		Recipe recipe = new Recipe();
		try {
			recipe.setAmtChocolate("100");
			recipe.setAmtCoffee("100");
			recipe.setAmtMilk("100");
			recipe.setAmtSugar("100");
		} catch (RecipeException exception) {
			fail("Recipe did not work correctly - failing out!");
		}

		boolean result = inventory.useIngredients(recipe);

		assertEquals(false, result);

		assertEquals(15, inventory.getChocolate());
		assertEquals(15, inventory.getCoffee());
		assertEquals(15, inventory.getMilk());
		assertEquals(15, inventory.getSugar());

	}

	public void testUseIngredientsExactlyEnough() {

		Inventory inventory = Inventory.getInstance();
		inventory = resetInventory(inventory);

		Recipe recipe = new Recipe();
		try {
			recipe.setAmtChocolate("15");
			recipe.setAmtCoffee("15");
			recipe.setAmtMilk("15");
			recipe.setAmtSugar("15");
		} catch (RecipeException exception) {
			fail("Recipe did not work correctly - failing out!");
		}

		boolean result = inventory.useIngredients(recipe);

		assertEquals(0, inventory.getChocolate());
		assertEquals(0, inventory.getCoffee());
		assertEquals(0, inventory.getMilk());
		assertEquals(0, inventory.getSugar());

	}

	public void testInventoryToString() {

		Inventory inventory = Inventory.getInstance();
		inventory = resetInventory(inventory);

		assertNotNull(inventory.toString());
	}

	private Inventory resetInventory(Inventory inventory) {
		inventory.setChocolate(15);
		inventory.setCoffee(15);
		inventory.setMilk(15);
		inventory.setSugar(15);
		return inventory;
	}

}
