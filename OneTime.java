
public class OneTime extends Appointment{
	
	public OneTime(String a, Date d1)
	{
		super(a,d1);
	}
	
	public boolean occursOn(Date d)
	{
		if (super.getDate().getMonth().equalsIgnoreCase(d.getMonth()) && super.getDate().getDay() == d.getDay())
		{
			if (super.getDate().getYear() == d.getYear())
			{
				return true;
			}
		}
		return false;
	}

}
