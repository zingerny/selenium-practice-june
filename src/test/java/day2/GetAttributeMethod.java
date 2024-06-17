package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GetAttributeMethod {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.webstaurantstore.com/");

        WebElement searchBox = driver.findElement(By.name("searchval"));
        System.out.println(searchBox.getAttribute("aria-label"));


        String expected = "What are you looking for?";
        String actual = searchBox.getAttribute("placeholder");

        Assert.assertEquals(actual, expected);


        String term ="table";
        driver.findElement(By.id("searchval")).sendKeys(term, Keys.ENTER);
        String actualQty=driver.findElement(By.xpath("//input[@name='qty']")).getAttribute("value");
        Assert.assertEquals(actualQty, "1");

        // Find all links on the page and print their urls
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link : links) {
            System.out.println(link.getAttribute("href"));
        }


    }
}
