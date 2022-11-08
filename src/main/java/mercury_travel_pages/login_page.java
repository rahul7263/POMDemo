package mercury_travel_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page {
	
	WebDriver driver;
	
   By username = By.xpath("//input[@name=\"username\"]");
   By password = By.xpath("//input[@name=\"password\"]");
   By loginbtn = By.xpath("//button[@type=\"submit\"]");
   By logo = By.xpath("//img[@alt=\"company-branding\"]");
   
   public login_page(WebDriver driver) {
	   
	   this.driver = driver;
   }
   
   public boolean validatelogo() {
	   
	   driver.findElement(logo).isDisplayed();
	   return true;
   }
   
   public home_page login(String uname, String pass) {
	   
	   driver.findElement(username).sendKeys(uname);
	   driver.findElement(password).sendKeys(pass);
	   driver.findElement(loginbtn).click();
	   return new home_page();
   }
   
}
