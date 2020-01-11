package mytest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase
{
	@BeforeClass
	public void setUp()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("After Class");
	}
}
