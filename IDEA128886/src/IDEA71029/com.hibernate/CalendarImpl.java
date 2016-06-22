package IDEA71029.com.hibernate;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by IntelliJ IDEA.
 * User: ihannur
 * Date: 6/14/11
 * Time: 3:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class CalendarImpl extends Calendar
{
	/**
	 * needed for serialization
	 */
	private static final long serialVersionUID = 1052899532314460204L;

	/**
	 * The encapsulated calendar date time value
	 */
	protected long mTime;
	//protected GregorianCalendar mThirdPartyGregorianCalendar;

	/**
	 * encapsulated timezone
	 */
	protected TimeZone mTimeZone;


	public CalendarImpl()
	{
		mTimeZone = TimeZone.getTimeZone("UTC");
		mTime = new GregorianCalendar(mTimeZone).getTimeInMillis();
	}

    @Override
    protected void computeTime() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    protected void computeFields() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public CalendarImpl(int year, int month, int day,
                        int hour, int minute, int second, int millisecond)
	{
		mTimeZone = TimeZone.getTimeZone("UTC");
		constructorHelper(year, month, day, hour, minute, second, millisecond);
	}



	public CalendarImpl(int year, int month, int day)
	{
		mTimeZone = TimeZone.getTimeZone("UTC");
		constructorHelper(year, month, day, 0, 0, 0, 0);
	}


	public void constructorHelper(int year, int month, int day,
			int hour, int minute, int second, int millisecond)
	{
		GregorianCalendar gc = new GregorianCalendar(mTimeZone);
		gc = setValues(gc, year, month, day, hour, minute, second, millisecond);
		mTime = gc.getTimeInMillis();
	}

	public CalendarImpl(long milliseconds)
	{
		mTimeZone = TimeZone.getTimeZone("UTC");
		constructorHelper(milliseconds);
	}


	/**
	 * Help the constructors save and validate the milliseconds
	 * @param milliseconds the milliseconds to save for the date/time
	 */
	private void constructorHelper(long milliseconds)
	{
		mTime = milliseconds;
		GregorianCalendar gc = new GregorianCalendar(mTimeZone);
		gc.setTimeInMillis(milliseconds);
		// now validate the resulting date is within range
		checkDateRange(gc);
	}

	public CalendarImpl(GregorianCalendar gregorianCalendar)
	{
		// now validate the resulting date is within range
		checkDateRange(gregorianCalendar);
		mTime = gregorianCalendar.getTimeInMillis();
		mTimeZone = gregorianCalendar.getTimeZone();
	}


	public GregorianCalendar toSpecific()
	{
		GregorianCalendar gc = new GregorianCalendar(mTimeZone);
		gc.setTimeInMillis(mTime);
		return gc;
	}

	private static GregorianCalendar getMaxDateValue()
	{
		GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
		cal.clear();
		cal.set(9999, 11, 31, 23, 59, 59);
		cal.set(Calendar.MILLISECOND, 999);
		return cal;
	}

	private static GregorianCalendar getMinDateValue()
	{
		GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
		cal.clear();
		cal.set(1600, 0, 1, 0, 0, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal;
	}

	private void checkYearMonthDayValues(int year, int month, int day)
	{
		try
		{
			if ( (year > 9999) || (year < 1600))
				throw new IllegalArgumentException("year value out of range");
			if ( (month > 12) || (month < 1))
				throw new IllegalArgumentException("month value out of range");
			if ( (day > 31) || (day < 1))
				throw new IllegalArgumentException("day value out of range");
			// now see if this day number is valid for this month and year.
			GregorianCalendar tmpCal = new GregorianCalendar(mTimeZone);
			tmpCal.clear();
			tmpCal.set(year, month-1, day);
			int tmpDay = tmpCal.get(Calendar.DATE);
			if (tmpDay != day)
			{
				throw new IllegalArgumentException("day value out of range");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			// if an unknown field is given
			throw e;
		}
	}


	private void checkDateRange(GregorianCalendar tmpCal)
	{
		//if necessary, convert tmpCal into Utc time zone for comparison
		long date = tmpCal.getTimeInMillis();
	}


	private void checkHourMinuteSecondMillisecondValues(int hour, int minute, int seconds, int milliseconds)
	{
		if ( (hour > 23) || (hour < 0))
			throw new IllegalArgumentException("hour value out of range");
		if ( (minute > 59) || (minute < 0))
			throw new IllegalArgumentException("minute value out of range");
		if ( (seconds > 59) || (seconds < 0))
			throw new IllegalArgumentException("seconds value out of range");
		if ( (milliseconds > 999) || (milliseconds < 0))
			throw new IllegalArgumentException("milliseconds value out of range");
	}

	private void internalAdd(int field, int value)
	{
		try
		{
			// we will do the calculation on a tmp calendar in case
			// the result is out of range.
			GregorianCalendar tmpCal = (GregorianCalendar) toSpecific().clone();
			tmpCal.add(field, value);

			// now validate the resulting date is within range
			checkDateRange(tmpCal);

			// ok to save new value in our calendar
			mTime = tmpCal.getTimeInMillis();
			mTimeZone = tmpCal.getTimeZone();
		}
		catch(IllegalArgumentException e)
		{
			throw e;
		}
	}

	private int internalGetActualMaximum(int field)
	{
		try
		{
			return toSpecific().getActualMaximum(field);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			throw e;
		}
	}


	@Override
	public boolean equals(Object value)
	{
		if (value == null)
    	{
    		return false;
    	}

		if (value instanceof CalendarImpl)
		{
			CalendarImpl calendar = (CalendarImpl) value;
			GregorianCalendar inGC = calendar.toSpecific();
			return toSpecific().equals(inGC);
		}
		else
		{
			return false;
		}
	}


	@Override
	public int hashCode()
	{
		return toSpecific().hashCode();
	}

    @Override
    public void add(int field, int amount) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void roll(int field, boolean up) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getMinimum(int field) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getMaximum(int field) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getGreatestMinimum(int field) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getLeastMaximum(int field) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

	private GregorianCalendar setValues(GregorianCalendar gc, int year, int month, int day, int hour, int minute, int second, int millisecond)
	{
		try
		{
			// check the parameter values are within range.
			checkYearMonthDayValues(year, month, day);
			checkHourMinuteSecondMillisecondValues(hour, minute, second, millisecond);

			// we will do the calculation on a tmp calendar in case
			// the result is out of range.
			GregorianCalendar tmpCal = new GregorianCalendar(gc.getTimeZone());
			tmpCal.clear();
			// java months are range 0-11.  The input parameter range is 1-12.
			tmpCal.set(year, month-1, day, hour, minute, second);
			tmpCal.set(Calendar.MILLISECOND, millisecond);

			// now validate the resulting date is within range
			checkDateRange(tmpCal);

			// ok to save new value in our calendar
			return tmpCal;
		}
		catch(IllegalArgumentException e)
		{
			// if an unknown field is given in set
			throw new IllegalArgumentException(e);
		}
	}

    @Override
    public String toString() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

}

