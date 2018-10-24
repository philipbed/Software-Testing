package edu.ncsu.csc326.coffeemaker;

import junit.framework.TestCase;

public class RecipeBookTest extends TestCase {
	
	private RecipeBook rb;
	private Recipe r1, r2, r3, r4, r5;
	
	protected void setUp() {
		rb = new RecipeBook();
		r1 = new Recipe();
		r1.setName("r1");
		r2 = new Recipe();
		r2.setName("r2");
		r3 = new Recipe();
		r3.setName("r3");
		r4 = new Recipe();
		r4.setName("r4");
		r5 = new Recipe();
		r5.setName("r5");
		rb.addRecipe(r1);
		rb.addRecipe(r2);
		rb.addRecipe(r3);
		
	}
	
	/**
	 * Test if the recipe book is not null.
	 */
	public void testRecipeBook() {
		assertNotNull(rb);
	}
	
	/**
	 * Test getting recipes from the recipe book.
	 */
	public void testGetRecipes() {
		Recipe[] rs= {r1,r2,r3,null};
		Recipe[] rbs = rb.getRecipes();
		for(int i=0; i<4; i++) {
			assertEquals(rs[i], rbs[i]);
		}		
	}
	
	/**
	 * Test get recipes size from the recipe book.
	 */
	public void testGetRecipesSize() {
		assertEquals(4, rb.getRecipes().length);
	}
	
	/**
	 * Test if a recipe can be added to the recipe book.
	 */
	public void testAddRecipeSuccess() {
		assertEquals(true, rb.addRecipe(r4));
	}
	
	/**
	 * Test if a recipe can be added if it already exists in the recipe book.
	 */
	public void testAddRecipeAlreadyExists() {
		assertEquals(false, rb.addRecipe(r1));
	}
	
	/**
	 * Test if a recipe can be added to a full recipe book.
	 */
	public void testAddRecipeFull() {
		rb.addRecipe(r4);
		assertEquals(false, rb.addRecipe(r5));
	}
	
	/**
	 * Test if a recipe can be deleted from the recipe book.
	 */
	public void testDeleteRecipeSuccess() {
		assertEquals("r1", rb.deleteRecipe(0));
	}
	
	/**
	 * Test if a recipe can be deleted (if it doesn't exist) in the recipe book.
	 */
	public void testDeleteRecipeFail() {
		assertEquals(null, rb.deleteRecipe(3));
	}
	
	/**
	 * Test if a recipe can be added after a deletion from the recipe book.
	 */
	public void testAddRecipeAfterDelete() {
		// fill the book first
		rb.addRecipe(r4);
		// delete a recipe
		rb.deleteRecipe(0);
		assertEquals(true, rb.addRecipe(r5));
	}
	
	/**
	 * Test if a recipe can be edited in the recipe book.
	 */
	public void testEditRecipeSuccess() {
		assertEquals("r1", rb.editRecipe(0, r5));
	}
	
	/**
	 * Test if a recipe can be edited (if it doesn't exist) in the recipe book.
	 */
	public void testEditRecipeFail() {
		assertEquals(null, rb.editRecipe(3, r5));
	}
	
	/**
	 * Test if the recipe name changes for an edited recipe in the recipe book.
	 */
	public void testEditRecipeNameChange() {
		String name = r5.getName();
		rb.editRecipe(0, r5);
		assertEquals(name, rb.getRecipes()[0].getName());
	}
}
