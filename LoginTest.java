package tests;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.*;
import utils.BaseTest;

public class LoginTest extends BaseTest {
	
	@Parameters({"name", "email","subject","message"})
	@Test
	public void sendContactMessage(String name, String email, String subject, String message) {

		ContactsPage contactsPage = new ContactsPage(this.driver);
		contactsPage.contact(name, email, subject, message);
		
		WebElement yourReview = driver.findElement(By.partialLinkText("By Thank you for your message. It has been sent."));
		assertTrue(yourReview.isDisplayed());
		
	}

}
