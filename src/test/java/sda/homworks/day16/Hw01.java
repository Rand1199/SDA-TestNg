package sda.homworks.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import sda.utilities.TestBase;

public class Hw01 extends TestBase {

    @Test
    @Parameters("searchKeyword")
    public void searchTest(String searchKeyword) {
        // Open Google
        driver.get("https://www.google.com");

        // Enter search keyword
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchKeyword);
        searchBox.sendKeys(Keys.ENTER);

        // Get search result text
        WebElement searchResult = driver.findElement(By.id("search"));
        String searchResultText = searchResult.getText();

        // Assert that the search result contains the search keyword
        Assert.assertTrue(searchResultText.contains(searchKeyword),
                "Search result does not contain the search keyword: " + searchKeyword);

}}
