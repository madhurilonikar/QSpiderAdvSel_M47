package practice;

import org.testng.annotations.Test;

public class DemoTest 
{

	@Test(groups="smoke")
	public void carTest()
	{
		System.out.println("BMW");
		System.out.println("Audi");
	}
}
