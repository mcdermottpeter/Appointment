
public class Appointment {
	Date d;
	String Appointment;
	
	public Appointment(String a, Date d1)
	{
		Appointment = a;
		d = d1;
	}
	
	public String getAppointment()
	{
		return Appointment;
	}
	
	public Date getDate()
	{
		return d;
	}
	
	public String toString()
	{
		return Appointment + " on " + d;
	}
//	public void OccursOn(int year, int month, int day)
//	{
//		if (year == 2013 && month == 2 && day == 1)
//		{
//			System.out.println("You are getting married");
//		}
//		if (year == 2016 && month == 7 && day == 13)
//		{
//			System.out.println("Baby is due");
//		}
//	}

}
