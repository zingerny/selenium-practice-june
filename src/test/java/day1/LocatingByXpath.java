package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LocatingByXpath {
    // 8 locators in Selenium: id , name, className, linkText, partialLinkText, xpath, CssSelector
@Test
    public void test1() throws InterruptedException {

        WebDriver driver = null;
try{
// basic syntax of xpath: //elementName[@attribute='value']
    // examples //
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://www.google.com/");
WebElement buttonFeelingLucky = driver.findElement(By.xpath("//input[@id='gbqfbb']"));
Thread.sleep(500);
buttonFeelingLucky.isDisplayed();


}finally {
    driver.quit();
}
    }
}

