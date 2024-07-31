package Com.SeleniumFramework.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pageObjectModel.LoginPage_POM;

public class TestVWOLogin_POM {
	
	@Description("TC001")
	@Test
	public void testLoginNegativeVWO() {
		WebDriver driver = new EdgeDriver();
		LoginPage_POM loginpagepom = new LoginPage_POM(driver);		
		String errorMsgTxt = loginpagepom.loginToVWO("admin@gmail.com", "admin");
		Assert.assertEquals(errorMsgTxt, "Your email, password, IP address or location did not match");
		driver.quit();
	}

	@Description("TC002")
	@Test
	public void testLoginNegativeVWO2() {
		WebDriver driver = new EdgeDriver();
		LoginPage_POM loginpagepom = new LoginPage_POM(driver);		
		String errorMsgTxt = loginpagepom.loginToVWO("saranya@gmail.com", "admin");
		Assert.assertEquals(errorMsgTxt, "Your email, password, IP address or location did not match");
		driver.quit();
	}
}
