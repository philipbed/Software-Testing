package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import junit.framework.TestCase;



public class RecipeTest extends TestCase {
    Recipe r1;
    Recipe r2;
    protected void setUp() throws Exception {
        r1 = new Recipe();
        r1.setName("Coffee");
        r1.setAmtChocolate("0");
        r1.setAmtCoffee("3");
        r1.setAmtMilk("1");
        r1.setAmtSugar("1");
        r1.setPrice("50");


        r2 = new Recipe();
        r2.setName("Mocha");
        r2.setAmtChocolate("20");
        r2.setAmtCoffee("3");
        r2.setAmtMilk("1");
        r2.setAmtSugar("1");
        r2.setPrice("75");
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testSetAmtChocolate(){
        try {
            r1.setAmtChocolate("4");
            assertEquals(4,r1.getAmtChocolate());
        }
        catch(RecipeException re){
            fail("Recipe Exception should not be thrown " +re.getMessage());
        }
    }

    public void testNonNumericChocolateAmt(){
        try {
            r1.setAmtChocolate("chocolate");
            fail("Recipe Exception should not be thrown ");
        }
        catch(RecipeException re){
            // success
        }
    }

    public void testNegativeChocolateAmt(){
        try {
            r1.setAmtChocolate("-4");
            fail("Recipe Exception should not be thrown ");

        }
        catch(RecipeException re){
            // success
        }
    }

    public void testSetAmtCoffee(){
        try {
            r1.setAmtCoffee("4");
            assertEquals(4,r1.getAmtCoffee());
        }
        catch(RecipeException re){
            fail("Recipe Exception should not be thrown " +re.getMessage());
        }
    }

    public void testNonNumericCoffeeAmt(){
        try {
            r1.setAmtCoffee("coffee");
            fail("Recipe Exception should not be thrown ");
        }
        catch(RecipeException re){

        }
    }

    public void testNegativeCoffeeAmt(){
        try {
            r1.setAmtCoffee("-4");
            fail("Recipe Exception should not be thrown ");

        }
        catch(RecipeException re){
            // success
        }
    }

    public void testSetAmtMilk(){
        try {
            r1.setAmtMilk("4");
            assertEquals(4,r1.getAmtMilk());
        }
        catch(RecipeException re){
            fail("Recipe Exception should not be thrown " +re.getMessage());
        }
    }

    public void testNonNumericMilkAmt(){
        try {
            r1.setAmtMilk("milk");
            fail("Recipe Exception should not be thrown ");
        }
        catch(RecipeException re){
            //success
        }
    }

    public void testNegativeMilkAmt(){
        try {
            r1.setAmtMilk("-4");
            fail("Recipe Exception should not be thrown ");

        }
        catch(RecipeException re){
            // success
        }
    }

    public void testSetAmtSugar(){
        try {
            r1.setAmtSugar("4");
            assertEquals(4,r1.getAmtSugar());
        }
        catch(RecipeException re){
            fail("Recipe Exception should not be thrown " +re.getMessage());
        }
    }

    public void testNonNumericSugarAmt(){
        try {
            r1.setAmtSugar("sugar");
            fail("Recipe Exception should not be thrown ");
        }
        catch(RecipeException re){
            //success
        }
    }

    public void testNegativeSugarAmt(){
        try {
            r1.setAmtSugar("-4");
            fail("Recipe Exception should not be thrown ");

        }
        catch(RecipeException re){
            // success
        }
    }

    public void testSetName(){

        String name = "Ham Sandwich";
        r1.setName(name);

        assertEquals(name,r1.getName());

    }

    public void testSetNameToNull(){
        r1.setName(null);

        assertEquals("Coffee", r1.getName());
    }

    public void testToString(){
        assertEquals(r1.getName(), r1.toString());
    }

    public void testSetPrice(){
        try {
            r1.setPrice("4");
            assertEquals(4,r1.getPrice());
        }
        catch(RecipeException re){
            fail("Recipe Exception should not be thrown " +re.getMessage());
        }
    }

    public void testNonNumericPrice(){
        try {
            r1.setPrice("price");
            fail("Recipe Exception should not be thrown ");
        }
        catch(RecipeException re){
            //success
        }
    }

    public void testNegativePrice(){
        try {
            r1.setPrice("-4");
            fail("Recipe Exception should not be thrown ");

        }
        catch(RecipeException re){
            // success
        }
    }

    public void testHashCode(){
        int nameHashCode = r1.getName().hashCode();
        assertEquals(31+nameHashCode,r1.hashCode());
    }

    public void testHashCodeWithNullName(){
        Recipe r = new Recipe();
        assertEquals(31,r.hashCode());
    }

    public void testEqualsWithSameObject(){
        assertEquals(true, r1.equals(r1));
    }

    public void testEqualsWithNull(){
        assertEquals(false,r1.equals(null) );
    }

    public void testEqualsWithDifferentClass(){
        assertEquals( false, r1.equals("name") );
    }

    public void testEqualsWithNullName(){
        assertEquals(false, r1.equals(new Recipe()));
    }

    public void testEqualsWithOtherNullName(){
        assertEquals(false, new Recipe().equals(r1));
    }

    public void testEqualsWithDifferentNames(){
        assertEquals(false, r1.equals(r2));
    }

    public void testEqualsWithDifferentObjects(){

        Recipe copy = new Recipe();
        copy.setName("Coffee");
        try {
            copy.setAmtChocolate("0");
            copy.setAmtCoffee("3");
            copy.setAmtMilk("1");
            copy.setAmtSugar("1");
            copy.setPrice("50");
            assertEquals(true, r1.equals(copy));
        }
        catch(Exception e){
            fail("Exception should not be thrown");
        }

    }

}
