package com.myshop.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PopultaionUtil extends InitilizeBrowser{

	
	public static String exceptionUtil(String path) throws InterruptedException
	{
		String count="";
		try {
			Thread.sleep(3000);
			WebElement count2 = driver.findElement(By.xpath(path));
			count = count2.getText();
		} catch (Exception e) {
			Thread.sleep(4000);
			WebElement count2 = driver.findElement(By.xpath(path));
			count = count2.getText();
		}
		return count;

	}
}
