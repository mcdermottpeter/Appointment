
public class Day extends Appointment {
	
	public Day(String a, Date d1)
	{
		super(a,d1);
	}
	public boolean occursOn(Date d)
	{
			return true;
	}

}
