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
	void testDivisibleBy4NotValid() {
		assertTrue(leapYearTDD.isLeapYear(1800));
	}
}
