package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LocatingByClass {
    // 8 locators in Selenium: id , name, className, linkText, partialLinkText, xpath, CssSelector
@Test
    public void test1(){

        WebDriver driver = null;
try{

    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://www.google.com/");
   driver.findElement(By.name("q")).sendKeys("Dragon", Keys.ENTER);
 // classnames are normally are not unique  usually used to locate all elements with that classname using findElements()
    //findElement finds the first element that matches the criteria
    System.out.println(driver.findElement(By.className("yuRUbf")).getText());

   List <WebElement> divs =  driver.findElements(By.className("yuRUbf"));
    for (WebElement div : divs) {
        System.out.println(div.getText());
    }




    List<WebElement> h3s =  driver.findElements(By.className("LC20lb"));
    for (WebElement h3 : h3s) {
        System.out.println(h3.getText());
        if( !h3.getText().isEmpty())
        Assert.assertTrue(h3.getText().toLowerCase().contains("dragon"));

    }

}finally {
    driver.quit();
}
    }
}
