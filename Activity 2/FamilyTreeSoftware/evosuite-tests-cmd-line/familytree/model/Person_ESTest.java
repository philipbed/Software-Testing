/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 14 17:55:22 GMT 2018
 */

package familytree.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import familytree.model.Person;
import familytree.model.Relation;
import familytree.model.RelationSpouse;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Person_ESTest extends Person_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Person person0 = new Person("Wife", "I^p5", true);
      GregorianCalendar gregorianCalendar0 = person0.getDateOfBirth();
      gregorianCalendar0.roll(1, true);
      boolean boolean0 = person0.dateOfDeathEquals(gregorianCalendar0);
      assertEquals("I^p5", person0.getLastName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Person person0 = new Person("", "^l", true);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1978, 1978, 1978);
      person0.setDateOfDeath(mockGregorianCalendar0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-1), 3227, (-1));
      boolean boolean0 = person0.dateOfDeathEquals(mockGregorianCalendar1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=-1,MONTH=3227,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=-1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar1.toString());
      assertEquals("", person0.getFirstName());
      assertEquals("^l", person0.getLastName());
      assertTrue(person0.isFemale());
      assertFalse(boolean0);
      assertEquals(1, person0.getId());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Person person0 = new Person("Lh[#c#@GX:.1", "L7|m2<", false);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0);
      person0.setDateOfBirth(mockGregorianCalendar0);
      Locale locale0 = Locale.ENGLISH;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
      boolean boolean0 = person0.dateOfBirthEquals(mockGregorianCalendar1);
      assertFalse(boolean0);
      assertFalse(person0.isFemale());
      assertEquals("Lh[#c#@GX:.1", person0.getFirstName());
      assertEquals("L7|m2<", person0.getLastName());
      assertEquals(1, person0.getId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Person person0 = Person.restorePerson(0, "i]", "", true);
      assertEquals("female", person0.getGender());
      
      person0.setFemale(false);
      boolean boolean0 = person0.isFemale();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Person person0 = new Person("B>+1:v*T@]Fj1Goz-j", "{^phm", true);
      Person person1 = Person.restorePerson((-198), "%/a", "male", false);
      person0.addChild(person1);
      assertEquals("male", person1.getLastName());
      assertEquals("%/a", person1.getFirstName());
      assertEquals((-198), person1.getId());
      assertEquals("male", person1.getGender());
      
      person0.getRelationships();
      assertEquals(1, person0.getId());
      assertEquals("{^phm", person0.getLastName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Person person0 = Person.restorePerson((-2245), (String) null, (String) null, true);
      String string0 = person0.getLastName();
      assertNull(string0);
      assertEquals((-2245), person0.getId());
      assertEquals(1, person0.getGenderAsInt());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Person person0 = Person.restorePerson(0, "Hcz;", "", false);
      String string0 = person0.getLastName();
      assertEquals(0, person0.getId());
      assertEquals("", string0);
      assertFalse(person0.isFemale());
      assertEquals("Hcz;", person0.getFirstName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Person person0 = Person.restorePerson(0, "", "odRi6!t'.;AX63", true);
      int int0 = person0.getId();
      assertEquals(0, int0);
      assertEquals("", person0.getFirstName());
      assertEquals("odRi6!t'.;AX63", person0.getLastName());
      assertTrue(person0.isFemale());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Person person0 = Person.restorePerson((-2245), (String) null, (String) null, true);
      int int0 = person0.getId();
      assertEquals((-2245), int0);
      assertEquals(1, person0.getGenderAsInt());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Person person0 = Person.restorePerson((-2245), (String) null, (String) null, true);
      String string0 = person0.getFirstName();
      assertEquals((-2245), person0.getId());
      assertNull(string0);
      assertEquals("female", person0.getGender());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Person person0 = Person.restorePerson(5, "", "8K(%F>eN;0s_", true);
      String string0 = person0.getFirstName();
      assertEquals("8K(%F>eN;0s_", person0.getLastName());
      assertEquals("female", person0.getGender());
      assertEquals(5, person0.getId());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Person person0 = Person.restorePerson(1683, "U]-E,2FY]^x@t)C{", "x", false);
      person0.setDateOfDeath((GregorianCalendar) null);
      // Undeclared exception!
      try { 
        person0.getDateOfDeath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("familytree.model.Person", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Person person0 = new Person("\"F]p(Q%%Evs$jH{", "&!X2&Qr+Af?)TGu^[N", true);
      person0.setDateOfBirth((GregorianCalendar) null);
      // Undeclared exception!
      try { 
        person0.getDateOfBirth();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("familytree.model.Person", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Person person0 = Person.restorePerson((-1216), "", "", true);
      GregorianCalendar gregorianCalendar0 = person0.getDateOfDeath();
      gregorianCalendar0.setTimeZone((TimeZone) null);
      // Undeclared exception!
      try { 
        person0.dateOfBirthEquals(gregorianCalendar0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Person person0 = new Person("m", "Y7Er^", false);
      // Undeclared exception!
      try { 
        person0.addChild((Person) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("familytree.model.Person", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Person person0 = new Person("-I", "", true);
      Person person1 = new Person("-I", "-I", true);
      person1.addChild(person0);
      Relation relation0 = person1.getRelation(person0);
      assertEquals("", person0.getLastName());
      assertNotNull(relation0);
      assertEquals(2, person1.getId());
      assertEquals("-I", person0.getFirstName());
      assertEquals("female", person1.getGender());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Person person0 = Person.restorePerson(75, "male", "male", false);
      Person person1 = Person.restorePerson(75, "male", "Wife", false);
      person0.addChild(person1);
      assertEquals("Wife", person1.getLastName());
      assertEquals("male", person1.getFirstName());
      
      Relation relation0 = person0.getRelation(person0);
      assertEquals(75, person0.getId());
      assertNull(relation0);
      assertEquals("male", person0.getGender());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Person person0 = Person.restorePerson(5, "", "8K(%F>eN;0s_", true);
      Person person1 = new Person("male", "female", true);
      person0.addSpouse(person1);
      Relation relation0 = person1.getRelation(person0);
      assertNotNull(relation0);
      
      Relation relation1 = person1.getRelation(((RelationSpouse) relation0).husband);
      assertEquals(2, person1.getId());
      assertEquals("", person0.getFirstName());
      assertEquals("8K(%F>eN;0s_", person0.getLastName());
      assertEquals(5, person0.getId());
      assertNull(relation1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Person person0 = new Person("m", "Y7Er^", false);
      person0.getRelationships();
      assertEquals(1, person0.getId());
      assertEquals("Y7Er^", person0.getLastName());
      assertEquals("m", person0.getFirstName());
      assertFalse(person0.isFemale());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Person person0 = new Person("", "^l", true);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), 3227, (-1));
      person0.setDateOfDeath(mockGregorianCalendar0);
      boolean boolean0 = person0.dateOfDeathEquals(mockGregorianCalendar0);
      assertEquals(1, person0.getId());
      assertEquals("^l", person0.getLastName());
      assertEquals("", person0.getFirstName());
      assertTrue(person0.isFemale());
      assertTrue(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=-1,MONTH=3227,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=-1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Person person0 = new Person(" ", " ", true);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1, 1, 2, 2);
      boolean boolean0 = person0.dateOfDeathEquals(mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=2,SECOND=2,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      assertEquals(1, person0.getId());
      assertFalse(boolean0);
      assertEquals(" ", person0.getFirstName());
      assertEquals(" ", person0.getLastName());
      assertTrue(person0.isFemale());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Person person0 = new Person("", "", false);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      boolean boolean0 = person0.dateOfDeathEquals(mockGregorianCalendar0);
      assertEquals(1, person0.getId());
      assertEquals("", person0.getLastName());
      assertEquals("", person0.getFirstName());
      assertFalse(boolean0);
      assertEquals("male", person0.getGender());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Person person0 = new Person("Wife", "I^p5", true);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(589, 0, 1, 1, 589);
      boolean boolean0 = person0.dateOfDeathEquals(mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=589,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=589,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      assertEquals("I^p5", person0.getLastName());
      assertEquals(1, person0.getId());
      assertEquals("Wife", person0.getFirstName());
      assertTrue(person0.isFemale());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Person person0 = Person.restorePerson(0, "i]", "", true);
      boolean boolean0 = person0.dateOfDeathEquals((Calendar) null);
      assertEquals(0, person0.getId());
      assertEquals("i]", person0.getFirstName());
      assertEquals(1, person0.getGenderAsInt());
      assertEquals("", person0.getLastName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Person person0 = new Person("Wife", "I^p5", true);
      GregorianCalendar gregorianCalendar0 = person0.getDateOfBirth();
      boolean boolean0 = person0.dateOfDeathEquals(gregorianCalendar0);
      assertTrue(boolean0);
      assertEquals(1, person0.getId());
      assertEquals("I^p5", person0.getLastName());
      assertEquals("Wife", person0.getFirstName());
      assertEquals("female", person0.getGender());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Person person0 = new Person("", "", false);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      person0.setDateOfBirth(mockGregorianCalendar0);
      boolean boolean0 = person0.dateOfBirthEquals(mockGregorianCalendar0);
      assertEquals("", person0.getFirstName());
      assertTrue(boolean0);
      assertEquals("", person0.getLastName());
      assertEquals("male", person0.getGender());
      assertEquals(1, person0.getId());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Person person0 = new Person(" ", " ", true);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1, 1, 2, 2);
      boolean boolean0 = person0.dateOfBirthEquals(mockGregorianCalendar0);
      assertEquals(1, person0.getId());
      assertEquals(" ", person0.getLastName());
      assertEquals(" ", person0.getFirstName());
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1,MONTH=1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=2,SECOND=2,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      assertTrue(person0.isFemale());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Person person0 = Person.restorePerson(75, "male", "male", false);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-189), 0, (-189));
      boolean boolean0 = person0.dateOfBirthEquals(mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=-189,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=-189,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      assertEquals(75, person0.getId());
      assertFalse(boolean0);
      assertEquals("male", person0.getFirstName());
      assertEquals("male", person0.getLastName());
      assertFalse(person0.isFemale());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Person person0 = new Person("Wife", "I^p5", true);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(589, 0, 1, 1, 589);
      boolean boolean0 = person0.dateOfBirthEquals(mockGregorianCalendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=589,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=589,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      assertEquals("I^p5", person0.getLastName());
      assertEquals(1, person0.getId());
      assertEquals("Wife", person0.getFirstName());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Person person0 = new Person("NjW]qxt't", "NjW]qxt't", false);
      boolean boolean0 = person0.dateOfBirthEquals((Calendar) null);
      assertEquals(1, person0.getId());
      assertEquals("NjW]qxt't", person0.getFirstName());
      assertFalse(boolean0);
      assertEquals("NjW]qxt't", person0.getLastName());
      assertEquals(0, person0.getGenderAsInt());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Person person0 = new Person("Wife", "I^p5", true);
      int int0 = person0.getGenderAsInt();
      assertEquals(1, person0.getId());
      assertEquals("Wife", person0.getFirstName());
      assertEquals("I^p5", person0.getLastName());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Person person0 = Person.restorePerson(17, "Relation exists or is illegal", "Relation exists or is illegal", false);
      int int0 = person0.getGenderAsInt();
      assertEquals(0, int0);
      assertEquals(17, person0.getId());
      assertEquals("Relation exists or is illegal", person0.getFirstName());
      assertEquals("Relation exists or is illegal", person0.getLastName());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Person person0 = Person.restorePerson(5, "", "8K(%F>eN;0s_", true);
      String string0 = person0.getGender();
      assertEquals(5, person0.getId());
      assertEquals("female", string0);
      assertEquals("8K(%F>eN;0s_", person0.getLastName());
      assertEquals("", person0.getFirstName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Person person0 = Person.restorePerson(17, "Relation exists or is illegal", "Relation exists or is illegal", false);
      String string0 = person0.getGender();
      assertEquals("male", string0);
      assertEquals("Relation exists or is illegal", person0.getLastName());
      assertEquals(17, person0.getId());
      assertEquals("Relation exists or is illegal", person0.getFirstName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Person person0 = new Person("NjW]qxt't", "NjW]qxt't", false);
      Person person1 = new Person("DAAS2jqK", "female", true);
      person0.addSpouse(person1);
      assertEquals("NjW]qxt't", person0.getLastName());
      
      person1.getChildren();
      assertEquals(2, person1.getId());
      assertEquals("female", person1.getLastName());
      assertTrue(person1.isFemale());
      assertEquals("DAAS2jqK", person1.getFirstName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Person person0 = new Person("Wife", "I^p5", true);
      Person person1 = new Person(" uqVS,.U5+uYl0VHX", "@", true);
      person0.addChild(person1);
      assertEquals(2, person1.getId());
      
      Vector vector0 = person0.getChildren();
      assertEquals("[ uqVS,.U5+uYl0VHX @]", vector0.toString());
      assertTrue(person0.isFemale());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Person person0 = new Person("Wife", "I^p5", true);
      Person person1 = new Person(" uqVS,.U5+uYl0VHX", "@", true);
      person1.addSpouse(person0);
      assertEquals(2, person1.getId());
      
      boolean boolean0 = person0.removeRelation(person0);
      assertFalse(boolean0);
      assertTrue(person0.isFemale());
      assertEquals("I^p5", person0.getLastName());
      assertEquals("Wife", person0.getFirstName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Person person0 = new Person("Wife", "I^p5", true);
      Person person1 = new Person(" uqVS,.U5+uYl0VHX", "@", true);
      person0.addChild(person1);
      boolean boolean0 = person0.removeRelation(person1);
      assertEquals("@", person1.getLastName());
      assertTrue(boolean0);
      assertTrue(person1.isFemale());
      assertEquals(2, person1.getId());
      assertEquals(" uqVS,.U5+uYl0VHX", person1.getFirstName());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Person person0 = new Person("M", ".V*U1Ky~pkHN[@?j$Go", true);
      Person person1 = Person.restorePerson((-2849), "Parent", "JX;c{qO\"o\";n U", false);
      person0.addSpouse(person1);
      // Undeclared exception!
      try { 
        person0.addSpouse((Person) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("familytree.model.Person", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Person person0 = new Person("NjW]qxt't", "NjW]qxt't", false);
      Person person1 = Person.restorePerson(23, "female", "", false);
      person0.addChild(person1);
      Person person2 = new Person("DAAS2jqK", "female", true);
      person0.addSpouse(person2);
      person2.addSpouse(person1);
      assertEquals(23, person1.getId());
      assertEquals("female", person1.getFirstName());
      assertEquals("DAAS2jqK", person2.getFirstName());
      assertEquals(3, person2.getId());
      assertFalse(person1.isFemale());
      assertEquals("", person1.getLastName());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Person person0 = Person.restorePerson(0, "i]", "", true);
      Person person1 = Person.restorePerson(0, "vM|&{;02H6", "male", false);
      person1.addSpouse(person0);
      try { 
        person1.addChild(person0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Relation exists or is illegal
         //
         verifyException("familytree.model.Person", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Person person0 = Person.restorePerson(0, "i]", "", true);
      person0.setFemale(false);
      try { 
        person0.addSpouse(person0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Relation exists or is illegal
         //
         verifyException("familytree.model.Person", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Person person0 = new Person("Wife", "I^p5", true);
      int int0 = person0.getId();
      assertEquals(1, person0.getGenderAsInt());
      assertEquals(1, int0);
      assertEquals("Wife", person0.getFirstName());
      assertEquals("I^p5", person0.getLastName());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Person person0 = new Person("M", ".V*U1Ky~pkHN[@?j$Go", true);
      String string0 = person0.getFirstName();
      assertEquals("M", string0);
      assertTrue(person0.isFemale());
      assertEquals(".V*U1Ky~pkHN[@?j$Go", person0.getLastName());
      assertEquals(1, person0.getId());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Person person0 = new Person("M", ".V*U1Ky~pkHN[@?j$Go", true);
      String string0 = person0.toString();
      assertTrue(person0.isFemale());
      assertEquals("M .V*U1Ky~pkHN[@?j$Go", string0);
      assertEquals(1, person0.getId());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Person person0 = new Person("Wife", "I^p5", true);
      GregorianCalendar gregorianCalendar0 = person0.getDateOfBirth();
      boolean boolean0 = person0.dateOfBirthEquals(gregorianCalendar0);
      assertTrue(person0.isFemale());
      assertEquals(1, person0.getId());
      assertEquals("Wife", person0.getFirstName());
      assertTrue(boolean0);
      assertEquals("I^p5", person0.getLastName());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Person person0 = new Person("", "^l", true);
      String string0 = person0.getLastName();
      assertEquals("", person0.getFirstName());
      assertEquals("^l", string0);
      assertEquals(1, person0.getId());
      assertTrue(person0.isFemale());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Person person0 = new Person("", "^l", true);
      person0.setLastName("E8]");
      assertEquals("E8]", person0.getLastName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Person person0 = new Person("M", ".V*U1Ky~pkHN[@?j$Go", true);
      person0.setFirstName("M");
      assertEquals(1, person0.getId());
      assertEquals("M", person0.getFirstName());
      assertEquals(".V*U1Ky~pkHN[@?j$Go", person0.getLastName());
      assertTrue(person0.isFemale());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Person person0 = Person.restorePerson(0, "i]", "", true);
      boolean boolean0 = person0.isFemale();
      assertTrue(boolean0);
      assertEquals("", person0.getLastName());
      assertEquals(0, person0.getId());
      assertEquals("i]", person0.getFirstName());
  }
}
