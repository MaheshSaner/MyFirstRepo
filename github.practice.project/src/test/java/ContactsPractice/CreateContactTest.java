package ContactsPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

    
public class CreateContactTest {
	 
	@Test
	public void createContactTest() {
		WebDriver driver;
		
		String URL =System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.get(URL);
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get(URL);
		}
		
		
		
		
		System.out.println("Contact Created");
		
	}
	
	
}
