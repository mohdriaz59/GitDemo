package stepDefination;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utilities.TestContextSetup;

public class LandingPageStepDefinition {
	
public WebDriver driver;
public String landingPageProductName;
public String offerPageProductName;
LandingPage landingPage;
private TestContextSetup testContextSetup;
//Spring framework, EJB, 
//SRP
//
public LandingPageStepDefinition(TestContextSetup testContextSetup)

{
	
	this.testContextSetup=testContextSetup;
	this.landingPage =testContextSetup.pageObjectManager.getLandingPage();
}/*
	 * @Given("User is on GreenCart Landing page") public void
	 * user_is_on_green_cart_landing_page() {
	 */	
		@Given("User is on GreenCart Landing page")
		public void user_is_on_green_cart_landing_page() {
		    
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
		}
		@When("^user searched with Shortname (.+) and extracted actual name of product$")
	     public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName ) throws InterruptedException {
		
		landingPage.searchItem(shortName);
		Thread.sleep(2000);
		testContextSetup.landingPageProductName= landingPage.getProductName().split("-")[0].trim();
		System.out.println(landingPageProductName +" is extracted from Home page");
			
}

	@When("Added {string} items of the Selected product to cart")
	public void added_items_of_the_selected_product_to_cart(String quantity) {
	   
		landingPage.incrementQuantity(Integer.parseInt(quantity));
		landingPage.addToCart();
		
	}
	


	
}
