package automation.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.BrowserControl;

public class PageLogin {
	private WebElement emailCreate;
	private WebElement btnCreateAccount;
	private WebDriver driver = BrowserControl.getInstance().driver;
	
	public void fillEmailCreate(String email) {
		emailCreate = driver.findElement(By.id("email_create"));
		emailCreate.sendKeys(email);
	}
	
	public void clickBtnCreateAccount() {
		btnCreateAccount = driver.findElement(By.id("SubmitCreate"));
		btnCreateAccount.click();
	}
}
