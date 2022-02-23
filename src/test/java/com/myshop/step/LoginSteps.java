package com.myshop.step;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends InitilizeBrowser {

	@Given("^Open the browser and add Url$")
	public void open_the_browser_and_add_Url() {
		driver = initBrowser();
		driver.get("https://www.gmail.com/");
	}

	@Given("^user enters email and password$")
	public void user_enters_email_and_password() {
		GmailLoginPage.enterEmail("akashsury8691@gmail.com");
		GmailLoginPage.enterPass("Abc");
	}

	@Then("^verify Page title$")
	public void verify_Page_title() {

		String title = driver.getTitle();
		System.out.println("the title of the page is " + title);
		Assert.assertEquals(title, driver.getTitle());
	}

	@When("^user clicks on compose button$")
	public void user_clicks_on_compose_button() throws InterruptedException {

		GmailLoginPage.clickOnComposeLink();
		Thread.sleep(2000);
	}

	@When("^enters text in subject$")
	public void enters_text_in_subject() {
		GmailLoginPage.enterTextInSubjectBox("Test Gmail");
	}

	@When("^enters text in body$")
	public void enters_text_in_body() {
		GmailLoginPage.enterTextInBody("Hello Gmail");
	}

	@When("^user select email as social$")
	public void user_select_email_as_social() throws InterruptedException {

		GmailLoginPage.ClicksOnMoreOptions();
		GmailLoginPage.Lable();
		GmailLoginPage.selectSocialCheckbox();
		Thread.sleep(2000);
	}

	@When("^user clicks on apply button$")
	public void user_clicks_on_apply_button() throws InterruptedException {
		GmailLoginPage.clickOnApplyLnk();
		Thread.sleep(2000);
	}

	@When("^user send the email to the same account$")
	public void user_send_the_email_to_the_same_account() {
		GmailLoginPage.clickOnSend();

	}

	
}
