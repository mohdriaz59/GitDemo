
package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public WebDriver driver;

	public WebDriver WebDriverManager() throws InterruptedException, IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Hidayath\\eclipse-workspace\\CucumberFrameworkByRahulShetty\\src\\test\\resources\\global.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		String url=prop.getProperty("QAURL");
		
		

		if (driver == null) {
			if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				
			

			System.setProperty("webdriver.gecko.driver",
					"C://Users//Hidayath//eclipse//geckodriver-v0.31.0-win64(2)//geckodriver.exe");
			driver = new FirefoxDriver();
			}
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				////chrome code
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
			System.out.println("***lauching the Greenkart page url **************");
		}
		return driver;

	}

}
