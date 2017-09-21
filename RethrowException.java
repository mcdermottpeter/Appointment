import java.io.*;

public class RethrowException
{
	public static void main(String args[])
	{
		try
		{
			someMethod();
		}
		catch(Exception exception)
		{
			System.err.println(exception.getMessage() + "\n");
			exception.printStackTrace();
		}
	}

	public static void someMethod() throws Exception
	{
		try
		{
			someMethod2();
		}
		catch(Exception exception2)
		{
			throw exception2;
		}
	}

	public static void someMethod2() throws Exception
	{
		throw new Exception ("Exception thrown in someMethod2");
	}



}
