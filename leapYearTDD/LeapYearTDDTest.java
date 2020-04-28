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
	void testDivisibleBy4And100And400() {
		assertTrue(leapYearTDD.isLeapYear(2000));
	}

	@Test
	void testAllCases() {
		assertFalse(leapYearTDD.isLeapYear(1700));
		assertFalse(leapYearTDD.isLeapYear(1900));
		assertFalse(leapYearTDD.isLeapYear(2100));
		assertTrue(leapYearTDD.isLeapYear(2008));
		assertTrue(leapYearTDD.isLeapYear(2012));
		assertTrue(leapYearTDD.isLeapYear(2016));
		assertFalse(leapYearTDD.isLeapYear(2017));
		assertFalse(leapYearTDD.isLeapYear(2018));
		assertFalse(leapYearTDD.isLeapYear(2019));
	}
}
