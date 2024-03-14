package sda.homworks.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import sda.utilities.TestBase;

public class Hw03 extends TestBase {

    @Test
    @Parameters({"username", "password"})
    public void loginWithIncorrectCredentials(String username, String password) {
        // Navigate to the login page
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Enter username and password
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys(username);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);

        // Click Submit button
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        // Verify error message is displayed
        WebElement errorMessage = driver.findElement(By.id("error"));
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not displayed");
}}
