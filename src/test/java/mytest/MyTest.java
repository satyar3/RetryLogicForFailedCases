package mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
	
	//@Test(retryAnalyzer = RetryAnalyzer.class) //With annotation transformer
	@Test //without annotation transformer
	public void testcase1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void testcase2()
	{
		Assert.assertEquals(false, true);
	}
}
