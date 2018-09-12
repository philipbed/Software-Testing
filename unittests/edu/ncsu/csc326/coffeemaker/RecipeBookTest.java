package edu.ncsu.csc326.coffeemaker;

import junit.framework.TestCase;

public class RecipeBookTest extends TestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    // should have an array size of 4
    public void testInitialRecipeSize() {

        RecipeBook book = new RecipeBook();
        Recipe [] array = book.getRecipes();

        assertEquals(array.length, 4);
    }

    // check after adding that the first array index contains the added recipe
    public void testBasicAddRecipe() {

        String recipeName = "recipe1";

        RecipeBook book = new RecipeBook();

        Recipe recipe = new Recipe();
        recipe.setName(recipeName);

        book.addRecipe(recipe);

        Recipe [] arr = book.getRecipes();

        assertEquals(recipeName, arr[0].getName());
    }

    // test adding 4 (the limit) of recipes
    public void testAddMultipleRecipes() {

        String recipeName1 = "recipe1";
        String recipeName2 = "recipe2";
        String recipeName3 = "recipe3";
        String recipeName4 = "recipe4";
        boolean added;

        RecipeBook book = new RecipeBook();

        Recipe recipe1 = new Recipe();
        recipe1.setName(recipeName1);
        added = book.addRecipe(recipe1);

        assertEquals(true, added);

        Recipe recipe2 = new Recipe();
        recipe2.setName(recipeName2);
        added = book.addRecipe(recipe2);

        assertEquals(true, added);

        Recipe recipe3 = new Recipe();
        recipe3.setName(recipeName3);
        added = book.addRecipe(recipe3);

        assertEquals(true, added);

        Recipe recipe4 = new Recipe();
        recipe4.setName(recipeName4);
        added = book.addRecipe(recipe4);

        assertEquals(true, added);

        Recipe [] arr = book.getRecipes();

        // check the final results are all correct
        assertEquals(recipeName1, arr[0].getName());
        assertEquals(recipeName2, arr[1].getName());
        assertEquals(recipeName3, arr[2].getName());
        assertEquals(recipeName4, arr[3].getName());

    }

    // test adding 4 (the limit) of recipes
    public void testAddTooManyRecipes() {

        String recipeName1 = "recipe1";
        String recipeName2 = "recipe2";
        String recipeName3 = "recipe3";
        String recipeName4 = "recipe4";
        String recipeName5 = "recipe5";
        boolean added;

        RecipeBook book = new RecipeBook();

        Recipe recipe1 = new Recipe();
        recipe1.setName(recipeName1);
        added = book.addRecipe(recipe1);

        assertEquals(true, added);

        Recipe recipe2 = new Recipe();
        recipe2.setName(recipeName2);
        added = book.addRecipe(recipe2);

        assertEquals(true, added);

        Recipe recipe3 = new Recipe();
        recipe3.setName(recipeName3);
        added = book.addRecipe(recipe3);

        assertEquals(true, added);

        Recipe recipe4 = new Recipe();
        recipe4.setName(recipeName4);
        added = book.addRecipe(recipe4);

        assertEquals(true, added);

        Recipe recipe5 = new Recipe();
        recipe5.setName(recipeName5);
        added = book.addRecipe(recipe5);

        assertEquals(false, added);

        Recipe [] arr = book.getRecipes();

        // check the final results are all correct
        assertEquals(recipeName1, arr[0].getName());
        assertEquals(recipeName2, arr[1].getName());
        assertEquals(recipeName3, arr[2].getName());
        assertEquals(recipeName4, arr[3].getName());

    }

    public void testDeleteRecipe() {

        String recipeName = "recipe1";

        RecipeBook book = new RecipeBook();

        Recipe recipe = new Recipe();
        recipe.setName(recipeName);

        book.addRecipe(recipe);

        Recipe [] arr = book.getRecipes();

        // verify we added a recipe correctly for sanity
        assertEquals(recipeName, arr[0].getName());

       String actualName = book.deleteRecipe(0);

       assertEquals(recipeName, actualName);

    }

    public void testDeleteMultipleRecipe() {

        String recipeName1 = "recipe1";
        String recipeName2 = "recipe2";
        String recipeName3 = "recipe3";
        String recipeName4 = "recipe4";
        String recipeName5 = "recipe5";
        boolean added;

        RecipeBook book = new RecipeBook();

        Recipe recipe1 = new Recipe();
        recipe1.setName(recipeName1);
        added = book.addRecipe(recipe1);

        assertEquals(true, added);

        Recipe recipe2 = new Recipe();
        recipe2.setName(recipeName2);
        added = book.addRecipe(recipe2);

        assertEquals(true, added);

        Recipe recipe3 = new Recipe();
        recipe3.setName(recipeName3);
        added = book.addRecipe(recipe3);

        assertEquals(true, added);

        Recipe recipe4 = new Recipe();
        recipe4.setName(recipeName4);
        added = book.addRecipe(recipe4);

        assertEquals(true, added);

        Recipe recipe5 = new Recipe();
        recipe5.setName(recipeName5);
        added = book.addRecipe(recipe5);

        assertEquals(false, added);

        Recipe [] arr = book.getRecipes();

        // check the final results are all correct
        assertEquals(recipeName1, arr[0].getName());
        assertEquals(recipeName2, arr[1].getName());
        assertEquals(recipeName3, arr[2].getName());
        assertEquals(recipeName4, arr[3].getName());

        String deleted1 = book.deleteRecipe(0);
        assertEquals(deleted1, recipeName1);
        assertEquals("", arr[0].getName());

        String deleted2 = book.deleteRecipe(1);
        assertEquals(deleted2, recipeName2);
        assertEquals("", arr[1].getName());

        String deleted3 = book.deleteRecipe(2);
        assertEquals(deleted3, recipeName3);
        assertEquals("", arr[2].getName());

        String deleted4 = book.deleteRecipe(3);
        assertEquals(deleted4, recipeName4);
        assertEquals("", arr[3].getName());
    }

    public void testEditRecipe() {

        String recipeName1 = "recipe1";
        String recipeName2 = "recipe2";

        RecipeBook book = new RecipeBook();

        Recipe recipe = new Recipe();
        recipe.setName(recipeName1);

        book.addRecipe(recipe);

        Recipe [] arr = book.getRecipes();

        // verify we added a recipe correctly for sanity
        assertEquals(recipeName1, arr[0].getName());

        Recipe recipe1 = new Recipe();
        recipe1.setName(recipeName2);

        String ret = book.editRecipe(0, recipe1);
        assertEquals(recipeName1, ret);
        assertEquals(recipeName2, arr[0].getName());

    }

    public void testEditRecipeWhenRecipeDoesNotExist() {

        String recipeName1 = "recipe1";
        String recipeName2 = "recipe2";

        RecipeBook book = new RecipeBook();

        Recipe recipe = new Recipe();
        recipe.setName(recipeName1);

        book.addRecipe(recipe);

        Recipe [] arr = book.getRecipes();

        // verify we added a recipe correctly for sanity
        assertEquals(recipeName1, arr[0].getName());

        Recipe recipe1 = new Recipe();
        recipe1.setName(recipeName2);

        String ret = book.editRecipe(1, recipe1);
        assertEquals(null, ret);
        assertEquals(recipeName1, arr[0].getName());

    }

    public void testAddSameRecipe() {

        RecipeBook book = new RecipeBook();

        Recipe recipe = new Recipe();
        recipe.setName("test");

        boolean expectedTrue = book.addRecipe(recipe);
        boolean expectedFalse = book.addRecipe(recipe);

        assertEquals(true, expectedTrue);
        assertEquals(false, expectedFalse);
    }

    public void testDeleteNonExistentRecipe() {

        RecipeBook book = new RecipeBook();
        String expectedNullString = book.deleteRecipe(2);

        assertEquals(null, expectedNullString);
    }

    public void testOutOfRangeIndexException() {

        RecipeBook book = new RecipeBook();

        Recipe [] arr = book.getRecipes();

        try {
            String name = arr[4].getName();
            fail("Accessing an index outside of bounds should throw ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException exception) {

        }
    }

    public void testAllNullRecipesOnInit() {

        RecipeBook book = new RecipeBook();

        Recipe [] arr = book.getRecipes();

        for(int i = 0; i < 4; i++) {
            assertEquals(null, arr[i]);
        }

    }
}
