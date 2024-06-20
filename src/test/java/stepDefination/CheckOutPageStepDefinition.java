/*
 * package stepDefination;
 * 
 * import java.util.Iterator; import java.util.Set;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import org.testng.Assert;
 * 
 * import io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import
 * io.cucumber.java.en.When; import pageObjects.CheckOutPage; import
 * pageObjects.LandingPage; import utilities.TestContextSetup;
 * 
 * public class CheckOutPageStepDefinition {
 * 
 * public WebDriver driver; public String landingPageProductName; public String
 * offerPageProductName; public CheckOutPage checkoutpage; LandingPage
 * landingPage; private TestContextSetup testContextSetup; //Spring framework,
 * EJB, //SRP // public CheckOutPageStepDefinition(TestContextSetup
 * testContextSetup)
 * 
 * {
 * 
 * this.testContextSetup=testContextSetup;
 * this.checkoutpage=testContextSetup.pageObjectManager.getCheckoutPage(); }
 * 
 * 
 * 
 * @Then("Verify user has ability to enter promo code and place the order")
 * public void verify_user_has_ability_to_enter_promo_code_and_place_the_order()
 * {
 * 
 * 
 * Assert.assertTrue(checkoutpage.VerifyPlaceOrder());
 * Assert.assertTrue(checkoutpage.VerifyPromoBtn()); }
 * 
 * 
 * 
 * @Then("^Then User proceeds to Checkout and validate the (.+) items in checkout page$"
 * ) public void
 * user_proceeds_to_checkout_and_validate_the_tom_items_in_checkout_page() {
 * checkoutpage.CheckOutItems(); }
 * 
 * 
 * 
 * 
 * @Then("User proceeds to Checkout and validate the Tom items in checkout page"
 * ) public void
 * user_proceeds_to_checkout_and_validate_the_tom_items_in_checkout_page() {
 * 
 * checkoutpage.CheckOutItems();
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 */