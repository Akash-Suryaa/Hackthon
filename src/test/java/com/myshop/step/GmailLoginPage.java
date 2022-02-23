package com.myshop.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPage extends InitilizeBrowser {

	static By emailfield = By.xpath("//input[@type='email']");
	static By nextBtn = By.xpath("//*[@id=\"identifierNext\"]/div/button/span");
	static By pass = By.xpath("//input[@type='password']");
	static By nextbtn = By.xpath("//span[text()='Next']");

	static By composeLink = By.xpath("//div[contains(text(),'Compose')]");
	static By subjectBox = By.xpath("//input[@name='subjectbox']");
	static By bodyBox = By.xpath("//div[@id=':rd']");
	static By moreOptions = By.xpath("//div[@id=':sd']//div[2]");
	static By label = By.xpath("//div[text()='Label']");
	static By socialTitle = By.xpath("//div[@title='Social']");
	static By applyLink = By.xpath("//div[text()='Apply']");
	static By sendBtn = By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']");

	public static void enterEmail(String email) {
		driver.findElement(emailfield).sendKeys(email);
		driver.findElement(nextBtn).click();
	}

	public static void enterPass(String password) {
		driver.findElement(pass).sendKeys(password);
		driver.findElement(nextbtn).click();
	}

	public static void clickOnComposeLink() {
		driver.findElement(composeLink).click();

	}

	public static void enterTextInSubjectBox(String subject) {

		driver.findElement(subjectBox).sendKeys(subject);
	}

	public static void enterTextInBody(String body) {
		driver.findElement(bodyBox).sendKeys(body);

	}

	public static void ClicksOnMoreOptions() {

		driver.findElement(moreOptions).click();

	}

	public static void Lable() {

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(label)).build().perform();

	}

	public static void selectSocialCheckbox() {

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(socialTitle)).click().build().perform();

	}

	public static void clickOnApplyLnk() {
		driver.findElement(applyLink).click();
	}

	public static void clickOnSend() {
		driver.findElement(sendBtn).click();
	}

}
