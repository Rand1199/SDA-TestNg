package sda.homworks.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.utilities.TestBase;

public class Hw02 extends TestBase {
     /*
        Test Case2: Negative Username Test
        Open page https://practicetestautomation.com/practice-test-login/
        Type username incorrectUser into Username field.
        Type password Password123 into Password field.
        Click Submit button.
        Verify error message is displayed.
        Verify error message text is Your username is invalid!

     */

    @Test
    public void test(){
        // Open the page
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Type incorrect username
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("incorrectUser");

        // Type password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Password123");

        // Click Submit button
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        // Verify error message is displayed
        WebElement errorMessageElement = driver.findElement(By.id("error"));
        Assert.assertTrue(errorMessageElement.isDisplayed(), "Error message is not displayed");

        // Verify error message text
        String errorMessageText = errorMessageElement.getText();
        Assert.assertEquals(errorMessageText, "Your username is invalid!", "Error message text is incorrect");
    }


}

