package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition {
	WebDriver driver;

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String string) {
	    System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	  driver.findElement(By.name("userName")).sendKeys(string);
	}

	@When("enter firstname as {string}")
	public void enter_firstname_as(String string) {
		   driver.findElement(By.id("firstName")).sendKeys(string);
	}

	@When("enter lastname as {string}")
	public void enter_lastname_as(String string) {
		 driver.findElement(By.id("lastName")).sendKeys(string);
	}

	@Then("enter the password as {string}")
	public void enter_the_password_as(String string) {
	 driver.findElement(By.id("password")).sendKeys(string);
	}

	@Then("reenter as {string}")
	public void reenter_as(String string) {
		 driver.findElement(By.name("confirmPassword")).sendKeys(string);
	}

	@Then("select the gender as Female")
	public void select_the_gender_as_Female() {	   
		 driver.findElement(By.xpath("//*[@value='Female']")).click();
	}

	@Then("give the mail id as {string}")
	public void give_the_mail_id_as(String string) {
		driver.findElement(By.name("emailAddress")).sendKeys(string);
	}

	@Then("give the mobile number as{string}")
	public void give_the_mobile_number_as(String string) {
		driver.findElement(By.name("mobileNumber")).sendKeys(string);
	}

	@Then("give the dob as {string}")
	public void give_the_dob_as(String string) {
		driver.findElement(By.name("dob")).sendKeys(string);
	}

	@Then("give the address as {string}")
	public void give_the_address_as(String string) {
		driver.findElement(By.name("address")).sendKeys(string);	}

	@Then("select the security question as what is ur birth place")
	public void select_the_security_question_as_what_is_ur_birth_place() {
		driver.findElement(By.name("securityQuestion")).click();
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	@Then("give the answer as {string}")
	public void give_the_answer_as(String string) {
		driver.findElement(By.name("answer")).sendKeys(string);
	}

@Then("press the register button")
public void press_the_register_button() {
	driver.findElement(By.name("Submit")).click();
}
	

}
