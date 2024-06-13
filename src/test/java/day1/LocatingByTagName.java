package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LocatingByTagName {
    // 8 locators in Selenium: id , name, className, linkText, partialLinkText, xpath, CssSelector
@Test
    public void test1(){

        WebDriver driver = null;
try{

    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://www.google.com/");
   driver.findElement(By.name("q")).sendKeys("Dragon", Keys.ENTER);

WebElement theFirstElementOnthePage =   driver.findElement(By.tagName("a"));
List<WebElement> links = driver.findElements(By.tagName("a"));
    for (WebElement link : links) {
        System.out.println(link.getText());
    }



}finally {
    driver.quit();
}
    }
}
