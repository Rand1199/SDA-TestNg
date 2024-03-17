package sda.homworks.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sda.utilities.TestBase;

public class Hw02 extends TestBase {
   @Test
    public void test(){
       driver.get("https://vziad3.github.io/todo-app/todo-app.html");

       // Check todo boxes for items todo-4 and todo-5
       WebElement todo4 = driver.findElement(By.name("todo-4"));
       WebElement todo5 = driver.findElement(By.name("todo-5"));
       todo4.click();
       todo5.click();

       // Assert the length of the todo list to be 2
       int expectedLength = 2;
       int actualLength = driver.findElements(By.xpath("//*[@class='done-true']")).size();
       Assert.assertEquals(actualLength,expectedLength, "Todo list length is incorrect");

       String name = "rand";
      driver.findElement(By.id("todotext")).sendKeys(name+Keys.ENTER);
      Assert.assertFalse(driver.findElements(By.xpath("//*[contains(text(),'" + name + "')]")).isEmpty());

       driver.findElement(By.xpath("//a[contains(text(),'archive')]")).click();
       Assert.assertEquals(driver.findElements(By.xpath("//span[@class=\"done-true\"]")).size(), 0);





   }
}
