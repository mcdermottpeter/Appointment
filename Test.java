
public class Test {
	public static void main(String[] args)
	{
		Date d1 = new Date("October", 21, 2013);
		Date d2 = new Date("January", 19, 2016);
		Date d3 = new Date("April", 1, 2014);
		OneTime o1 = new OneTime("Getting Married", d1);
		OneTime o2 = new OneTime("1st child", d2);
		Month m1 = new Month("Pay for Xbox", d3);
		Day a1 = new Day("Wake up", d1);
		
		if (o1.occursOn(d1))
		{
			System.out.println(d1.toString() + "\t\t\t " + o1.getAppointment());
		}
		if (o2.occursOn(d2))
		{
			System.out.println(d2.toString() + "\t\t\t " + o2.getAppointment());
		}
		if ( m1.occursOn(d3))
		{
			System.out.println(d3.toString() + "\t\t\t\t " + m1.getAppointment());
		}
		if (a1.occursOn(d1))
		{
			System.out.println(d1.toString() + "\t\t\t " + a1.getAppointment());
		}
	}
}
