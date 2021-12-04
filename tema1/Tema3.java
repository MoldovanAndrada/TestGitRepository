package tema1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


import utils.BaseTest;

public class Tema3 extends BaseTest{

	@Test
	public void Tema3() {
	WebElement bookTitle = driver.findElement(By.cssSelector("a[href='the-forest']"));
	bookTitle.click();
	
	WebElement tabreviews = driver.findElement(By.cssSelector("a[href='#tab-reviews']"));
	tabreviews.click();
	
	WebElement checkbox = driver.findElement(By.cssSelector("input[id='wp-comment-cookies-consent']"));
	
	assertFalse(checkbox.isSelected());
	
	WebElement rating = driver.findElement(By.cssSelector("div[class='comment-form-rating'] a[class='star-5']"));
	rating.click();
	
	WebElement descriptionInput = driver.findElement(By.cssSelector("textarea[id='comment'][name='comment']"));
	descriptionInput.sendKeys("description input2");
	
	WebElement authorInput = driver.findElement(By.cssSelector("input[id='author'][name='author']"));
	authorInput.sendKeys("author1 input");
	
	WebElement emailInput = driver.findElement(By.cssSelector("input[id='email'][name='email']"));
	emailInput.sendKeys("b@email.com");
	
	WebElement submitButton = driver.findElement(By.cssSelector("input[name='submit'][type='submit']"));
	submitButton.click();

	WebElement yourReview = driver.findElement(By.cssSelector("div[class='comment-text'] p[class='meta'] em[class='woocommerce-review__awaiting-approval']"));
	assertTrue(yourReview.isDisplayed());
	}
}
