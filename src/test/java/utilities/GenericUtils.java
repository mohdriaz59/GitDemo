package utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;


public class GenericUtils {
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebDriver driver;
	
	
	public void SwitchWindowToChild() {
		  Set<String>s1=driver.getWindowHandles();
		  Iterator<String> i1=s1.iterator();
		  String parentWindow=i1.next();
		  String ChildWindow=i1.next();
		  driver.switchTo().window(ChildWindow);
		  
	}
	
	
	

}
