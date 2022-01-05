package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsPage {
	
	
	public WebDriver driver;
	
	public ContactsPage(WebDriver driver) {
		this.driver = driver;
		
	}

	public By nameField = By.name("your-name");
	public By emailField = By.name("your-email");
	public By subjectField = By.name("your-s");
	public By messageName = By.cssSelector("textarea[name='your-message']");
	public By submitButton = By.cssSelector("input[value='Send Message']");
	
	
	public void setName(String name) {
		driver.findElement(nameField).sendKeys(name);
	}
	
	public void setEmail(String email) {
		driver.findElement(emailField).sendKeys(email);
	}
	
	public void inputSubject(String subject) {
		driver.findElement(subjectField).sendKeys(subject);
	}
	
	public void inputMessage(String message) {
		driver.findElement(messageName).sendKeys(message);
	}
	
	public void clickSubmitButton() {
		driver.findElement(submitButton).click();
	}
	
	public void contact(String name, String email, String subject, String message) {
		setName(name);
		setEmail(email);
		inputSubject(subject);
		inputMessage(message);
		clickSubmitButton();
	}

}