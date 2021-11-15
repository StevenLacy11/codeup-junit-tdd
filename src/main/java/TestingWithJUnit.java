import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestingWithJUnit {
	private List<String> names;

	@Test
	public void testingWithJUnit() {
		System.out.println("Hello World");
	}

	@Test
	public void testIfCompanyNameIsEquals() {
		String expected = "Codeup";
		String actual = "Codeup";

		assertEquals(expected, actual);
	}

	@Test
	public void testIfChangeIsCorrect() {
		Double price = 10.0;
		Double discount = 4.5;

		assertEquals(5.5, price - discount, 0);
		assertEquals(5.1, price - discount, 0.5);
		assertNotEquals(4.9, price - discount, 0.5);
	}

	@Test
	public void testIfObjectsAreDifferent() {
		Object dog = new Object();
		Object sheep = new Object();
		Object clonedSheep = sheep;

		assertNotSame(sheep, dog);
		assertSame(sheep, clonedSheep);
	}

	@Test
	public void testIfGreaterOrLesserThanWorks() {

		boolean learningTDD = true;

		assertTrue(learningTDD);
		assertTrue("5 is greater than 4", 5 > 4);
		assertFalse("5 is not greater than 6", 5 > 6);
	}


	@Before

	public void runThisBefore(){
		this.names = new ArrayList<>();
		this.names.add("kyle");
	}

	@Test
	public void testIfNamesIsInitialized(){
		assertNotNull(names);
	}

	@Test
	public void testIfANameCanBeAdded(){
		assertEquals(1, this.names.size());
		this.names.add("Zach");
		assertEquals(2, this.names.size());
		assertSame("kyle", this.names.get(0));
		assertSame("Zach", this.names.get(1));
	}






}
