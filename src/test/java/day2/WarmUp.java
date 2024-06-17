package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WarmUp {
@Test
    public void testCase(){

        // go to https://www.webstaurantstore.com/
        // search for a product
        //verify  default result per page is 60
        // verify the product titles contain the search term

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.webstaurantstore.com/");

        String term = "table";
        driver.findElement(By.id("searchval")).sendKeys(term, Keys.ENTER);

     //   List<WebElement> titles = driver.findElements(By.xpath("//span[@data-testid='itemDescription']")); // use a method that will find those
        List<WebElement> titles =  SeleniumUtils.locateByDataTestIdMultiple(driver,"span", "itemDescription");
        Assert.assertEquals(titles.size(), 60);

    for (WebElement title : titles) {
        System.out.println(title.getText());
        Assert.assertTrue(title.getText().toLowerCase().contains(term));
    }

    // Verify the last element on the page title text matches
    WebElement lastElement = titles.get(titles.size()-1);
    String expected = lastElement.getText();
    lastElement.click();
    String actual =  driver.findElement(By.id("page-header-description")).getText();
    Assert.assertEquals(actual,expected);

    }
}

