package Practice;

import org.testng.annotations.Test;

public class TetsngSample 
{
	final int v=3;
	@Test(priority = 4,invocationCount =2)
	public static void ihaddinner()
	{
		System.out.println(":::::::::::I had Dinner::::::");
		System.out.println("*******************************");
	}
	@Test(priority = 0,invocationCount = 2)
	public static void ihadBreackFast()
	{
		System.out.println("::::::::::::::Early morning i had break fast::::::");
		System.out.println("******************************");
	}
	@Test(priority =3,invocationCount = 2)
	public static void iHadLaunch()
	{
		System.out.println("********I Had launch::::::::::");
		System.out.println("**************************");
	}
	@Test(priority = -5,invocationCount = 2)
	public static void iWokeUP()
	{
		System.out.println(":::::::::::I wokeUp at Morning:::::::");
		System.out.println("**********************************");
	}

}
