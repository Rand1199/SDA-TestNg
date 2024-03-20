package sda.tests.Day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sda.utilities.ExtentReportUtils;
import sda.utilities.TestBase;

public class C02ExtentReport02 extends TestBase {

    //Go to URL: https://opensource-demo.orangehrmlive.com/
    //Login with negative credentilas by Data Provider.
    //Then assert that ''Invalid credentials'’ is displayed.

    By userNameFiled = By.name("username");
    By passwordName = By.name("password");
    By buttonTag = By.tagName("button");
    By textByXpath = By.xpath("//*[.='Invalid credentials']");

    @Test(dataProvider = "invalidCredentials")
    public void negativeLoginTest(String userName, String password) throws InterruptedException {
        ExtentReportUtils.createTestReport("My fisr report","here i can write detailed description...");
        ExtentReportUtils.info("navigating to the page...");
        driver.get("https://opensource-demo.orangehrmlive.com/");
        ExtentReportUtils.pass("we are on the page");

        driver.findElement(userNameFiled).sendKeys(userName);

        driver.findElement(passwordName).sendKeys(password);

        driver.findElement(buttonTag).click();


        Thread.sleep(1000);
        WebElement invalidText = driver.findElement(textByXpath);
        boolean isTextDisplayed = invalidText.isDisplayed();
        if (isTextDisplayed) {
           ExtentReportUtils.pass("passed");
        } else {
            ExtentReportUtils.fail("fail");
        }

        Assert.assertTrue(isTextDisplayed);


    }


    @DataProvider(name = "invalidCredentials")
    public Object[][] getData() {
        return new Object[][]{
                {"adm", "admin23*"},
                {"cdmin", "admin123"}
        };

    }
}
