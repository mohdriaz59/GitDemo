package stepDefination;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utilities.TestContextSetup;

public class Hooks {
	
	TestContextSetup testContextSetup;

		

	public Hooks(TestContextSetup testContextSetup) {
		super();
		this.testContextSetup = testContextSetup;
	}
	
	
	/*
	 * @After
	 * 
	 * public void AfterScenario() {
	 * 
	 * testContextSetup.driver.quit();
	 * 
	 * 
	 * 
	 * }
	 */
	 

		/*
		 * @AfterStep
		 * 
		 * public void AfterScreenshot(Scenario scenario) throws InterruptedException,
		 * IOException {
		 * 
		 * WebDriver driver = testContextSetup.testBase.WebDriverManager();
		 * 
		 * if(scenario.isFailed()) {
		 * 
		 * File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * //byte[] filecontent=FileUtils.readfileToByteArray(sourcePath);
		 * 
		 * //scenario.attach(filecontent, "image/png,", "image");
		 * //scenario.attach(null, null, null);
		 * 
		 * //byte[] filecontent = FileUtils. byte[]
		 * filecontent=org.apache.commons.io.FileUtils.readFileToByteArray(sourcePath);
		 * scenario.attach(filecontent, "image/png", "image");
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 * }
		 */}
		
		
		
		
		
		

	


