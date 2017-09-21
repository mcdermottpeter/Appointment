
public class Date {
	private String month;
	private int day, year;
	
	public Date(String m,int d, int y)
	{
		year = y;
		month = m;
		day = d;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public String getMonth()
	{
		return month;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public String toString()
	{
		return month + " " + day + ", " + year;
	}

}
