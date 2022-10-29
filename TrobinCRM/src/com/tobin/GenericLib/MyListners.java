package com.tobin.GenericLib;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class MyListners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log(result.getName()+" method started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
				Reporter.log(result.getName()+" method succes ",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		TakesScreenshot screenshot=(TakesScreenshot)BaseClass.driver;
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\adithya\\git\\repository\\TrobinCRM\\FailedScreenshot\\"+result.getName()+".png");
		try {
			Files.copy(src,dest);
		} catch (IOException e) {
			  
			
			e.printStackTrace();
		}
		
		
		Reporter.log(result.getName()+" method failed",true);
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+" method skipped",true);
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		Reporter.log(context.getName()+" test Started",true);	
	}
	@Override
	public void onFinish(ITestContext context) {
		Reporter.log(context.getName()+" test Failed ",true);
	}
	

}
