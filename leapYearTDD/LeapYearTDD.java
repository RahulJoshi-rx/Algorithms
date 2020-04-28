package leapYearTDD;

public class LeapYearTDD {

	private boolean isDivisibleBy4(Integer iNumber) {
		return iNumber % 4 == 0;
	}

	public boolean isLeapYear(Integer iYear) {
		return isDivisibleBy4(iYear);
	}

}
