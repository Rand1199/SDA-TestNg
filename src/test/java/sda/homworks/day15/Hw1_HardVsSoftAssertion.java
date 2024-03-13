package sda.homworks.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sda.utilities.TestBase;

public class Hw1_HardVsSoftAssertion extends TestBase {
/*
Test Case1: Positive Login Test
Open page https://practicetestautomation.com/practice-test-login/
Type username student into Username field
Type password Password123 into Password field
Click Submit button.
Verify new page URL contains practicetestautomation.com/logged-in-successfully/
Verify new page contains expected text ('Congratulations' or 'successfully logged in')
Verify button Log out is displayed on the new page.
*/

@Test
    public void test(){
    // Open the page
    driver.get("https://practicetestautomation.com/practice-test-login/");

    // Type username
    WebElement usernameField = driver.findElement(By.id("username"));
    usernameField.sendKeys("student");

    // Type password
    WebElement passwordField = driver.findElement(By.id("password"));
    passwordField.sendKeys("Password123");

    // Click Submit button
    WebElement submitButton = driver.findElement(By.id("submit"));
    submitButton.click();

    // Verify new page URL
    String newPageURL = driver.getCurrentUrl();
    SoftAssert sa= new SoftAssert();
    sa.assertTrue(newPageURL.contains("practicetestautomation.com/logged-in-successfully/"), "URL verification failed");

    // Verify new page contains expected text
    String pageSource = driver.getPageSource();
   sa.assertTrue(pageSource.contains("Congratulations") || pageSource.contains("successfully logged in"), "Text verification failed");

    // Verify Log out button is displayed
    WebElement logoutButton = driver.findElement(By.linkText("Log out"));
    sa.assertTrue(logoutButton.isDisplayed(), "Logout button verification failed");

    // Assert all verifications
    sa.assertAll();

}
}
