package cucumberOptions;

import org.testng.annotations.DataProvider;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/*@CucumberOptions(features="src/test/java/features",glue ="stepDefinition"
,monochrome=true)
//C:\Users\Hidayath\eclipse-workspace\CucumberFrameworkByRahulShetty\src\test\java\feature
// tags ="@PlaceOrder" )
//plugin= {"html:target/cucumber.html", "json:target/cucumber.json"})

//C:/Users/Hidayath/eclipse-workspace/CucumberFrameworkByRahulShetty/src/test/java


 * @CucumberOptions(features="src/test/java/features",glue ="stepDefinitions"
 * ,monochrome=true, tags ="@PlaceOrder or @OffersPage", plugin=
 * {"html:target/cucumber.html", "json:target/cucumber.json",
 * "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
 * "rerun:target/failed_scenarios.txt"})
 */

@CucumberOptions(features="src/test/java/features",glue="stepDefination",monochrome=true)

public class TestngTestRunner extends AbstractTestNGCucumberTests {

	
	  @Override
	  
	  @DataProvider(parallel=true)
	  public Object[][] scenarios() {
		  return  super.scenarios(); 
	  }
	 
}
