package automation.pageObject;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import automation.BrowserControl;

public class PageRegister {

	private WebElement genderMr;
	private WebElement genderMrs;
	private WebElement firstName;
	private WebElement lastName;
	private WebElement password;
	//private WebElement dayBirth;
	//private WebElement monthBirth;
	//private WebElement yearBirth;
	private WebElement newsletter;
	private WebElement offers;
	//private WebElement adressFirstName;
	//private WebElement adressLastName;
	private WebElement company;
	private WebElement adress;
	private WebElement adressLineTwo;
	private WebElement city;
	//private WebElement state;
	private WebElement zipPostalCode;
	//private WebElement country;
	private WebElement additionalInformation;
	private WebElement homePhone;
	//private WebElement mobilePhone;
	private WebElement adressFutureReference;
	private WebElement btnRegister;

	private WebDriver driver = BrowserControl.driver;

	public void clickGenderMr() {
        genderMr = driver.findElement(By.id("id_gender1"));
        genderMr.click();
    }

    public void clickGenderMrs() {
	    genderMrs = driver.findElement(By.id("id_gender2"));
	    genderMrs.click();
    }

    public void fillFirstName(String firstName) {
	    this.firstName = driver.findElement(By.name("customer_firstname"));
	    this.firstName.sendKeys(firstName);
    }

    public void fillLastName(String text) {
        lastName = driver.findElement(By.id("customer_lastname"));
        lastName.sendKeys(text);
    }

    public void fillPassword(String textPassword) {
        password = driver.findElement(By.id("passwd"));
        password.sendKeys(textPassword);
    }

    public void chooseDayBirth() {
        Random day = new Random();
        Select selectDay = new Select(driver.findElement(By.id("days")));
        selectDay.selectByIndex(day.nextInt(30));
    }

    public void chooseMonthBirth() {
        Random month = new Random();
        Select selectMonth = new Select(driver.findElement(By.id("months")));
        selectMonth.selectByIndex(month.nextInt(12));
    }

    public void chooseYearBirth() {
        Random year = new Random();
        Select selectYear = new Select(driver.findElement(By.id("years")));
        selectYear.selectByIndex(year.nextInt(120)+1);
    }

    public void clickNewsletter() throws InterruptedException {
        newsletter = driver.findElement(By.id("newsletter"));
        newsletter.click();
        Thread.sleep(2000);
    }

    public void clickOffers() throws InterruptedException {
		 offers = driver.findElement(By.id("optin"));
		 offers.click();
		 Thread.sleep(2000);
    }

    public void fillCompany() {
		company = driver.findElement(By.id("company"));
		company.sendKeys("Google");
    }
    public void fillAdress() {
		adress = driver.findElement(By.id("address1"));
	    adress.sendKeys("285 Fulton St, New York, NY 10007, Estados Unidos");
    }

    public void fillAdressLineTwo() {
	    adressLineTwo = driver.findElement(By.id("address2"));
	    adressLineTwo.sendKeys("One World Trade Center");
    }
    public void fillCity() {
        city = driver.findElement(By.id("city"));
        city.sendKeys("Nova York");
    }

    public void chooseState() {
		Random state = new Random();
		Select selectState = new Select(driver.findElement(By.id("id_state")));
		selectState.selectByIndex(state.nextInt(49));
    }

    public void fillZipPostalCode(String zipCode){
		zipPostalCode = driver.findElement(By.id("postcode"));
		zipPostalCode.sendKeys(zipCode);
    }

    public void chooseCountry() {
    	Select selectCountry = new Select(driver.findElement(By.id("id_country")));
    	selectCountry.selectByVisibleText("United States");
    }

    public void fillAdditionalInformation(String information) throws InterruptedException {
        Thread.sleep(2000);
        additionalInformation = driver.findElement(By.id("other"));
        additionalInformation.sendKeys(information);
    }

    public void fillHomePhone() {
        homePhone = driver.findElement(By.id("phone"));
        homePhone.sendKeys("1029902834");
    }

    public void fillMobilePhone() {
    	driver.findElement(By.id("phone_mobile")).sendKeys("1029902835");
    }

    public void fillAdressFutureReference() {
        adressFutureReference = driver.findElement(By.id("alias"));
        adressFutureReference.sendKeys("Nova York");
    }

    public void clickBtnRegister() throws InterruptedException {
        Thread.sleep(2000);
        btnRegister = driver.findElement(By.id("submitAccount"));
        btnRegister.click();
    }

}