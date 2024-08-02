package testClass;

import org.testng.annotations.Test;

import report.ExtentManager;


public class VerifyForgotPasswordUrlTest extends BeforeAfterTest{
	
	@Test
	public void VerifyForgotPasswordUrlTestMethod() throws Exception {
		
		System.out.println("extent report checking");
		ExtentManager.onTestPass("Extent report checking");
	
	}

}
