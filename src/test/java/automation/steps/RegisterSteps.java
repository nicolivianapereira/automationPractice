package automation.steps;

import automation.BrowserControl;
import automation.features.FeatureRegister;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {

	private String pathDriver = "src\\test\\resources\\chromeDriver";
	private String keyDriver = "webdriver.chrome.driver";
	private String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	FeatureRegister register = new FeatureRegister();
	
	@Given("I am in the home page")
	public void i_am_in_the_home_page() {
		BrowserControl.getInstance().openPage(url);
	}
	@When("I fill all fields")
	public void i_fill_all_fields() throws InterruptedException {
		register.startRegister();
		register.fillAllFields();
	}
	@Then("register is done successfully")
	public void register_is_done_successfully() throws Exception {
		register.successfulRegister();
	}



}
