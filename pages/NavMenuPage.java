package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavMenuPage {
	
	public WebDriver driver;
	
	public NavMenuPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By loginLink = By.linkText("Login");
	public By contactsLink = By.partialLinkText("CONTACTS");

	
	
	public void navigateToLogin() {
		driver.findElement(loginLink).click();
	}
	
	public LoginPage navToLogin () {
		driver.findElement(loginLink).click();
		return new LoginPage(driver);
	}
	
	public ContactsPage navToContacts () {
		driver.findElement(contactsLink).click();
		return new ContactsPage(driver);
	}
	
	

}