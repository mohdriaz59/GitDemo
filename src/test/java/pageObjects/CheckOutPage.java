/*
 * package pageObjects;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver;
 * 
 * public class CheckOutPage { public WebDriver driver;
 * 
 * public CheckOutPage(WebDriver driver) { this.driver = driver;
 * 
 * } By CartBag=By.
 * cssSelector("div.container header:nth-child(1) div.container div.cart a.cart-icon:nth-child(5) > img:nth-child(1)"
 * ); By
 * CheckOutButton=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
 * By PromoBtn=By.xpath("//button[contains(text(),'Apply')]"); By
 * PlaceOrder=By.xpath("//button[contains(text(),'Place Order')]");
 * 
 * public void CheckOutItems() {
 * 
 * driver.findElement(CartBag).click();
 * driver.findElement(CheckOutButton).click(); }
 * 
 * public Boolean VerifyPromoBtn() { return
 * driver.findElement(PromoBtn).isDisplayed();
 * 
 * }
 * 
 * 
 * public Boolean VerifyPlaceOrder() { return
 * driver.findElement(PlaceOrder).isDisplayed();
 * 
 * }
 * 
 * 
 * //5-6
 * 
 * }
 */