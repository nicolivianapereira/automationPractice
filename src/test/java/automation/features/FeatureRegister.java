package automation.features;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.BrowserControl;
import automation.pageObject.PageLogin;
import automation.pageObject.PageRegister;

public class FeatureRegister {
	
	PageLogin loginPage = new PageLogin();
	PageRegister registerPage = new PageRegister();
	
	private WebElement successfulMessage;
	private WebElement existingEmail;
	private WebElement fieldsNotFilled;
	private WebDriver driver = BrowserControl.driver;

	
	public void startRegister() {
		Random createEmail = new Random();
		String email = "nicoli"+ createEmail.nextInt(100)+"@harakirimail.com";
		loginPage.fillEmailCreate(email);
		loginPage.clickBtnCreateAccount();
	}
	
	public void fillAllFields() throws InterruptedException {
		Thread.sleep(3000);
		registerPage.clickGenderMrs();
		registerPage.fillFirstName("Nicoli");
		registerPage.fillLastName("Viana");
		registerPage.fillPassword("123456");
		registerPage.chooseDayBirth();
		registerPage.chooseMonthBirth();
		registerPage.chooseYearBirth();
		registerPage.clickNewsletter();
		registerPage.clickOffers();
		registerPage.fillCompany();
		registerPage.fillAdress();
		registerPage.fillAdressLineTwo();
		registerPage.fillCity();
		registerPage.chooseState();
		registerPage.fillZipPostalCode("12356");
		registerPage.chooseCountry();
		registerPage.fillAdditionalInformation("Its just a happy scenario");
		registerPage.fillHomePhone();
		registerPage.fillMobilePhone();
		registerPage.fillAdressFutureReference();
		
		registerPage.clickBtnRegister();
	}
	

    public void successfulRegister() throws Exception {
    	successfulMessage = driver.findElement(By.className("info-account"));
		String message = successfulMessage.getText();
    	if(!message.equalsIgnoreCase("Welcome to your account. Here you can manage all of your personal information and orders.")){
    		throw new Exception("A mensagem não corresponde ao esperado");
    	}
    }

    public String messageExistingEmail() {
    	existingEmail = driver.findElement(By.id("create_account_error"));
        return existingEmail.getText();
    }

    public boolean messageFieldsNotFilled() {
    	fieldsNotFilled = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		if(fieldsNotFilled.getText() == "There are 8 errors") {
			return true;
		}else
			return false;
    }

}
