package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	int counter= 0;
	int retry = 3;
	
	public boolean retry(ITestResult arg0) {
		
		if(counter < retry)
		{
			counter++;
			return true;
		}
		
		return false;
	}

}
