package sda.homworks.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sda.utilities.TestBase;

public class Hw01 extends TestBase {

    @Test(dataProvider = "searchQueries")
    public void searchProduct(String searchQuery) {
        // Open the site
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");

        // Login
        driver.findElement(By.id("input-email")).sendKeys("clarusway@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("123456789");
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        // Search for the product
        driver.findElement(By.name("search")).sendKeys(searchQuery);
        driver.findElement(By.cssSelector("button[type='button'][class='btn btn-default btn-lg']")).click();

        // Add verification steps as needed
    }

    @DataProvider(name = "searchQueries")
    public Object[][] searchQueriesProvider() {
        return new Object[][]{
                {"Mac"},
                {"iPad"},
                {"Samsung"}
        };
    }
}
