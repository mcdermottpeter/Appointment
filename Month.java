
public class Month extends Appointment {
	
	public Month(String a, Date d1)
	{
		super(a,d1);
	}
	
	public boolean occursOn(Date d1)
	{
		if (super.getDate().getDay() == d.getDay() && super.getDate().getYear() == d.getYear())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
