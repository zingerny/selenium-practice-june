package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class LocateElementByLinkText {
    public void testCase(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.webstaurantstore.com/");
        driver.findElement(By.partialLinkText("Restaurant Equipment")).click();
        Assert.assertTrue(driver.getTitle().contains("Restaurant Equipment"));
    }
}
