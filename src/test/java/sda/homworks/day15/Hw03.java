package sda.homworks.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.utilities.TestBase;

public class Hw03 extends TestBase {
   // Test Case3: Negative Password Test
   // Open page https://practicetestautomation.com/practice-test-login/
   // Type username student into Username field.
   // Type password incorrectPassword into Password field.
   // Puch Submit button.
   // Verify error message is displayed.
   // Verify error message text is Your password is invalid!

    @Test
    public void test(){
        // Open the page
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Type username
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("student");

        // Type incorrect password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("incorrectPassword");

        // Click Submit button
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        // Verify error message is displayed
        SoftAssert sa=new SoftAssert();
        WebElement errorMessageElement = driver.findElement(By.id("error"));
        sa.assertTrue(errorMessageElement.isDisplayed(), "Error message is not displayed");

        // Verify error message text
        String errorMessageText = errorMessageElement.getText();
        sa.assertEquals(errorMessageText, "Your password is invalid!", "Error message text is incorrect");

        sa.assertAll();

    }
}
