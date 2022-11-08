/**
 * 
 */
package mercury_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mercury_travel_pages.home_page;
import mercury_travel_pages.login_page;

/**
 * @author Rahul
 *
 */

public class login_page_test {
    
	public WebDriver driver;
	login_page loginpage;
	home_page homepage;
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing Course\\Automation Manual Testing\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		
	    loginpage = new login_page(driver);
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test
	public void varifylogo() {
	   
		
		boolean flag = loginpage.validatelogo();
		Assert.assertTrue(flag);
		
		
	}
	
	@Test
	public void varifylogin() {
	   
		
	    homepage = loginpage.login("admin", "admin123");
	    String acturl= driver.getCurrentUrl();
	    String expul = "https:/opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	    
		Assert.assertEquals(acturl, expul);
		
	}
	
	@AfterMethod
	public void teardown(){
		
		driver.close();
	}
	
	
}
