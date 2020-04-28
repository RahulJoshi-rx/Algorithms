package leapYearTDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeapYearTDDTest {

	private LeapYearTDD leapYearTDD = new LeapYearTDD();

	@Test
	void testDivisibleBy4() {
		assertTrue(leapYearTDD.isLeapYear(2004));
	}

	@Test
	void testDivisibleBy4And100() {
		assertFalse(leapYearTDD.isLeapYear(1800));
	}

	@Test
	void testDivisibleBy4And100NotValid() {
		assertTrue(leapYearTDD.isLeapYear(2000));
	}
}
