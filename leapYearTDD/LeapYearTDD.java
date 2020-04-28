package leapYearTDD;

public class LeapYearTDD {

	private boolean isDivisibleBy4(Integer iNumber) {
		return iNumber % 4 == 0;
	}

	private boolean isDivisibleBy100(Integer iNumber) {
		return iNumber % 100 == 0;
	}

	private boolean isDivisibleBy400(Integer iNumber) {
		return iNumber % 400 == 0;
	}

	public boolean isLeapYear(Integer iYear) {

		if(iYear < 1584)
			return false;

		if(isDivisibleBy400(iYear))
			return true;

		if(isDivisibleBy100(iYear))
			return false;

		return isDivisibleBy4(iYear);
	}

}
